import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a value:");
        int n=scanner.nextInt(); 
        
        
    System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int val=n*fact(n-1);
        return val;
        }
    }