package com.kenrayana.projectmodul3.guided;
public class Circle {
    public static final double PI = 3.14159;
    
    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }
    
    public double r;
    
    public double area() {
        return PI * r * r;
    }
    
    public double circumference() {
        return 2 * PI * r;
    }

    // Tambahkan main method di bawah ini
    public static void main(String[] args) {
        // Menguji static method
        System.out.println("1 Radian ke Derajat: " + Circle.radiansToDegrees(1));

        // Membuat objek dari class Circle
        Circle c = new Circle();
        c.r = 7; // Menentukan jari-jari

        // Menampilkan hasil perhitungan area & circumference
        System.out.println("Luas lingkaran: " + c.area());
        System.out.println("Keliling lingkaran: " + c.circumference());
    }
}