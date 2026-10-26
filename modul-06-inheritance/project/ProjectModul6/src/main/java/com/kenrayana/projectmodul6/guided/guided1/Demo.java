package com.kenrayana.projectmodul6.guided.guided1;

public class Demo {
    public static void main(String[] args){
        A superclass = new A();
        B subclass = new B();
        
        superclass.x = 5;
        superclass.y = 3;
        
        System.out.println("Superclass: ");
        superclass.tampilXY();
        
        subclass.x = 1;
        subclass.y = 2;
        subclass.z = 5;
        
        System.out.println("Subclass: ");
        subclass.jumlahXYZ();
    }
}