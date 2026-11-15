package com.kenrayana.projectmodul9.guided.guided3.iteration.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("Bobby", 3000));
        listEmp.add(new Employee("Erick", 1600));
        listEmp.add(new Employee("Rey", 2500));
        listEmp.add(new Employee("Anna", 3500));

        System.out.println("--- Data Awal ---");
        listEmp.forEach(System.out::println);

        // Sorting 1: Natural Order via Comparable (compareTo)
        Collections.sort(listEmp);
        System.out.println("\n--- Sorted by Name (Comparable / Natural Order) ---");
        listEmp.forEach(System.out::println);

        // Sorting 2: Custom Order via Comparator (compare)
        Collections.sort(listEmp, new SalaryComperator());
        System.out.println("\n--- Sorted by Salary (Comparator / Custom Order) ---");
        listEmp.forEach(System.out::println);
    }
}
