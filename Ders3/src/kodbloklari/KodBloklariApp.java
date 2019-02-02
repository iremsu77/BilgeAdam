package kodbloklari;

public class KodBloklariApp {
    public static void main(String[] args) {
        int a =5;
        System.out.println("Kademe1 a değeri= "+a);
        {
            a=3;
            System.out.println("Kademe2 a değeri= "+a);
            {
                int b=10;
                a=2;
                System.out.println("kademe 3 "+" a değeri "+"b değeri  "+b);
                //Üst kademelerden alt kademelere ulaşılamıyor ancak alt kademelerden üst kademelere erişilebiliyor.
                {
                    b=7;
                    System.out.println("kademe 4 "+"a değeri "+a+" b değeri "+b);
                }
            }
        }

    }
}
