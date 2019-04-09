import java.util.Scanner;

/**
 * problem29
 */
public class problem29 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int add = scn.nextInt();
        int save=1;
        int i=1;
        while(i<=add){
            save*=i;
            i++;
        }
        System.out.println(save);

        
    }
}