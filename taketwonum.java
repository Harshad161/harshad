import java.util.Scanner;

public class taketwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number : ");
        int a = sc.nextInt();

        System.out.print("enter second number : ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("number are equal");
        }else if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is greater than a");
            }
    }
}
