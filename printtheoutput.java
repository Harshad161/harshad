import java.util.Scanner;

public class printtheoutput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the number in between ( 1 , 2 , 3 ) : ");
        int number = sc.nextInt();

        if(number==0){
            System.out.println("Hello ");
        }else if(number==2){
            System.out.println("Namaste ");
        }else if(number==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("invalid number ");
        }
    }
}
