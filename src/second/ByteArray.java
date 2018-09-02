package second;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by expert on 8/30/18.
 */
public class ByteArray {

    public static void main(String[] args) throws IOException {
        String a="Hello";
        byte[] b=a.getBytes();
        FileOutputStream fout1=new FileOutputStream("File1.txt");
        //FileOutputStream fout2=new FileOutputStream("File2.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(b);
        baos.writeTo(fout1);
    }
}
