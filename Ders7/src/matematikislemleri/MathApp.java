package matematikislemleri;

import java.util.Random;

public class MathApp {
    public static void main(String[] args) {
        //math sınıfı java.lang paketi ile otomatik olarak beraber gelir.
        System.out.println("sayının kökünü alma= "+Math.sqrt(16));
        System.out.println("sayının mutlak değeri= "+Math.abs(-12+1));
        System.out.println("ondalıklı sayıyının bir üst tam sayı değerini alma= "+Math.ceil(2.17));
        System.out.println("ondalıklaı sayının bir alt tam sayı değerini alma= "+Math.floor(5.98));
        System.out.println("ondalıklı sayıda en yakın tam sayı değeri"+Math.round(2.67));
        System.out.println("bir sayının üssünü alma= "+Math.pow(5,5));
        System.out.println("sayılar arasında büyük olanı bulma(1-6)= "+Math.max(1,6));
        System.out.println("sayılar arasında küçük olanı bulma(1-6)= "+Math.min(1,6));
        System.out.println("pi sayısının değeri= "+Math.PI);
        System.out.println("e sayısının değeri= "+Math.E);
        System.out.println("Random sayı üretme= "+(int)(Math.random()*20));
        Random random=new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5));







    }
}
