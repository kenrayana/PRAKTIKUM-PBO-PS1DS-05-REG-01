package unguided;

public class SistemRekapNilai {
  public static void main(String[] args) {

        // Konstanta KKM
        final double KKM = 75.0;

        // Array 1 Dimensi untuk menyimpan nama mahasiswa
        String[] namaMahasiswa = {
            "Andi",
            "Budi",
            "Citra"
        };

        // Array 2 Dimensi Rectangular untuk menyimpan nilai 2 modul
        double[][] nilaiModul = {
            {80.0, 85.0},
            {70.0, 75.0},
            {60.0, 70.0}
        };

        // Menampilkan judul
        System.out.println("REKAP NILAI MAHASISWA");

        // Perulangan untuk mengakses data mahasiswa
        for (int i = 0; i < namaMahasiswa.length; i++) {

            // Menghitung rata-rata dari dua nilai modul
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2;

            // Percabangan untuk menentukan status kelulusan
            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Menampilkan hasil
            System.out.println("Nama       : " + namaMahasiswa[i]);
            System.out.println("Modul 1    : " + nilaiModul[i][0]);
            System.out.println("Modul 2    : " + nilaiModul[i][1]);
            System.out.println("Rata-rata  : " + rataRata);
            System.out.println("Status     : " + status);
        }
    }
}

