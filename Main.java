package utp.mains;

import java.util.Scanner;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001B[34m";
        final String CYAN = "\u001B[36m";
        final String RESET = "\u001B[0m";

        System.out.println(CYAN + "=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================" + RESET);

        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        double alas = 10, kaki = 13, tinggiPrisma = 12;
        System.out.println("Isikan alas     : " + alas);
        System.out.println("Isikan kaki     : " + kaki);
        System.out.println("Isikan tinggi   : " + tinggiPrisma);
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        prisma.printInfo();
        System.out.println("=============================================");

        System.out.println("Limas Persegi");
        System.out.println("=============================================");
        double sisi = 10, tinggiLimas = 12;
        System.out.println("Isikan sisi     : " + sisi);
        System.out.println("Isikan tinggi   : " + tinggiLimas);
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        limas.printInfo();
        System.out.println("=============================================");

        System.out.println("Tabung");
        System.out.println("=============================================");
        double radius = 14, tinggiTabung = 10;
        System.out.println("Isikan radius   : " + radius);
        System.out.println("Isikan tinggi   : " + tinggiTabung);
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        tabung.printInfo();
        System.out.println("=============================================");

        input.close();
    }
}