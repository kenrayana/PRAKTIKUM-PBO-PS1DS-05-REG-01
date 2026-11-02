package com.kenrayana.projectmodul7.unguided;

public abstract class Tiketbioskop implements Itemtransaksi {

    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    public Tiketbioskop(String judulFilm, double hargaDasar, int jumlahKursi) {
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // Logika internal spesifik tiket
    public abstract double hitungTotalBayar();

    // Sudah dideklarasikan di ItemTransaksi, di sini ditegaskan sebagai abstract
    @Override
    public abstract String getNamaTransaksi();

    // Perwujudan kontrak publik kasir
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}
