package DieuKienIFELSE;

public class DemoIF {
    public static void main(String[] args) {

        int age = 20;
        String address = "Can Tho";
        String header = "Login CMS Page";

        //So sánh bằng trong chuỗi dùng hàm equals()
        //So sánh chứa trong chuỗi dùng hàm contains()

        if ((age > 18) && address.equals("Can Tho")) {
            System.out.println("Được đi NVQS.");
        }

        if (header.contains("CMS")) {
            System.out.println("Đã đến được trang Login.");
        }
    }
}
