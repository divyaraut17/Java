package com.dkte;
import java.util.Scanner;

public class LabStaff extends Staff {
    private double salary;

    public LabStaff() {}

    public LabStaff(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        this.salary = sc.nextDouble();
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary=" + salary;
    }
}