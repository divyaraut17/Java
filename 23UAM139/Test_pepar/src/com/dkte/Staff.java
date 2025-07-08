package com.dkte;
import java.util.Scanner;

public class Staff {
    private int id;
    private String name;

    public Staff() {}

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Staff [ID=" + id + ", Name=" + name + "]";
    }
}