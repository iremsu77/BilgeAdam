public class OdevCozum {
    public static void main(String[] args) {
        int[] dizi={7,3,125,9,1,0,17,88,22,4};
        System.out.println("dizimizin boyutu= "+dizi.length);
        int temp=0;
        for(int i=0;i<=dizi.length;i++){
            for(int k=i+1;k<dizi.length;k++){
                if(dizi[i]>dizi[k]){
                    temp=dizi[k];
                    dizi[k]=dizi[i];
                    dizi[i]=temp;


                }


            }
        }
        String sonuc="";
        for(int diziElemani:dizi){
            sonuc+=diziElemani+" ";

        }
        System.out.println("dizinin sıralı hali= "+sonuc );
    }
}
