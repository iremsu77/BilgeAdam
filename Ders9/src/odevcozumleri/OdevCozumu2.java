package odevcozumleri;

import java.util.Scanner;

public class OdevCozumu2{
    public static void main(String[] args) {


        /*int[][] dizi2d = new int[4][5];
        dizi2d[0] = new int[5];
        dizi2d[1] = new int[5];
        dizi2d[2] = new int[5];
        dizi2d[3] = new int[5];
        System.out.println(dizi2d.length);
        System.out.println("dizi boyutunu giriniz");*/
        int n=0;
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen dizinin boyutunu giriniz");
        n=klavye.nextInt();
        char [][] dizi=new char[n][n];
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
                if(i+j>dizi.length-2){
                    dizi[i][j]= 'x';

                }
                else{
                    dizi[i][j]=' ';
                }
            }

        }
        for(int i=0;i<dizi.length;i++) {
            for (int k = 0; k < dizi[0].length; k++) {
                System.out.print(dizi[i][k]);
            }
            System.out.println();
        }



    }
}
