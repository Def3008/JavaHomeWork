package com.pb.bondarenko.hw8;

public class Auth {

    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String inpLogin, String inpPassword, String inpConfirmPassword) throws WrongPasswordException, WrongLoginException {
//        boolean isOk = false;
        try {
            if (inpLogin.matches("^[a-zA-Z0-9]{5,20}$")) {
                System.out.println("login - oк: " + inpLogin);
                login = inpLogin;
            }else {throw new WrongLoginException();}
        } catch (WrongLoginException e) {

            throw new WrongLoginException();
        }

        try {
            if (
                    inpPassword.equals(inpConfirmPassword)
                    &&
                    inpPassword.matches("^[a-zA-Z0-9_]{5,}$")
            )
            {
                //System.out.println("пароль и повторный пароль совпадают");
                password = inpPassword;
            } else {throw new WrongPasswordException("пароль и повторный пароль НЕ совпадают" +
                    " или пароль не соответствует требованиям");}
        } catch (WrongPasswordException e) {
           // System.out.println("пароль и повторный пароль НЕ совпадают" +
            //        " или пароль не соответствует требованиям");
            throw new WrongPasswordException("пароль и повторный пароль НЕ совпадают" +
                    " или пароль не соответствует требованиям");

        }

    }

    public void signIn(String inpLogin, String inpPassword) throws WrongLoginException, WrongPasswordException {
   //     boolean isOk = false;

        try {
            if (
                    inpPassword.equals(password)
                            &&
                            inpLogin.equals(login)
            )
            {
                System.out.println("Вход успешен");

            } else {throw new WrongPasswordException("неправильный логин "+inpPassword + " или пароль " +inpPassword
                    );}
        } catch (Exception e) {
            System.out.println("неправильный логин "+inpPassword + " или пароль " +inpPassword);
            throw new WrongPasswordException("неправильный логин "+inpPassword + " или пароль" +inpPassword);

        }
    }
}
