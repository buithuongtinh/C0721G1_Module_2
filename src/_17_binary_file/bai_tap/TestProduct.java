package _17_binary_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    Product product = new Product();
    private static List<Product> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------Quản Lý Sản Phẩm -------------- ");
            System.out.println("1 : Hiển thị danh sách");
            System.out.println("2 : Thêm sản phẩm");
            System.out.println("3 : Tìm kiếm theo id sản phẩm");
            System.out.println("4 : Kết thúc.");
            System.out.println("Nhập vào chức năng muốn chọn: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                   display();
                    break;
                case 2:
                   add();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.exit(4);
                default: {
                    System.out.println("Nhập sai hãy nhập lại .");
                    break;
                }
            }
        }
    }
    public static void writeFile(String pathFile, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String pathFile) {
        try {
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream obj = new ObjectInputStream(fis);
            list = (List<Product>) obj.readObject();
            obj.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("file trống");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào id sản phẩm muốn tìm kiếm");
        int id = scanner.nextInt();
        boolean check = false;
        for (Product products:list){
            if (id == products.getIdProduct()){
                check = true;
                System.out.println(products);
            }
        }
        if (check == false){
            System.out.println("ko có");
        }
    }
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id sản phẩm");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất");
        String Manufacturer = scanner.nextLine();
        System.out.println("Nhập vào số tiền");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mô tả khác");
        String MoTaKhac = scanner.nextLine();
        list.add(new Product(idProduct, nameProduct, Manufacturer, price, MoTaKhac));
        writeFile("src\\_17_binary_file\\bai_tap\\products.csv", list);

    }
    public static void display() {
        readFile("src\\_17_binary_file\\bai_tap\\products.csv");
        for (Product products : list) {
            System.out.println(products);
        }
    }
}
