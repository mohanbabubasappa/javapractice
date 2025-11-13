import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Order: Sorted by key (ascending by default)
//Null keys not allowed (throws NullPointerException)
//Not synchronized
public class treemap {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(3,"Restassured");
        map.put(1,"Selenium");
        map.put(2,"Java");
        map.put(null, "Playwright"); //not allowed

        System.out.println(map);
    }
}
