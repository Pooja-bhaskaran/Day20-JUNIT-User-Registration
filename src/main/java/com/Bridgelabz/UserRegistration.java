package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static final String TEST_NAME_PATTERN = "^[A-Z]{1}[a-z]{1,}$";
    static final String  TEST_EMAIL_PATTERN = "^[A-Z a-z 0-9]+([.][A-Za-z0-9]+)@([a-z]+[.][a-z]{2,3})+([.][a-z]+)$";
    static final String TEST_PHONENUMBER_PATTERN ="^([1-9]{1,2}[ ])+([6-9]{1}[0-9]{9})$";

    public boolean validateFirstName(String exp) {
        Pattern pattern = Pattern.compile(TEST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(exp);
        return matcher.matches();
    }

    public boolean validateLastName(String exp) {
        Pattern pattern = Pattern.compile(TEST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(exp);
        return matcher.matches();
    }

    public boolean validateEmailID(String email){
        Pattern pattern = Pattern.compile(TEST_EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePhoneNumber(String phonenumber){
        Pattern pattern = Pattern.compile(TEST_PHONENUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phonenumber);
        return matcher.matches();
    }
}
