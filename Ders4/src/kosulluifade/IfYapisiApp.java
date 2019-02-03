package kosulluifade;


import java.util.Scanner;

public class IfYapisiApp {
    public static void main(String[] args) {
        /*int a=5;
        //if paramtezleri içerisindeki değer true ise blok içine girer
        if(a==5){
            System.out.println("a değişkeni 5 e eşittir.");
        }
        System.out.println("goodbye");*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz;");
        int sayi=scanner.nextInt();
        if (sayi<10){
            System.out.println("girilen sayı 10 dan ufak");
        }

    }
}
