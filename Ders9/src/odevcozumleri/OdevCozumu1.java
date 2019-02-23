package odevcozumleri;

import java.util.Scanner;

public class OdevCozumu1 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bir string ifade giriniz");
        String ifade=klavye.nextLine();
        ifade=ifade.toLowerCase();
        System.out.println("harfi giriniz");
        String harf=klavye.next();
        harf=harf.toLowerCase();
        int sayac=0;
        if(ifade.length()>0){
            char[] karakterler=ifade.toCharArray();
            for(char karakter:karakterler){
                String a=String.valueOf(karakter);
                if(a.equals(harf)){
                    sayac++;
                }
            }
            System.out.println("girileen harf sayısı= "+sayac);
        }else{
            System.out.println("bir string ifade giriniz");
        }

    }

}
