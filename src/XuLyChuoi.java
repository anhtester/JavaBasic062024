public class XuLyChuoi {
    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String s2 = "Sed do eiusmod tempor incididunt.";

        //Chuỗi bắt đầu từ 0, tính khoảng trắng là 1 kí tự

        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6, 11));

        //Ghép chuỗi
        System.out.println(s1 + " " + s2);

        //Chuyển kiểu in hoa thường
        System.out.println(s2.toLowerCase()); //Chữ thường
        System.out.println(s2.toUpperCase()); //Chữ in hoa

        //Xoá kí tự khoảng trắng 2 đầu
        String s3 = "  Test Automation ";
        System.out.println(s3.trim());

        //Độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + s2.length());

        //Tìm kiếm kí tự
        System.out.println(s1.charAt(10));

        //Tìm kiếm vị trí
        System.out.println(s1.indexOf("m"));

        //So sánh chuỗi
        //+ So sánh bằng
        String s4 = "Test Automation";
        String s5 = "test automation";
        System.out.println(s4.equals(s5));

        //+ So sánh chứa
        System.out.println(s4.contains("Automation123"));

        //So sánh bỏ qua hoa thường
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
