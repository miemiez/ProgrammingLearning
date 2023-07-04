package Day0615.myobjectsstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class aa {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/dreamtank131/Desktop/a.txt");
        f.createNewFile();
    }
}
