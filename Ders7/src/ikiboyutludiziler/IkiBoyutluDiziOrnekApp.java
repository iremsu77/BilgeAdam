package ikiboyutludiziler;

public class IkiBoyutluDiziOrnekApp {
    public static void main(String[] args) {
       int[][] dizi={{3, 4, 1}, {8, 4, 6}, {2, 4, 15}};
       for(int i=0;i<dizi.length;i++){
           for(int k=0;k<dizi[i].length;k++){
               System.out.print(dizi[i][k]+" ");
           }
           System.out.println();
       }
       int sayac=dizi.length;
       int sagcapraz=0;
       int solcapraz=0;
       int sonuc=0;
       for(int i=0;i<dizi.length;i++){
           sayac--;

           sagcapraz+=dizi[i][sayac];
           solcapraz+=dizi[i][i];
       }
       sonuc=sagcapraz-solcapraz;
        System.out.println("sonuc= "+Math.abs(sonuc));
    }
}
