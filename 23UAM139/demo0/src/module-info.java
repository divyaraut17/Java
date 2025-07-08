/**
 * 
 */
/**
 * 
 */
module demo0 {
}
Here's a Java implementation of the College Staff Management System:

```
import java.util.Scanner;

// Custom exception class
class StaffException extends Exception {
    public StaffException(String message) {
        super(message);
    }
}

// Staff class
class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// TeachingStaff class
class TeachingStaff extends Staff {
    private int noOfHours;
    private double chargesPerHour;

    public TeachingStaff(int id, String name, int noOfHours, double chargesPerHour) throws StaffException {
        super(id, name);
        if (noOfHours <= 0) {
            throw new StaffException("Number of hours must be greater than 0");
        }
        if (chargesPerHour <= 0) {
            throw new StaffException("Charges per hour must be greater than 0");
        }
        this.noOfHours = noOfHours;
        this.chargesPerHour = chargesPerHour;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public double getChargesPerHour() {
        return chargesPerHour;
    }
}

// LabStaff class
class LabStaff extends Staff {
    private double salary;

    public LabStaff(int id, String name, double salary) throws StaffException {
        super(id, name);
        if (salary <= 0) {
            throw new StaffException("Salary must be greater than 0");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class CollegeStaffManagementSystem {
    private static Staff[] staffArray = new Staff[10];
    private static int staffIndex = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Teaching staff");
            System.out.println("2. Add Lab staff");
            System.out.println("3. Display all Teaching staff");
            System.out.println("4. Display all Lab staff");
            System.out.println("5. Find specific teaching staff");
            System.out.println("6. Find specific lab staff");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addTeachingStaff();
                    break;
                case 2:
                    addLabStaff();
                    break;
                case 3:
                    displayTeachingStaff();
                    break;
                case 4:
                    displayLabStaff();
                    break;
                case 5:
                    findTeachingStaff();
                    break;
                case 6:
                    findLabStaff();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void addTeachingStaff() {
        try {
            System.out.print("Enter staff id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Enter staff name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of hours: ");
            int noOfHours = scanner.nextInt();
            System.out.print("Enter charges per hour: ");
            double chargesPerHour = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            TeachingStaff teachingStaff = new TeachingStaff(id, name, noOfHours, chargesPerHour);
            staffArray[staffIndex++] = teachingStaff;
            System.out.println("Teaching staff added successfully!");
        } catch (StaffException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addLabStaff() {
        try {
            System.out.print("Enter staff id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Enter staff name: ");
            String name = scanner.nextLine();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            LabStaff labStaff = new LabStaff(id, name, salary);
            staffArray[staffIndex++] = labStaff;
            System.out.println("Lab staff added successfully!");
        } catch (StaffException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayTeachingStaff() {
        for (Staff staff : staffArray) {
            if (staff instanceof TeachingStaff) {
                TeachingStaff teachingStaff = (TeachingStaff) staff;
```