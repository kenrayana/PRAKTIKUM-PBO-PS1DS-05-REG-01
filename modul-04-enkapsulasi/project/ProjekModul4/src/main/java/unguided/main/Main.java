package unguided.main;
import unguided.laporan.Laporan;
import unguided.model.Dataset;
public class Main {
    public static void main(String[] args) {
        // Objek 1: constructor tanpa parameter, lalu isi pakai setter
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        // Objek 2: constructor 1 parameter
        Dataset d2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        // Simpan dalam array
        Dataset[] daftar = new Dataset[3];
        daftar[0] = d1;
        daftar[1] = d2;
        daftar[2] = d3;

        // Cetak laporan dengan perulangan
        Laporan laporan = new Laporan();
        for (int i = 0; i < daftar.length; i++) {
            laporan.cetak(daftar[i]);
        }

        // Panggil method static tanpa objek
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
