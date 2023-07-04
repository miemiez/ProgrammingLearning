package Day147Java归总练习;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt");
        byte[] bytes = {97,98,99,100,101};//a.b.c.d.e
        fos.write(bytes);
        fos.write(bytes,1,2);
        fos.close();
    }



}
