package StaticJava;

public class Counter1 {
    int count = 0; // sẽ lấy bộ nhớ MỚI khi khởi tạo lại class hoặc gọi lại biến này

    Counter1() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter1 c1 = new Counter1(); //Khởi tạo lần 1 //count = 1
        Counter1 c2 = new Counter1(); //Khởi tạo lần 2 //count = 2
        Counter1 c3 = new Counter1(); //Khởi tạo lần 3 //count = 3

    }
}