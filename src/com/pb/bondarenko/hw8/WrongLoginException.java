package com.pb.bondarenko.hw8;

public class WrongLoginException extends Exception{
    private String err;

    public WrongLoginException() {
        this.err = "Неправильный логин";
    }

    @Override
    public String toString() {
        return err;
    }

    public WrongLoginException(String message) {
        super(message);
        this.err = message;
    }
}
