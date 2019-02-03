package kosulluifade;

import java.util.Scanner;

public class ElseIfYapisiApp {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner klavye = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        sayi1 = klavye.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        sayi2 = klavye.nextInt();
        if (sayi1 > sayi2) {
            System.out.println("sayı1 sayı 2 den büyük");
        } else if (sayi1 == sayi2) {
            System.out.println("sayi1 sayi 2 eşit");
        } else if (sayi1 < 10) {
            System.out.println("sayi1 10 dan minik");
        } else {
            System.out.println("sayi1 sayi 2 den küçük");
        }
        System.out.println("görüşürüz");
    }
}



