// 2. How do you swap two numbers without using a third variable in Java?
public class SwapTwoNums{
    public static void main(String[] args){
        int a =25;
        int b=99;
        a = a + b;
        b = a - b;
        a = a- b;
        System.out.print(a+" ");
        System.out.print(b);
    }
}