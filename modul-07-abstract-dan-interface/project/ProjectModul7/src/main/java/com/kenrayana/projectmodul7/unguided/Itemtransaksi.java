package com.kenrayana.projectmodul7.unguided;

public interface Itemtransaksi {
     // Kontrak publik kasir
    double getNominalBayar();
    String getNamaTransaksi();
 
    // Default method (Java 8+): mencetak satu baris struk
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }
 
    // Static method (Java 8+): dipanggil lewat nama interface
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}
