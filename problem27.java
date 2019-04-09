import java.util.Scanner;

/**
 * problem27
 */
public class problem27 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float phoneTime = scn.nextFloat();

        if(phoneTime < 600){
            System.out.println(phoneTime * 0.5);
        }
        else if(phoneTime >= 600 && phoneTime <=1200){
            System.out.println(phoneTime * 0.9*0.5);
        }
        else{
            System.out.println(phoneTime*0.79*0.5);
        }
        
    }
}