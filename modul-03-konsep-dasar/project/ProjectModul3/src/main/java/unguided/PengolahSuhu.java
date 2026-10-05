package unguided;

public class PengolahSuhu {

    // Class field: milik class, dipakai bersama semua object, nilainya tidak bisa diubah
    private static final double NILAI_KOSONG = -1.0;

    // Instance field: berbeda untuk setiap object
    private double[] suhuHarian;

    // Nama parameter sama dengan nama field, jadi 'this' dipakai secara eksplisit
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian; // menyimpan REFERENSI, bukan salinan
    }

    // Kebutuhan 3: tampilkan semua data, hari kosong ditandai
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                double bulat = Math.round(suhuHarian[i] * 10) / 10.0;
                System.out.println("Hari " + (i + 1) + " : " + bulat + "°C");
            }
        }
    }

    // Kebutuhan 4: cari index hari kosong, -1 jika tidak ada
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    // Kebutuhan 5: isi hari kosong dengan rata-rata hari sebelum dan sesudahnya
    public void isiDataKosong() {
        int i = cariIndexKosong();
        if (i != -1) {
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }

    // Kebutuhan 6: rata-rata suhu dari data yang sudah bersih
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }

    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        System.out.println();

        pengolah.isiDataKosong();

        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        double rata = Math.round(pengolah.hitungRataRata() * 100) / 100.0;
        System.out.println("Rata-rata : " + rata + "°C");
        System.out.println();

        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.print("[");
        for (int i = 0; i < suhuHarian.length; i++) {
            System.out.print(Math.round(suhuHarian[i] * 10) / 10.0);
            if (i < suhuHarian.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

    }
}