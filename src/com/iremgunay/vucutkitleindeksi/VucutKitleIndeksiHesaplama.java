package com.iremgunay.vucutkitleindeksi;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double vucutKitleIndeksi = 0;
        double kilo = 0;
        double boy = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + vucutKitleIndeksi);
    }
}
