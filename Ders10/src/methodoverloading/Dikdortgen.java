package methodoverloading;

public class Dikdortgen {
    public double en;
    public double uzunlugu;
    public double alan;
    public double cevre;
    public void alanHesapla(){
        this.alan=this.uzunlugu*this.en;
        System.out.println("dikdörtgenin alanı= "+alan);
    }
    public void alanHesapla(final double en,final double uzunlugu){
        this.alan=en*uzunlugu;
        System.out.println("dikdortgenin alanı= "+this.alan);


    }
    public void alanHesapla(double en, double uzunlugu, double cevre){
        this.alan=en*uzunlugu;
        System.out.println("dikdortgenin alanı= "+alan);
        System.out.println("dikdortgenin cevresi= "+cevre);
    }
    public double alanHesapla(double alan){
        return alan;


    }
}
