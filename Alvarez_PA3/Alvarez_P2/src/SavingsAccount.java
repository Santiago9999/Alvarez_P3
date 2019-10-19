public class SavingsAccount {


    private static int annualInterestRate = 4;
    private float savingsBalance;

    public SavingsAccount(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public SavingsAccount() {
        this(0);
    }

    public float getsavings() {
        return savingsBalance;
    }

    public void setsavings(float value) {
        savingsBalance = value;
    }
    static public void modifyInterestRate (int value) {
        annualInterestRate = value;
    }
    static public float GetInterestRate () {
        return (float) (annualInterestRate*.01);
    }
    public void calculateMonthlyInterest(SavingsAccount name,int months){
        for(int i=0;i<months;i++)
        name.setsavings((float) (name.getsavings()+name.getsavings()*annualInterestRate*.01/12));

    }



}