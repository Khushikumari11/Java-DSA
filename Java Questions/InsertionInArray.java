import java.util.Scanner;
public class InsertionInArray {
    public static void main(String[] args){
        int capacity = 50;
        int a[] = new int[50];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0; i<size; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Array before insertion is: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+", ");

        }
        System.out.println("Enter the element to be inserted: ");
        int x = in.nextInt();
        System.out.println("Enter the position where you want to insert that element: ");
        int pos = in.nextInt();

        for(int i=size; i>pos; i--){
            a[i]=a[i-1];
        }
        a[pos]=x;
        ++size;

        System.out.println("Array after insertion is: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+ ", ");
        }
    }
}
