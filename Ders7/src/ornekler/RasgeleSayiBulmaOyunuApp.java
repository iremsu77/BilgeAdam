package ornekler;

import java.util.Scanner;

public class RasgeleSayiBulmaOyunuApp {
    public static void main(String[] args) {
        //1 ile 10 arasında rasgele bir sayıyı bulma
        int tahmin ;
        int sayi = (int) (Math.random() * 10);

        Scanner klavye = new Scanner(System.in);
        do {
            System.out.println("lütfen bir sayı tahmin ediniz");
            tahmin = klavye.nextInt();
        if (sayi == tahmin) {
            System.out.println("kazandınız");
        }else if(sayi-tahmin<=2 && sayi-tahmin>=-2){
            System.out.println("yaklaştınız");
        //}else if(tahmin==sayi-1 || tahmin==sayi+1){
         //   System.out.println("yaklaştınız");
        //}else if (tahmin==sayi-2 || tahmin==sayi+2) {
          //  System.out.println("yaklaştınız");


        } else {
                System.out.println("tahmininiz kötü :(");
            }


        }while(sayi!=tahmin);
    }
}

