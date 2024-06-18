import java.util.Scanner;
public class weeksdaysyears {
  public static void main(String[] args) {
    int ndays = 0;
    int years = 0;
    int weeks = 0;
    int days = 0;
    Scanner X = new Scanner(System.in);
    System.out.print("Enter days: ");
    ndays = X.nextInt();
    years = ndays / 365;
    weeks = (ndays % 365) / 7;
    days = (ndays % 365) % 7;
    System.out.printf("%d years, %d weeks and %d days\n", years, weeks, days);
  }
}
