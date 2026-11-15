package com.kenrayana.projectmodul9.uguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainEksperimen {

    public static void main(String[] args) {
        List<HasilEksperimen> list = new ArrayList<>();
        list.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        list.add(new HasilEksperimen("Random Forest", 0.91, 45));
        list.add(new HasilEksperimen("SVM", 0.87, 60));
        list.add(new HasilEksperimen("KNN", 0.79, 5));
        list.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen (static method)
        System.out.println("\n Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // 2. Sort default (Comparable): akurasi tertinggi
        Collections.sort(list);
        System.out.println("\n Sorted by akurasi");
        list.forEach(System.out::println);

        // 3. Sort pakai Comparator: waktu training tercepat
        Collections.sort(list, new WaktuComprator());
        System.out.println("\n Sorted by waktu training");
        list.forEach(System.out::println);

        // 4. Filtering akurasi >= 0.85 (lambda)
        System.out.println("\n Model dengan akurasi minimal 0.85");
        List<HasilEksperimen> hasilFilter = list.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        hasilFilter.forEach(System.out::println);

        // 5. Pencarian "KNN" (lambda), null jika tidak ditemukan
        System.out.println("\n Pencarian model KNN");
        System.out.println(list.stream()
                .filter(e -> e.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null));
    }
}
