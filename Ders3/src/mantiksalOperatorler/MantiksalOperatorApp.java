package mantiksalOperatorler;

public class MantiksalOperatorApp {
    public static void main(String[] args) {
        //<var1>&& <var2> ve operatörü , sağındaki ve solundaki değişken değeri true ise true değerini verir.
        //true olması için ikisinin de true olması gerekir
        //var1 || var2 ya da operatörü, sağındaki ve solundaki değerler false ise false değerini verir
        //sağındaki ve solundaki değerlerden birisi true ise true değerini verir.
        //!<var1> değil mi operatörü
        //verilen değişkenin tersini bize verir(true ise false, false ise true)
        boolean x=true,y=false,z=true,t=false,sonuc;
        sonuc=x&&z;
        System.out.println("x ve z nin and ile karşılaştırılması= "+sonuc);
        sonuc=x&&y;
        System.out.println("x ve y nin and ile karşılaştırılması= "+sonuc);
        sonuc=y||t;
        System.out.println(" y ile t nin and ile karşılaştırılması= "+sonuc);
        sonuc=x||y;
        System.out.println("x ve y nin ya da ile karşılaştırılması= "+sonuc);
        sonuc=!x;
        System.out.println("x değişkeninin tersini alma= "+sonuc);
        sonuc=!y;
        System.out.println("y değişkeninin tersini alma= "+sonuc);
        // mantıksal operatörlerde or un tersi ,<var1> ^ <var2> xor işareti
        //false false da true, true true de false
        sonuc=x^z;
        System.out.println("x ve z ya da operatörünün tersi ^ ile karşılaştırılması "+sonuc);
        sonuc=x^y;
        System.out.println("x ve y operatörünün tersi ^ ile karşılaştırılması ");



    }
}
