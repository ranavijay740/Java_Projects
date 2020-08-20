package com.company.rana.library.utill;

import com.company.rana.library.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book)
    {
        if(book.getTitle()=="" || book.getTitle() == null)
            return false;

        return true;
    }
}
