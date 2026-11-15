package com.kenrayana.projectmodul9.guided.guided3.iteration.filtering;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return String.format("Mhs[NIM=%s, Nama=%-6s, IPK=%.2f]", nim, nama, ipk);
    }
}
