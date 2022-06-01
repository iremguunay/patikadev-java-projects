package com.iremgunay.taksimetre;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double taksimetreAcilis = 10.0;
        double kmBasinaUcret = 2.20;
        double km;

        Scanner scan = new Scanner(System.in);
        System.out.print("Km sayısını giriniz: ");
        km = scan.nextDouble();

        double toplamTutar = taksimetreAcilis + (km * kmBasinaUcret);
        toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar;

        System.out.println("Toplam ödenecek tutar: " + toplamTutar + "TL");
    }
}
