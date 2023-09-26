package org.unit4.exercises;

public class Palindrome {
    private int value;

    public boolean isPalindrome(int value){
        int reverseValue = 0;
        int temp = value;

        while(temp != 0){
            int rem = temp % 10;
            temp = temp / 10;
            reverseValue = (reverseValue * 10) + rem;
        }
        return reverseValue == value;
    }
}
