package _01_introducto_java.bai_tap;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập số cần đọc: " );
        int so = Integer.parseInt(input.nextLine());

        int hangTram = so / 100;
        int hangChuc = (so - hangTram * 100) / 10;
        int hangDonVi = so -hangTram * 100 - hangChuc * 10 ;

        if ( so < 0 || so > 999){
            System.out.println("số bạn nhập sai");
        }else {
            if (hangChuc == 1){
                hangTram(hangTram);
                hangChuc(hangChuc,hangDonVi);

            }else {
                hangTram(hangTram);
                hangChuc(hangChuc,hangDonVi);
                hangDonVi(hangDonVi);
            }
        }

    }
    public static void hangDonVi(int donVi){
        switch (donVi){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }

    }

    public static void hangChuc(int chuc,int donVi ){
        if (chuc == 1){
            switch (10 + donVi){
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }


        }else {
            switch (chuc ){
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;

            }
        }
    }
    public static void hangTram(int tram){
        switch (tram){
            case 1:
                System.out.println("one hundred");
                break;
            case 2:
                System.out.println("two hundred");
                break;
            case 3:
                System.out.println("three hundred");
                break;
            case 4:
                System.out.println("four hundred");
                break;
            case 5:
                System.out.println("five hundred");
                break;
            case 6:
                System.out.println("six hundred");
                break;
            case 7:
                System.out.println("seven hundred");
                break;
            case 8:
                System.out.println("eight hundred");
                break;
            case 9:
                System.out.println("nine hundred");
                break;
        }
    }
}
