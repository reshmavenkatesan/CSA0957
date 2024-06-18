import java.util.Scanner;

public class CollegeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of users in the college: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter the total number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaffUsers = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;
        System.out.println("Total number of users in the college: " + totalUsers);
        System.out.println("Number of staff users: " + staffUsers);
        System.out.println("Number of non-teaching staff users: " + nonTeachingStaffUsers);
        System.out.println("Number of student users: " + studentUsers);
        scanner.close();
    }
}
