package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Set
        //không lưu được dữ liệu trùng lặp
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");

        System.out.println(menu.contains("Tasks12345"));
        menu.remove("Sales");
        System.out.println(menu.size());

        System.out.println("Các phần tử của Set");
        System.out.print("\t" + menu + "\n");

        System.out.println("\n=======================");
        //Duyệt giá trị trong SET
        // Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n=======================");
        // Show set through for-each
        for (String obj : menu) {
            System.out.println(obj);
        }

    }
}
