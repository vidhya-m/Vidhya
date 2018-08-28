package First;
import java.lang.annotation.*;
/**
 * Created by expert on 8/27/18.
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
//To specify where to apply the below annotation
@Retention(RetentionPolicy.RUNTIME)  //Retains annotation at Runtime
public @interface College {
    String name();
    String location();
}

