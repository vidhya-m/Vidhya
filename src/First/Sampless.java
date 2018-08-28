//Column wise 2D array sorting
package First;
        import java.util.*;
public class Sampless {
    public void display(int x[][]) {
        int row=x.length;
        int col=x[0].length;
        System.out.println("After column-wise sorting");
        for (int i = 0; i <= x.length-1; i++){
            for(int j=0;j<=x[0].length-1;j++){
                for(int k=i+1;k<=x.length-1;k++){
                    if(x[i][j]>x[k][j]){
                        int temp=x[i][j];
                        x[i][j]=x[k][j];
                        x[k][j]=temp;
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
        Sampless s = new Sampless();
        int a[][] = {{8,9,9}, {5,6,7}};
        s.display(a);
    }

}