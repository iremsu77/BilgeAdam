package kosulluifade;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("bir değer giriniz");
        int ifade=klavye.nextInt();
        switch(ifade){
            case 1:
                System.out.println("verilen ifade= "+ifade);
                break;
            case 2:
                System.out.println("verilen ifade= +ifade");
                break;
            case 3:
                System.out.println("verilen ifade= "+ifade);
                break;
            default:
                System.out.println("verilen ifadenin karşılığı yok");
                break;


        }
    }
}
