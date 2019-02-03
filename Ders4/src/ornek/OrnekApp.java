package ornek;


public class OrnekApp {
    public static void main(String[] args) {
        int i;
        for(i=0;i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz= "+i);
            }else if(i%5==0){
                System.out.println("buzz= " + i);
            }else if(i%3==0){
                System.out.println("fizz= " + i);


            }
        }
    }
}
