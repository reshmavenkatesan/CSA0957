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

// Derived class: GradeCalculator
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

// Main class
public class Main {
    public static void main(String[] args) {
        int[] marks = {80, 70, 90, 85, 75, 95}; // example marks
        GradeCalculator student = new GradeCalculator("John Doe", marks);
        student.displayGrade();
    }
}