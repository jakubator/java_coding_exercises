package com.techreturners.exercise001;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Character;
//import String;

public class Exercise001 {
    public String capitalizeWord(String word) {
        char ch1 = word.charAt(0);
        boolean charCheck = Character.isUpperCase(ch1);
        if (charCheck) {
            return word;
        }
        else {
            String capWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            return capWord;
        }
    }

    public String generateInitials(String firstName, String lastName) {
        char ch1 = firstName.charAt(0);
        String fname=String.valueOf(ch1);
        char ch2 = lastName.charAt(0);
        String lname=String.valueOf(ch2);
        String initials = fname.toUpperCase() + '.' + lname.toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double withVat = originalPrice + (originalPrice*(vatRate/100));
        BigDecimal bd = new BigDecimal(withVat).setScale(2, RoundingMode.HALF_UP);
        double rounded = bd.doubleValue();
        
        return rounded;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
