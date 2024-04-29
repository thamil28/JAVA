import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user name:");
        String name=sc.next();
        if (name.equals("test")){
            System.out.println("correct");
            
        }
        else{
            System.out.println("not correct");
        }
    }
}