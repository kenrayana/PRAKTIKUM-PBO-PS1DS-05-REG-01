package com.kenrayana.projectmodul5;

import guided.agregasi.*;
import guided.komposisi.*;
import com.kenrayana.projectmodul5.unguided.*;

public class ProjectModul5 {

    public static void main(String[] args) {
        runGuided2();
        runGuided3();
        runUnguided();
    }
    
    public static void runGuided2(){
        Mahasiswa m1 = new Mahasiswa("103132430008", "Ken Rayana");
        Mahasiswa m2 = new Mahasiswa("103132430010", "John Dae");
        
        Jurusan prodi = new Jurusan("SD", "SainsData");
        
        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);
        
        prodi.displayMahasiswa();
    }
    
    public static void runGuided3() {
        Komputer pc = new Komputer("Intel Core i5", 3200, "LG 24 Inch", "Logitech", "Wireless");
        pc.displaySpecKomputer();
    }
    
    public static void runUnguided() {
        // 1. Kasir
        Kasir kasir = new Kasir("Budi");
 
        // 2. ItemPesanan dibuat independen (RincianHarga dibuat otomatis di dalamnya)
        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);
 
        // 3. Pesanan Meja 4, kapasitas 5 item
        Pesanan pesanan = new Pesanan(4, 5);
 
        // 4. Masukkan item ke pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);
 
        // 5. Tampilkan pesanan
        pesanan.tampilkanPesanan();
 
        // 6. Proses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}