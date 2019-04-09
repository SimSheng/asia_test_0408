import java.util.Scanner;

/**
 * problem32
 */
public class problem32 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        double count=0;

        for(int i=1;i<=num;i++){
            count+=(double)(1)/(double)(((i*2-1)*i*2));
        }

        System.out.println(count);
    }
}