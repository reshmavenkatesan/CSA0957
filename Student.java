import java.util.Scanner;

class Student {
    protected String name;
    protected int[] marks = new int[6]; // marks in 6 subjects

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAggregate() {
        return (double) calculateTotal() / marks.length;
    }
}

class GradeCalculator extends Student {
    public GradeCalculator(String name, int[] marks) {
        super(name, marks);
    }

    public String calculateGrade() {
        double aggregate = calculateAggregate();
        if (aggregate > 75) {
            return "Distinction";
        } else if (aggregate >= 60 && aggregate <= 75) {
            return "First Division";
        } else if (aggregate >= 50 && aggregate <= 60) {
            return "Second Division";
        } else if (aggregate >= 40 && aggregate <= 50) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public void displayGrade() {
        int total = calculateTotal();
        double aggregate = calculateAggregate();
        String grade = calculateGrade();

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + aggregate + "%");
        System.out.println("Grade: " + grade);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        GradeCalculator student = new GradeCalculator(name, marks);
        student.displayGrade();
    }
}