package com.kenrayana.projectmodul7.guided.guided3;

public abstract class Employee implements Payable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Setiap pegawai pasti punya gaji, tapi rumusnya berbeda-beda
    public abstract double earnings();

    //Saat ada penagihan, alihkan langsung ke metode kalkulasi gai (earnings)
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
