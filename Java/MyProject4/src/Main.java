import ln.Loan.Loan;
import intcal.*;

public class Main {
    public static void main(String[] args) {
       Loan myloan=new Loan("1001",66700,2);
       InterestCalculation ic=new InterestCalculation();
       ic.calculateInterest(myloan.getAmount(),myloan.getDuration());
        }


    }
