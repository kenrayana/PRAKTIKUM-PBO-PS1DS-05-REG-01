package com.kenrayana.projectmodul10.uguided.ug1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilihBarang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daftarBarang = {"Buku", "Pulpen", "Penghapus"};

        System.out.println("Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus");

        try {
            System.out.print("Masukkan nomor barang (0-2): ");
            int indeks = input.nextInt();
            System.out.println("Barang terpilih: " + daftarBarang[indeks]);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka bulat.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Nomor barang tidak tersedia (pilih 0-2).");
        }

        System.out.println("Proses pemilihan barang selesai.");
    }
}
