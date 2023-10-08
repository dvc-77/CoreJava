package org.unit8;

import static java.lang.System.*;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

    public static void main(String[] args) {

//        BigDecimal principal = BigDecimal.valueOf(1250);
//        BigDecimal rate = BigDecimal.valueOf(0.05);
//
//        out.printf("%s%20s%n", "Year", "Amount");
//
//        for(int year = 1; year <= 10; year++)  {
//            BigDecimal amount = principal.multiply(rate.add(BigDecimal.valueOf(year)));
//            out.printf("%4d%20s%n", year,
//                    NumberFormat.getCurrencyInstance().format(amount));
//        }

        String phrase = "This-is-a-Test";
        String fmtString = phrase.replace("-", "").toLowerCase();

        out.println(fmtString);

   }
}
