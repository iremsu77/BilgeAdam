package methodlar;

import java.util.Scanner;

public class methodornekhoca {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int secenek,sayi1,sayi2;
        double sonuc;
        boolean devamEdilsinMi = true;
        do {
            System.out.println("hosgeldiniz");
            System.out.println("hangi islemi yapmak istiyorsunuz");
            System.out.println("1-toplama,2-çıkarma,3-bölme,4-carpma");
            System.out.println("0=cıkış");
            System.out.println("seciniz");
            secenek=klavye.nextInt();
            switch(secenek){
                case 0:
                    devamEdilsinMi=false;
                    break;
                case 1:
                    System.out.println("1. sayıyı giriniz");
                    sayi1=klavye.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    sayi2=klavye.nextInt();
                    sonuc=toplamaIslemi(sayi1,sayi2);
                    System.out.println("toplama islemimizin sonucu= "+sonuc);
                    break;
                default:
                    System.out.println("yanlış bir giriş yaptınız");
                    devamEdilsinMi=true;
                case 2:
                    System.out.println("1. sayıyı giriniz");
                    sayi1=klavye.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    sayi2=klavye.nextInt();
                    sonuc=cikarmaIslemi(sayi1,sayi2);
                    System.out.println("cıkarma isleminin sonucu= "+sonuc);
                case 3:
                    System.out.println("1. sayıyı giriniz");
                    sayi1=klavye.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    sayi2=klavye.nextInt();
                    sonuc=bolme(sayi1,sayi2);
                    System.out.println("bolme isleminin sonucu= "+sonuc);

                case 4:
                    System.out.println("1. sayıyı giriniz");
                    sayi1=klavye.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    sayi2=klavye.nextInt();
                    sonuc=carpma(sayi1,sayi2);
                    System.out.println("carpma isleminizin sonucu= "+sonuc);



            }


        } while (devamEdilsinMi);
    }

    public static double toplamaIslemi(double sayi1,double sayi2) {
        double sonuc;
        sonuc=sayi1+sayi2;
        return sonuc;

    }

    public static double cikarmaIslemi(double sayi1, double sayi2) {
        return sayi1-sayi1;

    }

    public static double bolme(double sayi1,double sayi2) {
        return sayi1/sayi2;

    }

    public static double carpma(double sayi1,double sayi2) {
        return sayi1*sayi2;
    }






    }




