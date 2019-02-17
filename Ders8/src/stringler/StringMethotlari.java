package stringler;

public class StringMethotlari {
    public static void main(String[] args) {
        String deger="Merhaba Java";
        System.out.println(deger.toUpperCase());
        System.out.println(deger.toLowerCase());
        /*deger.toLowerCase();
        System.out.println(deger) dersek calısmaz
        deger=deger.toLowerCase();
        System.out.println(deger)
        dersek calısır
         */
        System.out.println(deger.charAt(8));
        //deger.charAt verdiğim indeks numarasındaki değeri alırız
        System.out.println(deger.indexOf('J'));
        //verdiğim harfin kaçıncı indekste olduğunu gösteriyor indexOf()
        System.out.println(deger.indexOf('a'));
        //ilk a yı
        System.out.println(deger.lastIndexOf('a'));
        //son a yı verir
        System.out.println(deger.substring(8));
        //verilen indis numarasından başlayıp geriye kalan tüm ifadeyi getirir
        //verilen indis numarası da dahil
        System.out.println(deger.substring(0,3));
        //substring 0 ile 3. indis arasındakileri yazdır 3 ü alma
        System.out.println(deger.substring(5,7));
        //5. indisten başla 7.indise kadar(7. indis dahil değil)
        System.out.println(deger.concat(", Naber Cınım?"));
        System.out.println(deger+", Naber");
        System.out.println(deger.replace('a','o'));
        //a yerine o harfi koyar
        System.out.println(deger.replaceAll(" ",""));
        //boşlukları kaldır
        System.out.println(deger.replaceAll(""," "));
        String bosluk=" Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim());
        //sağ ve soldaki boşlukları siler

        String adSoyad="Ramazan Karagöz";
        String ad="";
        String soyad="";
        int boslukDeger=adSoyad.indexOf(" ");
        System.out.println("bosluk deger,= "+boslukDeger);
        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);
        System.out.println("adı= "+ad);
        System.out.println("Soyadi="+soyad);
        char[] dizi=deger.toCharArray();
        for(char c:dizi){
            System.out.println(c);
        }
        String a="12";
        //ilkel tipe dönüştürmek için parseInt() methodu kullanılır.
        int sayi=Integer.parseInt(a);
        System.out.println(sayi);
        //(wrapper) Nesne tipe dönüştürmek için valueOf methodu kullanılır
        Integer sayi2=Integer.valueOf(a);
        //primitive tipleri String veri tipine dönüştürmek için valueOf kullanılır
        String stringSayi=String.valueOf(sayi);
        String stringSayi2=sayi2.toString();
        //(Wrapper) Nesne tipindeki bir değeri stringe çevirmek için value of kullanılabilir
        //String.valueOf methodu object türünden nesne aldığı için
        //javada tüm nesneler object sınıfından türer.
        String asa=String.valueOf(sayi2);
        double doubleSayi=Double.parseDouble(a);
        System.out.println(doubleSayi);







    }
}
