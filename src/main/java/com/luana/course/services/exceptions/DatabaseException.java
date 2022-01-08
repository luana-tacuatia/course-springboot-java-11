package com.luana.course.services.exceptions;

public class DatabaseException extends RuntimeException{

    private static final long serialVersionUID = -7094172189778115294L;

    public DatabaseException (String msg){
        super(msg);
    }
}
