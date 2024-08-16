package Arrays;

public class DemoMang1 {
    public static void main(String[] args) {

        //Khai báo mảng rỗng, chưa mang giá trị
        int number1[] = new int[6];

        //Gán giá trị cho mảng
        number1[0] = 40;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 5;
        number1[4] = 10;
        number1[5] = 99;

        System.out.println("Độ dài mảng: " + number1.length);

        System.out.println(number1[4]);

        System.out.println("===========================");
        //Duyệt mảng để lấy giá trị ra
        for (int i = 0; i < number1.length; i++){
            System.out.println(number1[i]);
        }

        System.out.println("===========================");
        for (int i = 2; i < 5; i++){
            System.out.println(number1[i]);
        }

        System.out.println("===========================");
        for (int number : number1){
            System.out.println(number);
        }

    }
}
