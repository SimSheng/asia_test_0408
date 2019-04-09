import java.util.Scanner;

/**
 * problem31
 */
public class problem31 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            count+=i*(i+1);
        }

        System.out.println(count);
    }
}