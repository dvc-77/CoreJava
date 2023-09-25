package org.unit4.exercises;

public class BinaryToDecimal {
    private int binary;

    public int convertToDecimal(int binary){
        int value = 0;
        int placeValue = 0;
        while(binary!=0){
            int rem = binary%10;
            binary /= 10;
            if(rem == 1)
                value = value + (int) Math.pow(2, placeValue);
            placeValue++;
        }
        return value;
    }
}
