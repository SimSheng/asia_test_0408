import java.util.Scanner;

/**
 * problem33
 */
public class problem33 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            count+=Math.pow(2, i);
        }

        System.out.println(count);
    }
}