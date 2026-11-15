package com.kenrayana.projectmodul9.guided.guided1;

public class Share {
    private int privateInt;
    private static int staticInt;
    public Share(int pr, int si){
        privateInt = pr;
        staticInt = si;
    }
    
    public String toString(){
        return privateInt + " " + staticInt;
    }
}
