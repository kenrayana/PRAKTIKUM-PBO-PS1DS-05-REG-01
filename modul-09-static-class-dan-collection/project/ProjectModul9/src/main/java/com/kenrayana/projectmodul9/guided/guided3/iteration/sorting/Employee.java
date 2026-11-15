package com.kenrayana.projectmodul9.guided.guided3.iteration.sorting;

public class Employee implements Comparable<Employee> {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Default sorting: Berdasarkan nama (A-Z)
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%-6s, salary=%d]", name, salary);
    }
}
