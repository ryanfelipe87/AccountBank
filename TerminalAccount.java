import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        Locale localeBr = new Locale("pt", "BR");

        NumberFormat money = NumberFormat.getCurrencyInstance(localeBr);

        String nameClient;
        String agency;
        int numberAccount;
        Double balance;

        System.out.println("======================================");
        System.out.println("============ Account Bank ============");
        System.out.println("\n Welcome to your account");
        System.out.println("\n Register your account: \n");

        System.out.println("Insert your complete name: ");
        nameClient = enter.nextLine();

        System.out.println("\nThe agency: ");
        agency = enter.nextLine();

        System.out.println("\nNumber of your account: ");
        numberAccount = enter.nextInt();

        System.out.println("\nYour current balance: ");
        balance = enter.nextDouble();

        System.out.printf("\nHello, " + nameClient + "! Thank you for creating an account with our bank. Your agency is "
                + agency +", number your account is " + numberAccount +
                " and your balance " + money.format(balance) + " is ready for withdraw.");

        System.out.println("\n ======================================");
    }
}
