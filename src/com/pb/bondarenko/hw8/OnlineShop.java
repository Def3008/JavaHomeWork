package com.pb.bondarenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner inp = new Scanner(System.in);

        System.out.println("Регистрация. Введите логин:");
        String login = inp.nextLine();
        System.out.println("Регистрация. Введите пароль:");
        String pass = inp.nextLine();
        System.out.println("Регистрация. Введите пароль ещё раз:");
        String confPass = inp.nextLine();


        Auth auth = new Auth(login, pass);
        auth.signUp(login, pass, confPass);

        System.out.println("Вход на сайт\n");
        System.out.println("Введите логин:");
        String l = inp.nextLine();
        System.out.println("Введите пароль:");
        String p = inp.nextLine();

        auth.signIn(l,p);

    }
}
