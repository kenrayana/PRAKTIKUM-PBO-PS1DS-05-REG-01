package com.kenrayana.projectmodul7.unguided;

public class Main {

    public static void main(String[] args) {
        // 1. Uji proteksi abstraksi (akan error jika tidak dikomentari)
        // TiketBioskop tiket = new TiketBioskop("Test", 50000, 1);

        // 2. Buka kasir
        Itemtransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3 & 4. Objek transaksi dalam array polimorfik heterogen
        Itemtransaksi[] keranjang = new Itemtransaksi[3];
        keranjang[0] = new Tiketreguler("Interstellar", 40000, 2, 3);
        keranjang[1] = new Tiketvip("Dune: Part Two", 60000, 2, 25000);
        keranjang[2] = new Paketsnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 5. Pemrosesan dinamis
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;
        for (Itemtransaksi item : keranjang) {
            item.cetakRincianItem();
            grandTotal += item.getNominalBayar();
        }

        // 6. Tutup kasir
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        Itemtransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
