package com.kenrayana.projectmodul7.guided.guided1;

public class Main {
    public static void main(String[] args){
        SalariedEmployee salaried = new SalariedEmployee("Budi", 5000000);
        System.out.println("Nama: " + salaried.getName());
        System.out.println("Gaji: Rp" + salaried.earnings());
    }
}
