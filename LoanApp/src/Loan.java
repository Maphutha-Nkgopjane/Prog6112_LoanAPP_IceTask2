
public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerLastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;

        if (loanAmount > MAX_LOAN_AMOUNT) {
            this.loanAmount = MAX_LOAN_AMOUNT;
        } else {
            this.loanAmount = loanAmount;
        }

        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    public double calculateTotalOwed() {
        return loanAmount + (loanAmount * (interestRate / 100) * term);
    }

    @Override
    public String toString() {
        return "Loan Number: " + loanNumber +
               ", Customer: " + customerLastName +
               ", Amount: R" + loanAmount +
               ", Interest Rate: " + interestRate + "%" +
               ", Term: " + term + " years" +
               ", Total Owed: R" + String.format("%.2f", calculateTotalOwed());
    }
}


