import java.util.Scanner;

class Student{
    public int id;
    public void setID(){
        id = scn.nextInt();
        
    }
}
/**
 * class_test
 */
public class class_test {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int id;
        Student std[] = new Student[5];
        for(int i=0;i<5;i++){
            std[i].setID();
            
        }
        System.out.println(std[0]);

    }

}