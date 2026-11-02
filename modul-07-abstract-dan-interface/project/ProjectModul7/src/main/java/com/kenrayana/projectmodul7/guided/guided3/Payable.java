package com.kenrayana.projectmodul7.guided.guided3;

public interface Payable {
    double getPaymentAmount();
    
    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp" + getPaymentAmount());
    }
    
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG]" + message);
    }
}
