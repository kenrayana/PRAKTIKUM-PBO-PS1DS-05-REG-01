package com.kenrayana.projectmodul10.uguided.ug2.ug3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatunganBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan total bayar: ");
            int totalBayar = input.nextInt();
            System.out.print("Masukkan jumlah orang: ");
            int jumlahOrang = input.nextInt();

            int perOrang = totalBayar / jumlahOrang;
            System.out.println("Biaya per orang: Rp " + perOrang);
        } catch (ArithmeticException e) {
            System.out.println("Error: Jumlah orang tidak boleh nol.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan nominal dan jumlah orang dalam angka.");
        } finally {
            System.out.println("Transaksi kasir selesai.");
        }
    }
}
