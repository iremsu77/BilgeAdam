package nesne;

public class StartApp2 {
    public static void main(String[] args) {


        Dikdortgen dikdortgen1 = new Dikdortgen();
        dikdortgen1.alan =5;
        System.out.println("dikdortgen1 alanı= "+dikdortgen1.alan);
        Dikdortgen dikdortgen2=new Dikdortgen();
        //dikdortgen1 artık dıkdortgen2 nin heap de oluşturduğu objeyi
        //(örneklendirme,instance) refer ettiği için
        //refer ettiği örneklendirmenin değerlerini alır.
        //dikdortgen1'in önceden refer ettiği örneklendirme
        //gc tarafından yok edilir.(destroy)
        dikdortgen1=dikdortgen2;
        System.out.println("dikdortgen1 in alanı= "+dikdortgen1.alan);
        dikdortgen1.alan=6;
        System.out.println("dikdortgen1 alanı= "+dikdortgen1.alan);
    }
}
