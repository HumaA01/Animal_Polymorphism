package com.qa.exceptions;

public class InvalidActionException extends Exception
{
    public InvalidActionException()
    {
        super("This action has already been completed");
    }
    public InvalidActionException(String custom)
    {
        super(custom);
    }
}
