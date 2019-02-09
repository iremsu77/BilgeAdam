package ornekler;

import java.util.Scanner;

public class AtmApp<devamEdilsinMi> {
    public static void main(String[] args) {
        int secenek = 0;
        String sifre = "1234";
        String girilenSifre = "";
        int bakiye = 1_000_000;
        int cekilecekMiktar = 0;
        boolean devamEdilsinMi = false;
        Scanner klavye = new Scanner(System.in);
        do {
            System.out.println("Hosgeldiniz");
            System.out.println("şifrenizi giriniz");
            girilenSifre = klavye.next();
            if (girilenSifre.equals(sifre)) {
                System.out.println("hangi şlami yapmak istiyorsunuz?");
                System.out.println("1-- para çekme");
                System.out.println("0-- çıkış");
                System.out.println("Seçiniz");
                secenek = klavye.nextInt();
                if (secenek >= 0 && secenek <= 1) {

                    switch (secenek) {
                        case 0:
                            System.out.println("yine bekleriz");
                            devamEdilsinMi = false;
                            break;
                        case 1:
                            System.out.print("çekmek istediğiniz miktarı giriniz=");
                            cekilecekMiktar = klavye.nextInt();
                            if (cekilecekMiktar < bakiye) {
                                bakiye = bakiye - cekilecekMiktar;
                                System.out.println("paranız çekiliyor");
                                System.out.println("kalan miktar: " + bakiye + "TL");
                                System.out.println("güle gule :)");
                                devamEdilsinMi = true;
                            } else {
                                System.out.println("yetersiz bakiye");
                                devamEdilsinMi = false;
                            }

                    }

                } else {
                    System.out.println("yanlış şifre girdiniz");
                }

            }
        }while (devamEdilsinMi) ;


        }
    }




