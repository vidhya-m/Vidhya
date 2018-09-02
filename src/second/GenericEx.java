package second;

/**
 * Created by expert on 8/31/18.
 */
public class GenericEx<T>{
    private T t;
    public T get(){
        return t;
    }

    public void set(T t){
        this.t=t;
    }

    public static void main(String[] args) {
        GenericEx<String> type=new GenericEx<>();
        type.set("Ann");
        String str=type.get();
        System.out.println(str);
    }
}

