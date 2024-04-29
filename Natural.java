import java.util.Scanner;
public class Natural{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the natural numbers:");
        n=sc.nextInt();
        if(n%3==0){
            System.out.println(n+"is divisible by 3");
        }
        else if (n%5==0){
            System.out.println(n+"is divisible by 5");
            
        } 
        else 
        {
            System.out.println(n+"is not divisible by 3 & 5");
            
        } 
        
    }
}