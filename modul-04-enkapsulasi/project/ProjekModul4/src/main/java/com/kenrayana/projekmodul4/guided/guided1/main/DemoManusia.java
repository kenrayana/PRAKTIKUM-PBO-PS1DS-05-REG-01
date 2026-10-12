package com.kenrayana.projekmodul4.guided.guided1.main;

import com.kenrayana.projekmodul4.guided.guided1.manusia.Manusia;
        
public class DemoManusia {
    public static void main(String[]args){
        Manusia arrMns[] = new Manusia[3];
        
        // Constructur pertama
        Manusia objMns1 = new Manusia();
        
        //Kedua
        Manusia objMns2 = new Manusia("John");
        
        //Ketiga
        Manusia objMns3 = new Manusia("Bajuri", 44 );
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        
        for (int i=0; i<3; i++){
            System.out.println("Nama: " + arrMns[i].getNama());
            System.out.println("Umur: " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}
