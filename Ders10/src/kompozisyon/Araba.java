package kompozisyon;

public class Araba {
    private Motor motor;
    public Araba(){
        motor=new Motor();

    }
    public void hareketZamani(){

        motor.motorucalistir();
        System.out.println("Araba harekete geçti");
    }
    public void durmaZamanı(){
        motor.motoruDurdur();
        System.out.println("araba hareketsiz durumda");

    }

}
