package org.unit3;
import java.util.Scanner;
import static java.lang.System.*;

// Custom imports for exercises
import org.unit3.exercises.*;

// Driver Class: Where the code is run
public class AccountTest {
    public static void main(String[] args) {
//        Account account1 = new Account("Jane Green");
//        out.println("The name of this account user is: " + account1.getName());

        Scanner input = new Scanner(in);

//        out.print("Please enter a new name: ");
//        String name = input.nextLine();
//
//        account1.setName(name);
//        out.println("The name of this new account user is: " + account1.getName());

        ModifiedAccount account2 = new ModifiedAccount(29122);

        out.print("Please enter amount to withdraw: ");
        double amount = input.nextDouble();

        out.println(account2.withdrawal(amount));

        input.close();
    }
}
