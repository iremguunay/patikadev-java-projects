package com.iremgunay.ucakbileti;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe;
        double normalBiletFiyati;
        int yas;
        double yasIndirimi;
        int yolculukTipi;
        double gidisDonusIndirimi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Uçak bileti fiyatı hesaplama programına hoşgeldiniz.");
        System.out.print("Lütfen uçuş mesafesini giriniz: ");
        mesafe = scanner.nextInt();
        normalBiletFiyati = mesafe * 0.10;
        while(mesafe < 0) {
            System.out.println("Hatalı veri girdiniz! Lütfen geçerli bir mesafe giriniz: ");
            mesafe = scanner.nextInt();
        }

        System.out.print("Lütfen yolcu yaşını giriniz: ");
        yas = scanner.nextInt();
        while(yas < 0) {
            System.out.print("Hatalı veri girdiniz! Lütfen geçerli bir yaş aralığı giriniz: ");
            yas = scanner.nextInt();
        }

        System.out.println("1- Tek Yön " + "\n" + "2- Gidiş-Dönüş");
        System.out.print("Lütfen yolculuk tipini seçiniz: (1/2) ");
        yolculukTipi = scanner.nextInt();
        while(!(yolculukTipi == 1 || yolculukTipi == 2)) {
            System.out.print("Hatalı veri girdiniz! Lütfen geçerli bir seçim yapın: ");
            yolculukTipi = scanner.nextInt();
        }

        double indirimliBiletFiyati = normalBiletFiyati;

        if (yas < 12) {
            yasIndirimi = normalBiletFiyati * 0.50;
            indirimliBiletFiyati = normalBiletFiyati - yasIndirimi;
        } else if (yas <= 24) {
            yasIndirimi = normalBiletFiyati * 0.10;
            indirimliBiletFiyati = normalBiletFiyati - yasIndirimi;
        } else if (yas > 65) {
            yasIndirimi = normalBiletFiyati * 0.30;
            indirimliBiletFiyati = normalBiletFiyati - yasIndirimi;
        }

        if (yolculukTipi == 1) {
            System.out.println("Toplam Tutar: " + indirimliBiletFiyati + " TL");
        } else {
            gidisDonusIndirimi = indirimliBiletFiyati * 0.20;
            indirimliBiletFiyati = (indirimliBiletFiyati - gidisDonusIndirimi)*2;
            System.out.println("Toplam Tutar = " + indirimliBiletFiyati + " TL");
        }

    }
}
