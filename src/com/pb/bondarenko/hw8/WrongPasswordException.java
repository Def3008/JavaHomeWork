package com.pb.bondarenko.hw8;

public class WrongPasswordException extends Exception {
    private String err;

    public WrongPasswordException() {
        this.err = "Неправильный пароль";
    }

    @Override
    public String toString() {
        return err;
    }

    public WrongPasswordException(String message) {
        super(message);
        this.err = message;
    }
}

