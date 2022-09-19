public class Main
{
    public static void main(String[] args)
    {
        int creditCardBalance;
        double interestRate;
        double newMonthInterest;
        double secondMonthInterest;

        creditCardBalance = 5000;
        interestRate = 0.17;
        newMonthInterest = creditCardBalance * (1 + interestRate);
        System.out.println("The balance for first month is " + newMonthInterest);

        secondMonthInterest = newMonthInterest * (1 + interestRate);
        System.out.println("The balance for second month is " + secondMonthInterest);
    }
}