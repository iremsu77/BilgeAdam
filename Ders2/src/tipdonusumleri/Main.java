package tipdonusumleri;

public class Main {
    public static void main(String[] args){
        //genelde küçük veri titpnden büyük veri tipine doğru olur.
        // dikkat etmemiz gereken büyükten küçüğe tip dönüşümleridir
        //aksi takdirde veri kaybı yaşayabiliriz
        byte bytea=127;
        int intb;
        intb=127;
        bytea=(byte)intb;
        System.out.println("maximum boyutu geçmediğim tip dönüşümü"+bytea);
        //ctrl-shift ile seçtiğimiz satırı commente alabiliriz
        intb=256;
        bytea=(byte)intb;
        System.out.println("maximum boyutu geçtiğinde tip dönüşümü"+bytea);
        String xString;
        Integer xInt= 12;
        xString=xInt.toString();
        //int den string e dönüşüm
        System.out.println(xString);






    }
}
