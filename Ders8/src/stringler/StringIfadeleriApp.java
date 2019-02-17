package stringler;

public class StringIfadeleriApp {
    public static void main(String[] args) {
        //Stringlerde tanımlama
        String jv="Merhaba Java";
        String c=new String("Merhaba Java");
        String a= "Merhaba Java";
        System.out.println(jv);
        System.out.println(a);
        System.out.println("java değişkeninin boyutu= "+jv.length());
        System.out.println("a değişkeninin boyutu= "+a.length());

        //karşılaştırma
        if(jv==a){
            System.out.println("eşit");
            //eşit eşit stringlerde pek kullanılan yöntem değil çünkü new string oluşturunca eşit olarak görmüyor.


        }
        if(jv.equals(c)){
            System.out.println("equals ile eşittir");
        }

    }
}
