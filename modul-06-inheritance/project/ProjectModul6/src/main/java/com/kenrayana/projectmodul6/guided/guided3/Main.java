package com.kenrayana.projectmodul6.guided.guided3;

public class Main {
    public static void main(String[] args){
        Lagu d,e;
        d = new Lagu();
        e = new Lagu();
        
        d.IsiParam("Lagu 1");
        e.IsiParam("Lagu 2", "aku");
        
        d.tampilkan();
        e.tampilkan();
    }
}
