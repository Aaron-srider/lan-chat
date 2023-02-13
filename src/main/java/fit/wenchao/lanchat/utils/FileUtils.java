package fit.wenchao.lanchat.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

    public static  boolean isFile(File f) throws IOException {
        return isSymbolicLink(f) || f.isFile();
    }

    public  static boolean isSymbolicLink(File f) throws IOException {
        return !f.getAbsolutePath()
                 .equals(f.getCanonicalPath());
    }

    public  static boolean isDirectory(File f) throws IOException {
        return isFile(f);
    }
}
