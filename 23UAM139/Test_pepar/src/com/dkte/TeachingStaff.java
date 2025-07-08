package com.dkte;
import java.util.Scanner;

public class TeachingStaff extends Staff {
    private int teachingHours;

    public TeachingStaff() {}

    public TeachingStaff(int id, String name, int teachingHours) {
        super(id, name);
        this.teachingHours = teachingHours;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Teaching Hours: ");
        this.teachingHours = sc.nextInt();
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Teaching Hours=" + teachingHours;
    }
}