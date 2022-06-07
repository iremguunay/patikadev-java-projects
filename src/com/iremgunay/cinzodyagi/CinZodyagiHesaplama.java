package com.iremgunay.cinzodyagi;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int year;
        int reminder;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz yılı giriniz: ");
        year = input.nextInt();

        reminder = year % 12;

        String cinzodyagi = "";

        switch (reminder) {
            case 0:
                cinzodyagi = "Maymun";
                break;
            case 1:
                cinzodyagi = "Horoz";
                break;
            case 2:
                cinzodyagi = "Köpek";
                break;
            case 3:
                cinzodyagi = "Domuz";
                break;
            case 4:
                cinzodyagi = "Fare";
                break;
            case 5:
                cinzodyagi = "Öküz";
                break;
            case 6:
                cinzodyagi = "Kaplan";
                break;
            case 7:
                cinzodyagi = "Tavşan";
                break;
            case 8:
                cinzodyagi = "Ejderha";
                break;
            case 9:
                cinzodyagi = "Yılan";
                break;
            case 10:
                cinzodyagi = "At";
                break;
            case 11:
                cinzodyagi = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinzodyagi);

    }
}
