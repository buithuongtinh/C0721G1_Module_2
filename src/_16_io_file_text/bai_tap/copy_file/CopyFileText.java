package _16_io_file_text.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private List<String> myList = new ArrayList<String>();

    public void readFile(String stringPath){
        try{
            FileReader fileReader = new FileReader(stringPath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                myList.add(line);
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String stringPath){
        try{
            FileWriter fileWriter = new FileWriter(stringPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (byte i = 0;i < myList.size(); i ++){
                String line = myList.get(i) +  "\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.readFile("src\\_16_io_file_text\\bai_tap\\copy_file\\source.csv");
        copyFileText.writeFile("src\\_16_io_file_text\\bai_tap\\copy_file\\target.csv");
    }
}
