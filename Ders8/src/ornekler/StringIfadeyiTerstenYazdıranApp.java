package ornekler;

public class StringIfadeyiTerstenYazdıranApp<i> {
    public static void main(String[] args) {


        String deger = "Merhaba java";
        char[] dizi = deger.toCharArray();
        String sonuc = "";

        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i]);

        }
        System.out.println((sonuc));


    }
}