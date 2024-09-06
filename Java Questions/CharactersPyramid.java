//include both upper and lower pyramid part:
public class CharactersPyramid{
    public static void main(String[] args){
        int n =5;
        for(int i=1,p='A';i<=n;i++,p++){
           
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)p +" ");
            }
            System.out.println();
        }
        for(int i=1,p='E'-1;i<n;i++,p--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print((char)p+ " ");
            }
            System.out.println();
        }
    }
}