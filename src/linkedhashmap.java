import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Order: Maintains insertion order (or access order if configured)
//Allows null key
//Not synchronized
public class linkedhashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Selenium");
        map.put(2,"Java");
        map.put(3,"Restassured");
        map.put(null, "Playwright"); // allowed

        System.out.println(map);
    }
}
