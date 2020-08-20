package com.company.rana.library.utill;

import com.company.rana.library.DataAccessLayer.User;

public class UserValidator {

    public static boolean isValid(User user)
    {
        if(user.getEmail()=="" || user.getEmail()==null)
            return false;
        return true;
    }
}
