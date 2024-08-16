package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {

        //Khai báo và gán giá trị cho mảng
        int number2[] = {5, 7, 10, 20, 30, 99};

        //number2[2] = 100;

        System.out.println("Length: " + number2.length);
        System.out.println(number2[4]);
        System.out.println("===========================");
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        String dataCustomerName[] = {"Hoa", "Hồng", "Huệ"};
        System.out.println(dataCustomerName[0]); //Test lần 1
        System.out.println(dataCustomerName[1]); //Test lần 2
        System.out.println(dataCustomerName[2]); //Test lần 3

        boolean check = true;

        for (int i = 0; i < dataCustomerName.length; i++) {
            if(dataCustomerName[i].equals("Huệ")){
                check = true;
                break;
            }else {
                check = false;
            }
        }

        if(check == true){
            System.out.println("Tìm thấy.");
        }else {
            System.out.println("Không tìm thấy.");
        }

        int dataCustomerAge[] = {25, 30, 26};
        System.out.println(dataCustomerAge[0]); //Test lần 1
        System.out.println(dataCustomerAge[1]); //Test lần 2
        System.out.println(dataCustomerAge[2]); //Test lần 3

        System.out.println(dataCustomerName[0]); //Test lần 1
        System.out.println(dataCustomerAge[0]); //Test lần 1
    }
}
