//Row wise 2D array sorting
package First;
import java.util.*;
/**
 * Created by expert on 7/2/18.
 */
public class Samples {
    public void display(int x[][]) {
        int row=x.length;
        int col=x[0].length;
        System.out.println("After row-wise sorting");
        for (int i = 0; i <= x.length-1; i++){
            for(int j=0;j<=x[0].length-1;j++){
                for(int k=j+1;k<=x[0].length-1;k++){
                    if(x[i][j]>x[i][k]){
                        int temp=x[i][j];
                        x[i][j]=x[i][k];
                        x[i][k]=temp;
                    }
                }
            }
        }
        for (int i = 0; i <= x.length - 1; i++){
            for (int j = 0; j <= x[0].length - 1; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        Samples s = new Samples();
        int a[][] = {{8,2,7}, {8,6,7}};
        s.display(a);
    }
}