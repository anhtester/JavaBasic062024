public class SwitchCase2 {
    public static void main(String[] args) {
        String browser = "  Firefox ";

        //Hàm toLowerCase() dùng chuyển chuỗi về chữ thường
        //Hàm toUpperCase() dùng chuyển chuỗi về chữ in hoa
        //Hàm trim() dùng để cắt bỏ khoảng trắng 2 đầu của chuỗi

        switch (browser.toLowerCase().trim()){
            case "chrome":
                System.out.println("Chạy test với trình duyệt Chrome.");
            case "edge":
                System.out.println("Chạy test với trình duyệt MS Edge.");
            case "firefox":
                System.out.println("Chạy test với trình duyệt Firefox.");
            default:
                System.out.println("Chạy test với trình duyệt Chrome mặc định.");
                break;
        }
    }
}
