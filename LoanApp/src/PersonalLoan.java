
public class PersonalLoan extends Loan {
    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeRate) {
        super(loanNumber, customerLastName, loanAmount, term);
        this.interestRate = primeRate + 2.0;
    }
}


