package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static final String TEST_NAME_PATTERN = "^[A-Z]{1}[a-z]{1,}$";

    public boolean validateFirstName(String exp) {
        Pattern pattern = Pattern.compile(TEST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(exp);
        return matcher.matches();
    }
}
