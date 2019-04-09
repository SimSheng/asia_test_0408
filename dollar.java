import java.util.Scanner;


/**
 * dollar
 */
public class dollar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String dollar = scn.nextLine();
        char save[] = dollar.toCharArray();

        int num[]= new int[dollar.length()];
       
       /* for(int i=0;i<4;i++){
            num[i]=0;
        }
        */
        for(int i=dollar.length()-1;i>=0;i--){
            if((int)(save[i])-48 !=0){
                num[i]=(int)(save[i])-48;
            }
        
        }
        if(dollar.length()==4){
            System.out.println(num[0] + " thousand " + num[1] + " hundred " + num[2] + " ten " + num[3] + " dollar");

        }
        
        else if(dollar.length()==3){
            System.out.println(num[0] + " hundred " + num[1] + " ten " + num[2] + " dollar");

        }
        
        else if(dollar.length()==2){
            System.out.println(num[0] + " ten " + num[1] + " dollar");

        }

        else{
            System.out.println(num[0] + " dollar");
        }
        /*
        if(num[0]  !=0){
            System.out.print(num[0] + " thousand " + num[1] + " hundred " + num[2] + " ten " + num[3] + " dollar");
        }
        else if(num[0] ==0 && num[1] !=0){
            System.out.print(+ num[1] + " hundred " + num[2] + " ten " + num[3] + " dollar");
        }
        else if(num[0] ==0 && num[1] ==0 && num[2] !=0){
            System.out.print(num[2] + " ten " + num[3] + " dollar");
        }
        else{
            System.out.print(num[3] + " dollar");
        }
        */
    }
}