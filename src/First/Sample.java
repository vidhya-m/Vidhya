//Array concepts
package First;
import java.util.*;

/**
 * Created by expert on 7/2/18.
 */
public class Sample {
    //   public static void main(String[] args) {
//        int a[]=new int[3];
//        int b[]={1,2,3};
//        int []c=new int[4];
//        c[0]=1;
//        c[1]=2;
//        c[2]=3;
//        c[3]=4;
//        int[] d=new int[]{5,9,10,20};
//        int length=a.length;
//            System.out.println(length);
//
//        for(int i=0;i<=c.length-1;i++)
//            System.out.println(c[i]);
//        char ch[]={'a','b','c','d'};
//        String[] str={"one","two","three"};
//        for(int i=0;i<=ch.length-1;i++){
//            System.out.println(ch[i] + " ");
//        }
//        for(int i=0;i<=str.length-1;i++){
//           System.out.println(str[i]+" ");
//        }
//        //for each loop
//        for(String obj:str){
//            System.out.println(obj);
//        }
//        int a[]=new int[5];
//        Scanner s=new Scanner(System.in);
//        for(int i=0;i<=a.length-1;i++){
//            a[i]=s.nextInt();
//        }
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.println(a[i]+" ");
//        }
    //for(int obj:a){
    //   System.out.println(obj);

    //}
//
//    public void display(int x[]) {
//        for (int i = 0; i <= x.length-1; i++)
//            System.out.println(x[i]);
//        System.out.println("After sorting");
//        for (int i = 0; i <= x.length - 1; i++) {
//            for (int j = i + 1; j <= x.length - 1; j++) {
//                if (x[i] > x[j]) {
//                    int temp = x[i];
//                    x[i] = x[j];
//                    x[j] = temp;
//
//                }
//            }
//        }
//        for (int i = 0; i <= x.length-1; i++)
//            System.out.println(x[i]);
//    }

    public void display(int x[]) {
        for (int i = 0; i <= x.length-1; i++)
            System.out.println(x[i]);
        System.out.println("After sorting");
        for (int i = 0; i <= x.length - 1; i++) {
            for (int j = i + 1; j <= x.length - 1; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }
            }
        }
        for (int i = 0; i <= x.length-1; i++)
            System.out.println(x[i]);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        int[] d = new int[]{9, 4, 7, 8};
        s.display(d);
        int a[][] = {{1, 2, 3}, {5, 6, 7}};
        int row = a.length;//no of rows
        int col = a[0].length;//no of columns
        for (int i = 0; i <= a.length - 1; i++){
            for (int j = 0; j <= a[0].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
        System.out.println(" ");
    }
        int c[][]=new int[3][3];
    }
}