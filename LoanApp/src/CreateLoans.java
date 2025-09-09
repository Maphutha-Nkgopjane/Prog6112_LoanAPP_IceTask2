
import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current prime interest rate (%): ");
        double primeRate = sc.nextDouble();

        Loan[] loans = new Loan[5];

        for (int i = 0; i < loans.length; i++) {
            System.out.println("\nEnter details for Loan " + (i + 1) + ":");

            System.out.print("Loan number: ");
            int loanNumber = sc.nextInt();

            System.out.print("Customer last name: ");
            String lastName = sc.next();

            System.out.print("Loan amount (max R100000): ");
            double amount = sc.nextDouble();

            System.out.print("Term (1, 3, or 5 years): ");
            int term = sc.nextInt();

            System.out.print("Enter loan type (1 = Business, 2 = Personal): ");
            int type = sc.nextInt();

            if (type == 1) {
                loans[i] = new BusinessLoan(loanNumber, lastName, amount, term, primeRate);
            } else {
                loans[i] = new PersonalLoan(loanNumber, lastName, amount, term, primeRate);
            }
        }

        System.out.println("\nAll Loans Created:");
        for (Loan loan : loans) {
            System.out.println(loan);
        }

        sc.close();
    }
}
