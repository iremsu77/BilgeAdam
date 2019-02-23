package nesne;

public class StartApp5 {
    public static void main(String[] args) {
        //newlemeye gerek kalmadı
        System.out.println(Dikdortgen.sayi);
        Dikdortgen.sayi=5;
        System.out.println(Dikdortgen.sayi);
        //newlersek değer değişmiyo
        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println("sayinin son degeri= "+dikdortgen.sayi);
        dikdortgen.sayi=10;
        System.out.println("sayinin deger atanmış hali= "+dikdortgen.sayi);

    }
}
