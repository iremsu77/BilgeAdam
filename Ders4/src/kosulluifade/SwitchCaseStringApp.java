package kosulluifade;

import java.util.Scanner;

public class SwitchCaseStringApp {
    public static void main(String[] args) {
        Scanner kalvye=new Scanner(System.in);
        System.out.println("haftanın hangi günü:");
        String haftaninGunu=kalvye.next();
        switch(haftaninGunu){
            case"pazartesi":
                System.out.println("haftanın birinci günüdür");
                break;
            case "salı":
                System.out.println("haftanın ikinci günü");
                break;
            case"çarsamba":
                System.out.println("haftanın üçüncü günü");
                break;
            case"persembe":
                System.out.println("haftanın dördüncü günü");
                break;
            case"cuma":
                System.out.println("haftanın besinci günü");
                break;
            case"cumartesi":
                System.out.println("haftanın altıncı günü");
                break;
            case"pazar":
                System.out.println("haftanın yedinci günü");
                break;
            default:
                System.out.println("böyle bi şey yok");
                break;
        }

    }
}
