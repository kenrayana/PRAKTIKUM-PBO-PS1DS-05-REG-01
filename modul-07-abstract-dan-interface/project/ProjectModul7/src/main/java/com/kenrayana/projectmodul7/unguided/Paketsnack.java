package com.kenrayana.projectmodul7.unguided;

public class Paketsnack implements Itemtransaksi {
    private String namaPaket;
    private int jumlahPorsi;
    private double hargaPerPorsi;
 
    public Paketsnack(String namaPaket, int jumlahPorsi, double hargaPerPorsi) {
        this.namaPaket = namaPaket;
        this.jumlahPorsi = jumlahPorsi;
        this.hargaPerPorsi = hargaPerPorsi;
    }
 
    public String getNamaPaket() {
        return namaPaket;
    }
 
    public int getJumlahPorsi() {
        return jumlahPorsi;
    }
 
    public double getHargaPerPorsi() {
        return hargaPerPorsi;
    }
 
    @Override
    public double getNominalBayar() {
        return jumlahPorsi * hargaPerPorsi;
    }
 
    @Override
    public String getNamaTransaksi() {
        return "F&B Snack: " + namaPaket + " (" + jumlahPorsi + " x Rp" + hargaPerPorsi + ")";
    }
}