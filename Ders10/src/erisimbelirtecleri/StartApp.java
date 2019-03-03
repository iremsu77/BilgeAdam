package erisimbelirtecleri;

public class StartApp {
    public static void main(String[] args) {


        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.getEn();
        System.out.println(dikdortgen.getEn());
        dikdortgen.setEn(10);
        System.out.println(dikdortgen.getEn());
        System.out.println(dikdortgen.getUzunlugu());
        System.out.println(dikdortgen.toString());


    }

}

