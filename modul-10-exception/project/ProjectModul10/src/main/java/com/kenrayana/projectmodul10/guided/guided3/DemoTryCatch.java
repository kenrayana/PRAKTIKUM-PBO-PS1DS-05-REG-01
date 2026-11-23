package com.kenrayana.projectmodul10.guided.guided3;

public class DemoTryCatch {
    public static void main(String[] args){
        try{
            int[] arr = new int[1];
            
            System.out.println(arr[1]);
            System.out.println("Baris tidak pernah dieksekusi");
        }catch (Exception e){
            // TODO; handle exception
            System.out.println("Terjadi eksepsi karena indeks tidak valid");
        }
        System.out.println("Program Selesai");
    }
}
