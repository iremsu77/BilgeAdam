package nesne;

public class StartApp4 {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.uzunluk=5;
        dikdortgen.en=6;
        dikdortgen.alanHesapla();
        Dikdortgen yenisi=new Dikdortgen();
        yenisi.uzunluk=20;
        yenisi.en=50;
        yenisi.alanHesapla();
        yenisi.cevreHesapla();
    }
}
