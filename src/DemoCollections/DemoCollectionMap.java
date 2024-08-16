package DemoCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Map
        //không lưu được 2 key trùng lặp
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        //Thêm dữ liệu
        map1.put("language", "Java");
        map1.put("framework", "TestNG");
        map1.put("library", "Selenium");

        map2.put(1, 111D);
        map2.put(2, 222D);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        //Update value
        map1.put("library", "Playwright");

        System.out.println(map1.containsKey("language123"));
        System.out.println(map1.containsValue("Java123"));
        //map1.remove("library");

        //Duyệt kiểu dữ liệu Map
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
