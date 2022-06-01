package com.iremgunay.alanhesaplama;

import java.util.Scanner;

public class CalculateArea {
    //Üçgenin alanını hesaplama
    public static void main(String[] args) {
        int a, b, c; // Üçgenin kenar uzunlukları
        double area; // Üçgenin alanı

        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin a kenarını giriniz: ");
        a = scan.nextInt();

        System.out.print("Üçgenin b kenarını giriniz: ");
        b = scan.nextInt();

        System.out.print("Üçgenin c kenarını giriniz: ");
        c = scan.nextInt();

        int perimeter = a + b + c; // Üçgenin çevresi 2u ise
        double u = perimeter / 2; // Üçgenin kenar uzunluklarının toplamının yarısı
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c)); // Üçgenin alanı
        System.out.print("Üçgenin alanı: ");
        System.out.format("%.2f", area); // ondalık görünümü formatlama

    }
}
