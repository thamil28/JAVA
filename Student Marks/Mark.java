import java.util.Scanner;
public class Mark{
    public static void main (String[] args) {
        int mark;
        
        
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mark:");
        mark=obj.nextInt();
        if (mark>90){
            System.out.println("distinction");
            
        }
        else if (mark>=80 && mark<=90){
        System.out.println("grade A");    
        }
        else if (mark>=70 && mark<=80){
            System.out.println("grade B");
            
        } 
        else if (mark>=60 && mark<=70){
            System.out.println("grade C");
            
        } 
        else if (mark>=40 && mark<=60 ){
            System.out.println("grade D");
        } 
        else if (mark>=0 && mark<=40){
            System.out.println("fail U");
        }
    } 
}
        
        
        
    

