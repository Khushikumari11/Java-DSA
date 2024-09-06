import java.util.Scanner;
public class Deletion {
    public static void main(String[] args){
        int a[] = new int[50];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0; i<size; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter the position where you want to delete that element: ");
        int pos = in.nextInt();

        for(int i=pos; i<size; i++){
            a[i]=a[i+1];
        }
        --size;
        System.out.println("Array after deletion is: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+ ", ");
        }
    }
}
