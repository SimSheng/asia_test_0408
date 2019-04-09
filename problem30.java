import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

/**
 * problem30
 */

public class problem30 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ID[] = new int[5],d;
        String NAME[] = new String[5],n;
        int ch[] = new int[5],en[] = new int[5],ma[] = new int[5],c,e,m;
        float avg[] = new float[5],a;
        float cavg=0, eavg=0, mavg=0;

        for(int i=0;i<5;i++){
            ID[i] = scn.nextInt();
            NAME[i] = scn.nextLine();
            ch[i] = scn.nextInt();
            en[i] = scn.nextInt();
            ma[i] = scn.nextInt();
            avg[i] = ((float)(ch[i])+(float)(en[i])+(float)(ma[i]))/(float)(3);
            
        }
        for(int i=0;i<5;i++){
            cavg+=ch[i];
            eavg+=en[i];
            mavg+=ma[i];
        }
        cavg/=5;
        eavg/=5;
        mavg/=5;

        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                if(avg[j]<avg[j+1]){
                    d=ID[j]; ID[j]=ID[j+1]; ID[j+1]=d;
                    n=NAME[j]; NAME[j]= NAME[j+1]; NAME[j+1]=n;
                    c=ch[j]; ch[j]=ch[j+1]; ch[j+1]=c;
                    e=en[j]; en[j]=en[j+1]; en[j+1]=e;
                    m=ma[j]; ma[j]=ma[j+1]; ma[j+1]=m;
                    a=avg[j]; avg[j]=avg[j+1]; avg[j+1]=a;

                }
            }
        }

        System.out.println("ID\tNAME\tChinese\tEnglish\tMath\tAvg");

        for(int i=0;i<5;i++){
            System.out.println(ID[i] + "\t" + NAME[i] + "\t" + ch[i] + "\t" + en[i] + "\t" + ma[i] + "\t" + avg[i]);
        }
        System.out.println("AVG:\t\t" + cavg +"\t" +eavg +"\t"+mavg);
        

    }
}