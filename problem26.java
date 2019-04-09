import java.util.Scanner;

/**
 * problem26
 */
public class problem26 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num[][] = new int[5][7];
        int save[][]= new int [7][5];

        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                num[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                save[j][i]=num[i][j];
            }
        }
        for(int i=0;i<7;i++){
            for(int j=0;j<5;j++){
                System.out.print(save[i][j] +"\t");
            }
            System.out.println();
        }
    }
}