package ln.Loan;


public class Loan {
    private String acno;
    private double amount;
    private int duration;
    public Loan(String acno,double amount,int duration){
        this.acno=acno;
        this.amount=amount;
        this.duration=duration;

    }

    public double getAmount() {
        return amount;
    }


    public int getDuration() {
        return duration;
    }
}
