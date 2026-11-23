package com.kenrayana.projectmodul10.guided.guided2;

import java.io.FileReader;
import java.io.IOException;
public class DemoChecked {
    public static void main(String[] args){
        
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("File berhasil dibuka");
        }catch(IOException e){
            System.out.println("Terjadi ekspesi");
        }
        
        System.out.println("Program selesai");
        
    }
}
