package com.kenrayana.projectmodul9.guided.guided3.iteration.sorting;

import java.util.Comparator;

public class SalaryComperator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}
