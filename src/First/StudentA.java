package First;
import java.lang.reflect.Method;

/**
 * Created by expert on 8/27/18.
 *
 *
 */
public class StudentA {
    @College(name="xxx",location="tcr")
    public void getInfo(){
    }
    @College(name="yyy",location="ekm")
    public void getDetails(){

    }

    public static void main(String[] args) {
        try{
            Method m=StudentA.class.getMethod("getInfo");
            College collegeAnnotation=(College) m.getAnnotation(College.class);
            if(collegeAnnotation!=null){
                System.out.println("Name : "+collegeAnnotation.name());
                System.out.println("Age : "+collegeAnnotation.location());
                System.out.println("------------------------------------------");
            }
        } catch (NoSuchMethodException e){
            System.out.println("NoSuchMethodException");
        }
    }
}
