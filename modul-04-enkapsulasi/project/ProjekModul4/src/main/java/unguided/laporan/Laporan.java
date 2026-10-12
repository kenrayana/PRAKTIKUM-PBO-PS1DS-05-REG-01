package unguided.laporan;
import java.util.Locale;
import unguided.model.Dataset;
public class Laporan {
    public void cetak(Dataset d) {
        String status = d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";

        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.println("Missing      : " + d.getJumlahMissing() + " sel ("
                + String.format(Locale.US, "%.2f", d.getPersentaseMissing()) + "%)");
        System.out.println("Status       : " + status);
        System.out.println();
    }
}
