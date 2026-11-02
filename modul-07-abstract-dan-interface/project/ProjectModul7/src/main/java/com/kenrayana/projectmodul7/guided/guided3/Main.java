package com.kenrayana.projectmodul7.guided.guided3;

public class Main {
    public static void main(String[] args){
        Payable.logTransaction("Sistem pembayaran di inisialisasi.");
        
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Ram DDR 5 16GB", 2, 2000000);
        items[1] = new SalariedEmployee("Budi", 5000000);
        
        for (Payable item : items){
            item.printReceipt();
        }
        
        Payable.logTransaction("Transaksi selesai diproses.");
        
    }
}
