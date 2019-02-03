package dallanmaifadeleri;



public class DallanmaIfadeleriApp {
    public static void main(String[] args) {
        int i;

        /*for(i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                break;*/
        /*for(i=0;i<5;i++){

            if(i==3){
                break;
            }
            System.out.println(i);*/
        i=0;
        while(i<5){
            i++;
            if(i==3){
                break;
                //break yerine continue yazarsan 3 ü atlar devam eder, return yazarsan break gibi devam eder
            }
            System.out.println(i);
        }
    }
}
