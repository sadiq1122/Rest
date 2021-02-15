package com.example.Service;

public class Validate {


    public static boolean validateString(String param) {


        //if the parameter contains a space then it is an illegal param
        if (param.contains(" ") || param.length()>10) {
            return false;
        }

        try {
        // checking whether the param contains only numeric digits
            int roll = Integer.parseInt(param);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
