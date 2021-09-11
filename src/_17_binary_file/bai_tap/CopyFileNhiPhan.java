package _17_binary_file.bai_tap;

import java.io.*;

public class CopyFileNhiPhan {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(new File("src\\_17_binary_file\\bai_tap\\source.csv"));
            os = new FileOutputStream(new File("src\\_17_binary_file\\bai_tap\\target.csv"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer))> 0){
                os.write(buffer,0,length);
            }
            System.out.println("file is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }


    }
}
