package com.iremgunay.manavkasa;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutKilo, armutFiyat = 2.14;
        double elmaKilo, elmaFiyat = 3.67;
        double domatesKilo, domatesFiyat = 1.11;
        double muzKilo, muzFiyat = 0.95;
        double patlicanKilo, patlicanFiyat = 5.00;
        double toplamTutar;

        Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = scan.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = scan.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = scan.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = scan.nextDouble();

        toplamTutar = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) +
                      (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) +
                      (patlicanFiyat*patlicanKilo);

        System.out.print("Toplam Tutar : ");
        System.out.format("%.2f", toplamTutar);
        System.out.print(" TL");

    }
}
