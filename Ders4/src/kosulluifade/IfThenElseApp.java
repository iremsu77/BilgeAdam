package kosulluifade;

import java.util.Scanner;

public class IfThenElseApp {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bir değer giriniz");
        int sayi=klavye.nextInt();
        String cevap=(sayi>5)?"girilen değer 5 ten büyüktür.": "girilen ifade 5 ten küçüktür";
        System.out.println(cevap);

    }
}
