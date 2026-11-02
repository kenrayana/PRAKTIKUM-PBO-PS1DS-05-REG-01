package com.kenrayana.projectmodul7.guided.guided2;

public class Main {
    public static void main(String[] args){
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("Budi", 5000000);
        
        //Dynamic dispatch: Java otomatis mengeksuksi rumus yang tepat sesuai
        for (Payable item : items){
            System.out.println("Jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
        }
    }
}
