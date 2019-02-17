package ornekler;

import java.util.Scanner;

public class StringKuralaGoreKelimeSayisiBulmaApp {
    //camel case girilen string bir cümledeki kelime sayısı bulma
    //camel case string kullanıcı tarafından girilecek
    public static void main(String[] args) {
        int sayac=1;
        Scanner klavye=new Scanner(System.in);
        System.out.println("kelime sayısını bulmak istediğiniz camel case bir cümle giriniz");
        String deger=klavye.next();
        char[]dizi=deger.toCharArray();
        String temp="";
        for(int i=0;i<dizi.length;i++){
            temp=String.valueOf(dizi[i]);
            if(temp.equals(temp.toUpperCase())){
                sayac++;
            }
        }
        System.out.println("kelime sayisi= "+sayac);
        }


    }

