package klavyegirdileri;
import java.util.Scanner;

public class KlavyeGirdiApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //scaner.nextInt() int değer okuyacağım zaman bu methodu kullanıyoruz
        //scanner.nextDouble(); double değeri okuyacağı zaman
        //scanner.next();= String değerleri okumak için
        //scanner.nextLine(); String değerleri okumak için
        int sayi1,sayi2,sonuc;
        System.out.println("iki sayıyı toplama programı");
        System.out.print("birinci sayıyı giriniz= ");
        sayi1=scanner.nextInt();
        //System.out.println("girdiğiniz sayı= " +sayi1);
        System.out.print("ikinci sayıyı giriniz= ");
        sayi2=scanner.nextInt();
        sonuc=sayi1+sayi2;
        System.out.println("toplama işleminizin sonucu= "+sonuc);

    }
}
