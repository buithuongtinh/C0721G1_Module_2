package _04_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a, b, c ;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return (b*b - 4 * a * c) ;

    }

    public double  getRoot1(){
        if (this.getDiscriminant()>=0)
            return ((-b)+ Math.sqrt(b*b - 4*a*c))/(2*a) ;
        else
            return 0;
    }
    public double  getRoot2(){
        if (this.getDiscriminant()>=0)
            return ((-b)- Math.sqrt(b*b - 4*a*c))/(2*a);
        else
            return 0;
    }
    public void getRoot(){
        if (getDiscriminant()>0 ){
            System.out.println("Phương trình có 2 nghiệm:\n" +
                    "x1 = "+ this.getRoot1()+"\n" +
                    "x2 = "+ this.getRoot2());
        }else if (getDiscriminant()==0){
            System.out.println("Phương trình có 1 nghiệm x = "+ this.getRoot1());
        }else
            System.out.println("Phường trình vô nghiệm !");

    }
}
