package erisimbelirtecleri2;
import erisimbelirtecleri.Dikdortgen;

public class StartApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        //aynı package de olunca protected dakilere erişebiliyoruz lakin farklı bir pakette olunca erişemiyoruz
        //private ile sadece aynı paket üzerinden erişilir
        //public te ise tüm pakelerden erişim sağlanabilir
        //defaultta sadece o paket içerisinden erişebiliriz
    }
}
