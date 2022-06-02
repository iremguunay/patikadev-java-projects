package com.iremgunay.dairealan;

import java.util.Scanner;

public class DaireAlanHesaplama {
    public static void main(String[] args) {
        double daireAlan = 0;
        double yaricap = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        yaricap = scan.nextDouble();

        daireAlan = Math.PI * yaricap * yaricap;

        System.out.println("Daire alanı: " + daireAlan);

        //Daire çevre hesaplama
        double daireCevre = 2 * Math.PI * yaricap;
        System.out.println("Daire çevresi: " + daireCevre);

        //Merkez açısı verilen daire parçasının alanı
        double merkezAci = 0;

        System.out.print("Merkez açısı giriniz: ");
        merkezAci = scan.nextDouble();
        double merkezAlan = Math.PI * yaricap * yaricap * merkezAci / 360;
        System.out.println("Merkez açısı verilen daire parçasının alanı: " + merkezAlan);
    }
}
