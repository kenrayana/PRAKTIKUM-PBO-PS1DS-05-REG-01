package com.kenrayana.projectmodul6.guided.guided2;

public class Employee {
    private String name;
    String departemen;
    
    public Employee(String name){
        this.name = name;
    }
    
    public void tampilNama(){
        System.out.println("nama: " + name);
    }
}
