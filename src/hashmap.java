import java.util.HashMap;
import java.util.Map;

//Order: Unordered
//Allows null key
//Not synchronized → Not thread-safe
public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Selenium");
        map.put(2,"Java");
        map.put(3,"Restassured");
        map.put(null, "Playwright"); // allowed

        System.out.println(map);
    }
}
