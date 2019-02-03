package kosulluifade;

import java.util.Scanner;

public class IfElseYapisiApp {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int sayi1=klavye.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2=klavye.nextInt();
        if(sayi1==sayi2) {
            System.out.println("sayı 1 ve sayı 2 eşittir");
        }else{
            System.out.println("sayı1 ve sayı2 eşit değildir");


        }
        System.out.println("güle güle...");




    }
}
