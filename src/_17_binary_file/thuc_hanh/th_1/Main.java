package _17_binary_file.thuc_hanh.th_1;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "src\\_17_binary_file\\thuc_hanh\\th_1\\source.csv";
        String destPath = "src\\_17_binary_file\\thuc_hanh\\th_1\\dest.csv";
        CopyFile.copyFile(sourcePath, destPath);
    }
}
