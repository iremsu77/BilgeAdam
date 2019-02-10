package ornekler;

import java.util.Scanner;

public class astrolojiornek {
    public static void main(String[] args) {
        int gün;
        int ay;
        String burc;
        Scanner klavye = new Scanner(System.in);
        System.out.println("lüten doğduğunuz günü yazınız");
        gün = klavye.nextInt();
        System.out.println("lütfen doğduğunuz ayı yazınız");
        ay = klavye.nextInt();

            if (ay == 1) {
                if (gün <= 20) {
                    System.out.println("burcunuz oğlak");
                } else {
                    System.out.println("burcunuz kova");

                }
            } else if (ay == 2) {
                if (gün <= 19) {
                    System.out.println("burcunuz kova");
                } else {
                    System.out.println("burcunuz balık");

                }
            }else if(ay==3) {
                if (gün <= 21) {
                    System.out.println("burcunuz balık");
                } else {
                    System.out.println("burcunuz koç");
                }
            }else if(ay==4) {
                if (gün <= 20) {
                    System.out.println("burcunuz koç");
                } else {
                    System.out.println("burcunuz boğa");
                }
            }else if(ay==5) {
                if (gün <= 21) {
                    System.out.println("burcunuz boğa");
                } else {
                    System.out.println("burcunuz ikizler");
                }
            }else if(ay==6) {
                if (gün <= 21) {
                    System.out.println("burcunuz ikizler");
                } else {
                    System.out.println("burcunuz yengeç");
                }
            }else if(ay==7) {
                if (gün <= 23) {
                    System.out.println("burcunuz yengeç");
                } else {
                    System.out.println("burcunuz aslan");
                }
            }else if(ay==8) {
                if (gün <= 20) {
                    System.out.println("burcunuz aslan");
                } else {
                    System.out.println("burcunuz başak");
                }
            }else if(ay==9) {
                if (gün <= 20) {
                    System.out.println("burcunuz başak");
                } else {
                    System.out.println("burcunuz terazi");
                }
            }else if(ay==10) {
                if (gün <= 20) {
                    System.out.println("burcunuz terazi");
                } else {
                    System.out.println("burcunuz akrep");
                }
            }else if(ay==11) {
                if (gün <= 20) {
                    System.out.println("burcunuz akrep");
                } else {
                    System.out.println("burcunuz yay");
                }
            }else if(ay==12) {
                if (gün <= 20) {
                    System.out.println("burcunuz yay");
                } else {
                    System.out.println("burcunuz oğlak");
                }






            }
        }
    }

