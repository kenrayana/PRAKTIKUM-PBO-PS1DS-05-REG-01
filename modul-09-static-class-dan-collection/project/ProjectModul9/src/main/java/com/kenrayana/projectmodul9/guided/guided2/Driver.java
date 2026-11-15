package com.kenrayana.projectmodul9.guided.guided2;

public class Driver {
    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            if(i%2==0){
                CounterMachine.count();
            }
        }
        
        System.out.println(CounterMachine.counter);
    }
}
