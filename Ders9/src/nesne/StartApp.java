package nesne;

public class StartApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println(dikdortgen.uzunluk);
        System.out.println(dikdortgen.en);
        System.out.println(dikdortgen.cevre);
        System.out.println(dikdortgen.alan);
        dikdortgen.en=5;
        dikdortgen.uzunluk=6;
        System.out.println(dikdortgen.en);
        System.out.println(dikdortgen.uzunluk);
        dikdortgen.cevre=2*dikdortgen.en+2*dikdortgen.uzunluk;
        System.out.println(dikdortgen.cevre);
        dikdortgen.alan=dikdortgen.en*dikdortgen.uzunluk;
        System.out.println(dikdortgen.alan);
        Dikdortgen dikdortgen1=new Dikdortgen();
        dikdortgen.en=2;
        dikdortgen1.uzunluk=4;
        dikdortgen1.cevre=2*dikdortgen1.en+2*dikdortgen1.uzunluk;
        dikdortgen1.alan=dikdortgen.en*dikdortgen.uzunluk;
        System.out.println("dikdortgen 1 in alanı= "+dikdortgen1.alan);
        System.out.println("dikdörtgen 1 in çevresi= "+dikdortgen1.cevre);

    }
}
