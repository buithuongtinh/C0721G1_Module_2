package _18_regex_and_string.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    //Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    // chứa các ký tự đặc biệt
    //Theo sau ký tự bắt đầu là 4 ký tự số
    //Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    private static final String CLASS_NAME = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassName() {
    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
