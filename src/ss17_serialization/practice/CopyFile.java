package ss17_serialization.exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileUsingJava7Files(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer,0,length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print(" Enter source file:");
        String sourcePath = in.nextLine();
        System.out.print(" Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File dethFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile , dethFile);
        } catch (IOException ioe ) {
            System.out.print("Can't copy that file");
            System.out.print(ioe.getMessage());
        }
    }
}