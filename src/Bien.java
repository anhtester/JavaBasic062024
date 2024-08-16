public class Bien {

    String address = "Can Tho"; // Đây là biến toàn cục

    static String phone = "0939206009"; // Đây là biến static

    //Hàm thứ nhất
    public void sayHello() {
        int n = 10;      // Đây là biến cục bộ
        System.out.println("Gia tri cua n la: " + n);

        System.out.println(address);
    }

    //Hàm thứ hai
    public void getInfo(){
        //System.out.println(n);
        System.out.println(address);
    }

    public static void main(String[] args) {

        //Cách thức để gọi một thành phần trong 1 class vào hàm bất kỳ.
        Bien bien = new Bien();
        System.out.println(bien.phone);

        //System.out.println(address); //Gọi từ biến toàn cục
        System.out.println(phone); //Gọi từ biến static

        //Đây là ghi chú
        //Khai báo biến

        int number1 = 123456;
        int number2 = 789;

        String name = "Nhung";
        String Name = "Hoa";
        String NAme = "Trung";

        String ten = "Linh";

        String email = "admin@example.com";

        //In giá trị của biến ra màn hình

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(ten);
    }
}
