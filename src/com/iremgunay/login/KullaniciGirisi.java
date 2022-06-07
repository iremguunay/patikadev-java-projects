package com.iremgunay.login;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String username = "";
        String password = "";
        String decision = "";
        String newPassword = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        username = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("irem") && password.equals("123")) {
            System.out.println("Hoşgeldiniz");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (e/h): ");
            decision = input.nextLine();

            if (decision.equals("e")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                while (newPassword.equals("123") || newPassword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    newPassword = input.nextLine();
                }
                System.out.println("Şifreniz oluşturuldu.");
                System.out.println("Yeniden giriş yapabilirsiniz: ");

                System.out.print("Kullanıcı adını giriniz: ");
                username = input.nextLine();
                System.out.print("Şifrenizi giriniz: ");
                password = input.nextLine();

                if (username.equals("irem") && password.equals(newPassword)) {
                    System.out.println("Hoşgeldiniz");
                } else {
                    System.out.println("Kullanıcı adı veya şifre hatalı");
                }
            } else {
                System.out.println("Programdan çıkılıyor.");
            }
        }
    }
}
