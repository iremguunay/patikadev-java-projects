package com.iremgunay.etkinlikoneri;

import java.util.Scanner;

public class EtkinlikOnermeProgrami {
    public static void main(String[] args) {
        int havaSicakligi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        havaSicakligi = scanner.nextInt();

//        if (havaSicakligi < 5) {
//            System.out.println("Kayak yapabilirsiniz.");
//        } else if (havaSicakligi <= 15) {
//            System.out.println("Sinemaya gidebilirsiniz.");
//        } else if (havaSicakligi <= 25) {
//            System.out.println("Piknik yapabilirsiniz.");
//        } else {
//            System.out.println("Yüzmeye gidebilirsiniz.");
//        }

        String etkinlik = havaSicakligi < 5 ? "Kayak yapabilirsiniz." :
                          havaSicakligi <= 15 ? "Sinemaya gidebilirsiniz." :
                          havaSicakligi <= 25 ? "Piknik yapabilirsiniz." :
                          "Yüzmeye gidebilirsiniz.";

        scanner.close();

        System.out.println(etkinlik);

    }
}
