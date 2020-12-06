package com.techreturners.exercise002;
import java.util.*;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        String city = person.getCity();
        if (city == "Manchester") { 
            return true;
            
        }
        return false;
    }

    public boolean canWatchFilm(Person person, int limit) {
        int age = person.getAge();
        if (age >= limit) { 
            return true;
            
        }
        return false;
    }
    
}
