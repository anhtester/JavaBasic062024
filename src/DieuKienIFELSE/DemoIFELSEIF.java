package DieuKienIFELSE;

public class DemoIFELSEIF {
    public static void main(String[] args) {

        double dtb = 10;

        if(dtb > 10 || dtb < 0){
            System.out.println("Không hợp lệ");
        }else {
            if(dtb >= 8 && dtb <= 10){
                System.out.println("Giỏi");
            }else if(dtb < 8 && dtb >= 6.5){
                System.out.println("Khá");
            }else if(dtb < 6.5 && dtb >= 5){
                System.out.println("Trung bình");
            }else if(dtb < 5 && dtb >= 3.5){
                System.out.println("Yếu");
            }else {
                System.out.println("Ở lại lớp");
            }
        }

    }
}
