// 3. Write a Java program to check if a vowel is present in a string.
import java.util.Scanner;
public class CheckingVowelinString{
    public static void main(String[] args){
        System.out.print("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean vowelfound = false;
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
               vowelfound= true;
               break;
           }
           }
           if(vowelfound==true){
               System.out.print("Vowel is present");
           }
           else{
               System.out.print("Vowel is not present");
           }
       }
    }