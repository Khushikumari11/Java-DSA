// 1. How do you reverse a string in Java?
public class StringReverse{
    public static void main(String[] args){
        String str = "Hello World";
        int length = str.length();
        String rev = " ";
        for(int i=length-1 ;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}
