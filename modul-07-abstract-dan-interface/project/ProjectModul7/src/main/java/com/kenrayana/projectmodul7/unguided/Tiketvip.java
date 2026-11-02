package com.kenrayana.projectmodul7.unguided;

public class Tiketvip extends Tiketbioskop {
    private double biayaFasilitasVIP; // dikenakan per kursi
 
    public Tiketvip(String judulFilm, double hargaDasar, int jumlahKursi, double biayaFasilitasVIP) {
        super(judulFilm, hargaDasar, jumlahKursi);
        this.biayaFasilitasVIP = biayaFasilitasVIP;
    }
 
    public double getBiayaFasilitasVIP() {
        return biayaFasilitasVIP;
    }
 
    @Override
    public double hitungTotalBayar() {
        return (getHargaDasar() + biayaFasilitasVIP) * getJumlahKursi();
    }
 
    @Override
    public String getNamaTransaksi() {
        return "Tiket VIP Premiere - " + getJudulFilm()
                + " (" + getJumlahKursi() + " x Rp" + (getHargaDasar() + biayaFasilitasVIP) + ")";
    }
}
