package com.iremgunay.hipotenus;

import java.util.Scanner;

public class FindHipotenus {
    public static void main(String[] args) {
        // Dik üçgende hipotenüs bulma programı
        int a, b; // üçgen dik kenar uzunlukları
        double c; // hipotenüs uzunluğu

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin a kenarını giriniz: ");
        a = scanner.nextInt();

        System.out.print("Üçgenin b kenarını giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt(a * a + b * b);
        System.out.print("Hipotenüs uzunluğu: ");
        System.out.format("%.2f", c); // ondalık görünümü formatlama
    }
}
