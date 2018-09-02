package second;

/**
 * Created by expert on 8/31/18.
 */
public class GenericEx2 {
    public <T extends Number> void print(T Mark1,T Mark2){
        double result=Mark1.doubleValue()+Mark2.doubleValue();
        //doubleValue() accepts int,float,double
        System.out.println("SUM = "+result);
    }

    public static void main(String[] args) {
        GenericEx2 g=new GenericEx2();
        g.print(10,20);
        g.print(10.0f,30.0f);
        g.print(30.00d,30.00d);
    }
}
