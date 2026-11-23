package com.kenrayana.projectmodul10.guided.guided4;

public class DemoMultipleCatch {
    public static void main(String[] args){
       try{
        int x = 0;
        int y = 100/x;
        
        int[]arr ={10,11};
        y = arr[x];
        
        System.out.println("Tidak Ada Eksepsi");
       } catch(ArithmeticException e){
           // TODO: handle exception
           System.out.println("Exception karena gabisa dibagi dgn 0");
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Exception karena indeks tidak valid");
       }
       System.out.println("Program Selesai");
    }
}
