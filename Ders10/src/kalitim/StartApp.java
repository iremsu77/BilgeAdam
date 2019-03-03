package kalitim;

public class StartApp {
    public static void main(String[] args) {
        Personel personel=new Personel("ramazan","karagoz",27,123);
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setAd("Ali");
        ogrenci.setSoyad("yılmaz");
        ogrenci.setYas(12);
        ogrenci.setOkulNumarasi(456);
        System.out.println(personel.toString());
        System.out.println(ogrenci.toString());

    }
}
