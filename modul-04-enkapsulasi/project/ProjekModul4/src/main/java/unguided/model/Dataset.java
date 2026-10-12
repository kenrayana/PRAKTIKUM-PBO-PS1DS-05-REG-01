package unguided.model;

public class Dataset {
    // Konstanta (aturan penamaan modul: huruf besar + underscore)

    public static final double BATAS_MISSING = 5.0;

    // Variabel milik class: dipakai bersama oleh semua objek
    private static int totalDataset = 0;

    // Atribut dienkapsulasi (private)
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Constructor 1: tanpa parameter
    public Dataset() {
        totalDataset++;
    }

    // Constructor 2: hanya nama
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    // Constructor 3: lengkap (memakai setter agar validasi tetap berlaku)
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
        totalDataset++;
    }

    // Method milik class: bisa dipanggil tanpa membuat objek
    public static int getTotalDataset() {
        return totalDataset;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Nilai negatif ditolak -> nilai lama tidak berubah
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Persentase sel kosong terhadap total sel (baris x kolom)
    public double getPersentaseMissing() {
        int totalSel = jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0;
        }
        return (double) jumlahMissing / totalSel * 100;
    }

    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}
