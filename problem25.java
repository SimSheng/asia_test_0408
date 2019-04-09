import java.util.Scanner;

/**
 * problem25
 */
public class problem25 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if(num <-1){
            System.out.println(3*(num*num));
        }
        else if(num>=-1 && num<=1){
            System.out.println(num*num*num+3*num-3);
        }
        else{
            System.out.println(2*num+3);
        }
    }
}