package methodlar;

public class OrneklerApp {
    public static void main(String[] args) {
        //static metodların içinde sadece statik metodlara erişebiliriz
        helloMethod();
        sayiYaz(50);
        int sonuc=10+20;
        sayiYaz(sonuc);
        toplamaIslemi(5,3);
        //dönüş tipi olmayan 1 den fazla parametre alan method
        int gelenDeger=donusTipiOlanToplamaIslemi(7,2);
        System.out.println("dönus tipi olan toplama islemi= "+gelenDeger);
        int result=donusTipiOlanToplamaIslemi(3,6)+1;
        System.out.println("sonuc= "+result);

    }
    //return tipi olmayan ve parametre almayan metod
    //static olmasının sebebi static method tan çağırabilmek
    public static void helloMethod(){
        System.out.println("hello method");
    }
    //dönüş tipi olmayan parametre alan method

    public static void sayiYaz(int sayi){
        System.out.println("sayiniz= "+sayi);

    }

    public static void toplamaIslemi(int sayi1, int sayi2){
        int sonuc=sayi1+sayi2;
        System.out.println("toplama işlemi sonucu= "+sonuc);

    }

    public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;

    }
}
