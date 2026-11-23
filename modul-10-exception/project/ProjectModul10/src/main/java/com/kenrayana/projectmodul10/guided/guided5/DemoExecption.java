package com.kenrayana.projectmodul10.guided.guided5;

public class DemoExecption {
    public static void main(String[] args){
        Cobajava c = new Cobajava();
        
        try{
            c.tampil();
        } catch (Exception e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Program Selesai");
    }
}
