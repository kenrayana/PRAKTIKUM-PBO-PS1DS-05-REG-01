package com.kenrayana.projectmodul9.uguided;

public class HasilEksperimen implements Comparable<HasilEksperimen> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    // static variable: dipakai bersama oleh semua objek
    private static int jumlahEksperimen = 0;

    public HasilEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++; // bertambah setiap objek baru dibuat
    }

    // static method: dipanggil lewat nama kelas
    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    // Urutan default: akurasi tertinggi -> terendah
    @Override
    public int compareTo(HasilEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}

