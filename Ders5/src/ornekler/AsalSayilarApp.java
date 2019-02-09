package ornekler;
//1 den 100 e kadar olan asal sayıların bulunması

public class AsalSayilarApp {
    public static void main(String[] args) {

        int i,sayi;
        String asalSayilar="";

        for(i=0;i<=100;i++){
            int sayac=0;
            for(sayi=i;sayi>=1;sayi--){
                if(i%sayi==0){
                    sayac++;
                }

            }
            if (sayac == 2) {
                asalSayilar+=i+" ";

            }

        }

        System.out.println("1 den 100 e kadar olan asal sayılar= "+asalSayilar);



            }






            }



