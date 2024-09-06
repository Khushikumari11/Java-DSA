
import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        String one = "Hello";
        String two = "elloH";
        boolean isanagram = false;
        if(one.length()!= two.length()){
            System.out.print("Not anagram");
        }
        else{
            char[] str1 = one.toCharArray();
            char[] str2 = two.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            isanagram = Arrays.equals(str1, str2);
        }
        if(isanagram==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}