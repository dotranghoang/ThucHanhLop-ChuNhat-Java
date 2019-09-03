import java.util.Scanner;

public class LopChuNhat {
    double width , height;

    public LopChuNhat(double width , double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height)* 2;
    }

    public String display() {
        return "Hình Chữ Nhật \n Rộng: "+ width +" Cao: " + height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài:");
        double height = scanner.nextDouble();

        LopChuNhat lopChuNhat = new LopChuNhat(width,height);
        System.out.println(lopChuNhat.display());
        System.out.println("Diện tích : " + lopChuNhat.getArea());
        System.out.println(("Chu vi : " + lopChuNhat.getPerimeter()));
    }
}
