package nesne;
//sınıfımıza import edilen classlar

public class Dikdortgen {
    /*
    sınıf içinde verilen değişkenler sınıf değişkenleridir
    o sınıfın özellikleridir
     */
    public double uzunluk;
    public double en;
    public double cevre;
    public double alan;
    //sadece class ismi verilir
    //donus tipi yoktur.
    public Dikdortgen(){
        //this in kullanılma nedeni class değişkenlerinden bahsediyor olmak
        //this.uzunluk=5;
        //this.en=6;
       // uzunluk=5;
       // en=6;

    }
    public void alanHesapla(){
        this.alan=this.en*this.uzunluk;
        System.out.println("Dikdortgenin alanı"+this.alan);
    }
    public void cevreHesapla(){
        this.cevre=(2*this.en)+(2*this.uzunluk);
        System.out.println("dikdortgen alanı= "+this.cevre);


    }
    public static int sayi;
    public static final double PI = 3.14;
    public void alanHesapla(double uzunluk,double en){
        double sonuc=uzunluk*en;
        System.out.println("parametre alan dikdortgenin alan hesabı= "+sonuc);

    }
    public double alanHesapla(double alan){
        return alan;
    }
    public Dikdortgen(int uzunluk,int en){
        this.uzunluk=uzunluk;
        this.en=en;
    }


}
