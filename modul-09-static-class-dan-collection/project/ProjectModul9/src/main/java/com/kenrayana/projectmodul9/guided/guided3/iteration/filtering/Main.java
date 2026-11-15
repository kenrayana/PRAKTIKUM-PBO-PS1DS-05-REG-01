package com.kenrayana.projectmodul9.guided.guided3.iteration.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();
        list.add(new Mahasiswa("001", "Bobby", 3.25));
        list.add(new Mahasiswa("002", "Erick", 2.80));
        list.add(new Mahasiswa("003", "Rey", 3.75));
        list.add(new Mahasiswa("004", "Anna", 3.90));

        System.out.println("=== 1. FILTERING (IPK >= 3.50) ===");

        // --- Pendekatan 1: Imperatif (Konvensional) ---
        System.out.println("Cara Konvensional:");
        List<Mahasiswa> mhsCumlaudeKonven = new ArrayList<>();
        for (Mahasiswa m : list) {
            if (m.getIpk() >= 3.50) {
                mhsCumlaudeKonven.add(m);
            }
        }
        for (Mahasiswa m : mhsCumlaudeKonven) {
            System.out.println(m);
        }

        // --- Pendekatan 2: Deklaratif (Stream API) ---
        System.out.println("\nCara Stream API:");
        List<Mahasiswa> mhsCumlaudeStream = list.stream()
                .filter(m -> m.getIpk() >= 3.50)
                .collect(Collectors.toList());
        mhsCumlaudeStream.forEach(System.out::println);

        System.out.println("\n=== 2. SEARCHING / PENCARIAN TUNGGAL ===");

        // --- Pencarian Konvensional ---
        System.out.println("Cara Konvensional (Cari 'Erick'):");
        Mahasiswa targetKonven = null;
        for (Mahasiswa m : list) {
            if (m.getNama().equalsIgnoreCase("Erick")) {
                targetKonven = m;
                break; // Hentikan loop saat ditemukan
            }
        }
        System.out.println(targetKonven != null ? targetKonven : "Data tidak ditemukan");

        // --- Pencarian via Stream API ---
        System.out.println("\nCara Stream API (Cari 'Erick'):");
        Mahasiswa targetStream = list.stream()
                .filter(m -> m.getNama().equalsIgnoreCase("Erick"))
                .findFirst()
                .orElse(null);
        System.out.println(targetStream != null ? targetStream : "Data tidak ditemukan");
    }
}