public class StringPalindrome{
    public static void main(String[] args){
        String str = "haah";
        String original = str;
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev= rev + str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(original)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}