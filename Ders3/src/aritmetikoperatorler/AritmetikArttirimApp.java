package aritmetikoperatorler;

public class AritmetikArttirimApp {
    public static void main(String[] args){
        int a=2,b=7,c=40,d=50;
        a++;//değişkenimi ata sonra bir kere arttır.
        System.out.println("değişkenimi ata sonra bir kere arttır= "+a);
        ++b;//değişkenimi arttır sonra bir kere ata.
        System.out.println("değişkenimi arttır sonra bir kere ata= "+b);
        c--;//değişkenimi ata sonra bir kere azalt
        System.out.println("değişkenimi ata sonra bir kere azalt= "+c);
        --d;//değişkenimi bir kere azalt sonra ata
        System.out.println("değişkenimi bir kere azalt sonra ata= "+d);

        int x=7, y=7, sonuc1,sonuc2;
        sonuc1=++x;
        sonuc2=y++;
        System.out.println("Sonuç1= "+sonuc1);
        System.out.println("arttırımdan sonraki x değeri; "+x);
        System.out.println("sonuc2= "+sonuc2);
        System.out.println("arttırımdan sonraki y değeri= "+y);
        //y arttırılmadan önce sonuc değişkenine atandı.


    }
}
