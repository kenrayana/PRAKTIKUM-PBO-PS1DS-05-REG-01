package com.kenrayana.projectmodul10.guided.guided6;

public class DemoFinally {
    public static void main(String[] args){
        int x =3;
        int[] arr= {10,11,12};
        
        try{
            System.out.println(arr[x]);
            System.out.println("tidak ada execption");
        } catch (ArrayIndexOutOfBoundsException e){
            //TODO: handle exception
            System.out.println("Ada Exception");
            System.out.println(arr[x-4]);
        } finally{
            System.out.println("Program selesai");
        }
    }
}
