// 4. Write a Java program to check if the given number is a prime number.
import java.util.Scanner;
public class CheckingPrime{
    public static void main(String[] args){
        System.out.print("Enter a number to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
             isPrime=false;
            }
        }
        if(isPrime==false){
            System.out.print("Not a Prime number");
        }
        else{
            System.out.print("Prime number");
        }
    }
}