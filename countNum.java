import java.util.Scanner;

/**
 * countNum
 */
public class countNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num[] = new int[6];
        for(int i=0;i<6;i++){
            num[i] = scn.nextInt();
        }
        int save[] = new int[3];
        for(int i=0;i<6;i++){
            if(num[i] > 0){
                save[0]++;  // save[0] save number>0
            }
            else if(num[i]==0){
                save[1]++;  // save[1] save number=0
            }
            else{
                save[2]++;  // save[2] save number<0
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(save[i]);
        }
    }
}