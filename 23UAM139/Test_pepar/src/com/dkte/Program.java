package com.dkte;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] stf = new Staff[10];
        int counter = 0;

        while (true) {
            System.out.println("\n1. Add Teaching Staff");
            System.out.println("2. Add Lab Staff");
            System.out.println("3. Display all Teaching Staff");
            System.out.println("4. Display all Lab Staff");
            System.out.println("5. Find specific Teaching Staff by ID");
            System.out.println("6. Find specific Lab Staff by ID");
            System.out.println("7. Display Teaching Staff with Highest Hours");
            System.out.println("8. Display Lab Staff with Highest Salary");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (counter < stf.length) {
                        stf[counter] = new TeachingStaff(); // upcasting
                        ((TeachingStaff) stf[counter]).accept(); // downcasting
                        counter++;
                    } else {
                        System.out.println("Staff capacity full!");
                    }
                    break;

                case 2:
                    if (counter < stf.length) {
                        stf[counter] = new LabStaff();
                        ((LabStaff) stf[counter]).accept();
                        counter++;
                    } else {
                        System.out.println("Staff capacity full!");
                    }
                    break;

                case 3:
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof TeachingStaff)
                            System.out.println(stf[i]);
                    }
                    break;

                case 4:
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof LabStaff)
                            System.out.println(stf[i]);
                    }
                    break;

                case 5:
                    System.out.print("Enter Teaching Staff ID to search: ");
                    int teachId = sc.nextInt();
                    boolean foundTeach = false;
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof TeachingStaff && stf[i].getId() == teachId) {
                            System.out.println("Found: " + stf[i]);
                            foundTeach = true;
                        }
                    }
                    if (!foundTeach)
                        System.out.println("Teaching Staff not found.");
                    break;

                case 6:
                    System.out.print("Enter Lab Staff ID to search: ");
                    int labId = sc.nextInt();
                    boolean foundLab = false;
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof LabStaff && stf[i].getId() == labId) {
                            System.out.println("Found: " + stf[i]);
                            foundLab = true;
                        }
                    }
                    if (!foundLab)
                        System.out.println("Lab Staff not found.");
                    break;

                case 7:
                    TeachingStaff maxHoursStaff = null;
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof TeachingStaff) {
                            TeachingStaff ts = (TeachingStaff) stf[i];
                            if (maxHoursStaff == null || ts.getTeachingHours() > maxHoursStaff.getTeachingHours()) {
                                maxHoursStaff = ts;
                            }
                        }
                    }
                    System.out.println("Teaching Staff with Highest Hours: " + maxHoursStaff);
                    break;

                case 8:
                    LabStaff maxSalaryStaff = null;
                    for (int i = 0; i < counter; i++) {
                        if (stf[i] instanceof LabStaff) {
                            LabStaff ls = (LabStaff) stf[i];
                            if (maxSalaryStaff == null || ls.getSalary() > maxSalaryStaff.getSalary()) {
                                maxSalaryStaff = ls;
                            }
                        }
                    }
                    System.out.println("Lab Staff with Highest Salary: " + maxSalaryStaff);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}