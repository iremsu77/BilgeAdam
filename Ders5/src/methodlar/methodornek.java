package methodlar;

import java.util.Scanner;

public class methodornek {
    public static void main(String[] args) {
        int sayi1,sayi2,ifade;
        Scanner klavye=new Scanner(System.in);
        System.out.println("hangi işlemi yapmak istiyorsunuz?");
        System.out.print("lütfen yapmak istediğiniz işlem için şu tuşlara basınız= ");
        System.out.println("1=toplama,2=çıkarma,3=bölme,4=çarpma");
       ifade=klavye.nextInt();
        System.out.println("işlem yapmak istediğiniz iki sayıyı yazınız");
        System.out.println("");
        sayi1=klavye.nextInt();
        sayi2=klavye.nextInt();
       switch(ifade){
           case 1:
               toplama(sayi1,sayi2);
               break;
           case 2:
               cıkarma(sayi1,sayi2);
               break;
           case 3:
               bolme(sayi1,sayi2);
               break;
           case 4:
               carpma(sayi1,sayi2);
               break;

       }

    }

    public static void toplama(int sayi1,int sayi2) {
        int sonuc=sayi1+sayi2;
        System.out.println("toplama isleminin sonucu= "+sonuc);

    }

    public static void cıkarma(int sayi1,int sayi2) {
        int sonuc=sayi1-sayi2;
        System.out.println("çıkarma isleminin sonucu");

    }

    public static void bolme(int sayi1,int sayi2) {
        int sonuc=sayi1/sayi2;
        System.out.println("bölme isleminin sonucu= "+sonuc);

    }

    public static void carpma(int sayi1,int sayi2) {
        int sonuc=sayi1*sayi2;
        System.out.println("carpma isleminin sonucu= "+sonuc);

    }



    }

