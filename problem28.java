import java.util.Scanner;

/**
 * problem28
 */
public class problem28 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int add = scn.nextInt();
        int save=1;

        for(int i=1;i<=add;i++){
            save*=i;
        }
        System.out.println(save);

        
    }
}