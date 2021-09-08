package _16_io_file_text.bai_tap.read_file;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src\\_16_io_file_text\\bai_tap\\read_file\\countries.csv");
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                displayList(addOn(line));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> addOn(String line){
        List<String> array = new ArrayList<>();
        if (line!= null){
            String[] splitArray = line.split(",");
            array.addAll(Arrays.asList(splitArray));
        }
        return array;
    }

    public static void displayList(List<String> country){
        System.out.println("ID:"+country.get(0)+", Code:"+country.get(1)+", Name:"+country.get(2));
    }
}