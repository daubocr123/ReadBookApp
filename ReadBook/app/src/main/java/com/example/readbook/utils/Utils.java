package com.example.readbook.utils;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean isEmpty(EditText editText){
        if(editText.getText().toString().trim().length() > 0){
            return true;
        }
        else
        {
            editText.requestFocus();
            editText.setError("Vui lòng điền đầy đủ thông tin");
            return false;
        }
    }
    public static boolean isEmailValid(String email){
        boolean isValid = true;
        String expression = "[a-zA-Z0-9._-]+@[a-z]+(\\.+[a-z]+)+";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches())
        {
            isValid = true;
        }
        return isValid;
    }
}
