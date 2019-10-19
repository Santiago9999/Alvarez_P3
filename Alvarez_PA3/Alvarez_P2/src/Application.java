public class Application {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);


        saver1.calculateMonthlyInterest(saver1, 12);
        double balance = saver1.getsavings();
        System.out.println("Saver1's Monthly Balance: " + balance);
        saver2.calculateMonthlyInterest(saver2, 12);
        balance = saver2.getsavings();
        System.out.println("Saver2's Monthly Balance: " + balance);

        SavingsAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest(saver1, 1);
        balance = saver1.getsavings();
        System.out.println("Saver1's Monthly Balance: " + balance);
        saver2.calculateMonthlyInterest(saver2, 1);
        balance = saver2.getsavings();
        System.out.println("Saver2's Monthly Balance: " + balance);
    }
}
