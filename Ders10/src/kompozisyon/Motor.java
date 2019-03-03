package kompozisyon;

public class Motor {
    private int motorGucu;

    public Motor() {
        this.motorGucu = 130;
    }
    public void motorucalistir(){
        if(motorGucu>0) {
            System.out.println("motor calisiyor");
        }else{
            System.out.println("motor çaiıştırılamadı");
        }
    }
    public void motoruDurdur(){
        System.out.println("motor durduruldu");
        this.motorGucu=0;
    }
}
