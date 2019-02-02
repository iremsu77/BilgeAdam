package aritmetikoperatorler;

public class IliskiselKarsilastirmaApp {
    public static void main(String[] args){
        int a=5,b=10;
        //<, >, <=,>=,==,!=
        boolean sonuc;
        sonuc=a<b;
        System.out.println("a nın b den küçük olma durumu; "+sonuc); //
        System.out.println(a<b);
        sonuc=a>b;
        System.out.println("a nın b den büyük olma durumu; "+sonuc);
        sonuc=a<=b;
        System.out.println("a nın b ye küçük veya eşit olma durumu= "+sonuc);
        int c=5;
        sonuc=a<=c;
        System.out.println("a nın c ye küçük veya eşit olma durumu= "+sonuc);
        sonuc=a>=b;
        System.out.println("a nın b den büyük eşit olma durumu= "+sonuc);
        sonuc=a==b;
        System.out.println("a nın b ye eşit olma durumu= "+sonuc);
        sonuc=a!=b;
        System.out.println("a nın b ye eşit olmama durumu= "+sonuc);



    }
}
