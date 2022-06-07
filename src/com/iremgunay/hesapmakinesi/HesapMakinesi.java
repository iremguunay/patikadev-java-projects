package com.iremgunay.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print("1- Toplama" + '\n' + "2- Çıkarma" + '\n' + "3- Çarpma" + '\n' + "4- Bölme" + '\n' + "Seçiminiz: ");

        System.out.print("Hesaplamak istediğiniz işlemin numarasını giriniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Geçersiz işlem numarası");
                break;
        }

    }

}
