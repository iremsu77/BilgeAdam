package aritmetikoperatorler;

public class Aritmetikapp {
    public static void main(String[] args){
       //toplama çıkarma
        //değişken isimlwei farklı olmalıdır
        int a=7,c=3,d;
        int b=3;
        int sonuc;
        double bolmeSonucu,x=7;

        sonuc=a+b;
        System.out.println("toplama işlemi= "+sonuc);
        sonuc=a-b;
        System.out.println("çıkarma işlemi= "+sonuc);
        sonuc=a*b;
        System.out.println("çarpma işlemi= "+sonuc);
        sonuc=a/b;
        System.out.println("integer bölme işlemi "+sonuc);
        bolmeSonucu=x/b;
        System.out.println("double bölme işlemi= "+bolmeSonucu);
        sonuc=a%b;
        System.out.println("sayının kalanını bulma işlemi= "+sonuc);
        a=a+b;
        System.out.println("normal atama= "+a);
        a=7;
        a+=b; // toplama işlemini yap baştak, değere eşitle
        System.out.println("aritmetik atama= "+a);
        a=7;
        a=a-b;
        System.out.println("Normal atama: "+a);
        a=7;
        a-=b;
        System.out.println("aritmetik atama= "+a);
        a=7;
        a*=b;
        a%=b;



    }
}
