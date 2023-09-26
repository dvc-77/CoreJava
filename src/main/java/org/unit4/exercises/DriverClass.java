package org.unit4.exercises;
import java.util.Scanner;

import static java.lang.System.*;
public class DriverClass {
    public static void main(String[] args) {
//        CreditLimit creditLimit = new CreditLimit(1234566789);
//        creditLimit.setBalance(20000);
//        creditLimit.setCreditLimit(2000000);
//        creditLimit.setTotalCreditsApplied(10000);
//        creditLimit.setTotalAmountCharged(5600);
//        creditLimit.newBalance();
//
//        if(creditLimit.isCreditExceeded()){
//            out.println("Credit Limit Exceeded");
//        }else{
//            out.println("Credit Limit not Exceeded");
//        }
//
//        BinaryToDecimal value = new BinaryToDecimal();
        Scanner input = new Scanner(in);
//        out.print("Please enter the binary number: ");
//        int binary = input.nextInt();
//        out.printf("The decimal equivalent is: %d ", value.convertToDecimal(binary));
//

        Palindrome number = new Palindrome();
        out.print("Enter the number: ");
        int value = input.nextInt();

        out.println(number.isPalindrome(value) ? "Palindrome":"Not Palindrome");

        input.close();

    }
}
