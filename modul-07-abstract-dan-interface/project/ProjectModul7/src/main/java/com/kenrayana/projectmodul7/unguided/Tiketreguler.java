package com.kenrayana.projectmodul7.unguided;

public class Tiketreguler extends Tiketbioskop {
    private int nomorStudio;
 
    public Tiketreguler(String judulFilm, double hargaDasar, int jumlahKursi, int nomorStudio) {
        super(judulFilm, hargaDasar, jumlahKursi);
        this.nomorStudio = nomorStudio;
    }
 
    public int getNomorStudio() {
        return nomorStudio;
    }
 
    @Override
    public double hitungTotalBayar() {
        return getHargaDasar() * getJumlahKursi();
    }
 
    @Override
    public String getNamaTransaksi() {
        return "Tiket Reguler (Studio " + nomorStudio + ") - " + getJudulFilm()
                + " (" + getJumlahKursi() + " x Rp" + getHargaDasar() + ")";
    }
}
