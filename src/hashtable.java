import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


public class hashtable {
    public static void main(String[] args) {
        Map<Integer,String> map=new Hashtable<>();
        map.put(3,"Restassured");
        map.put(1,"Selenium");
        map.put(2,"Java");
        map.put(null, "Playwright"); //not allowed
        map.put(4, null); //not allowed

        System.out.println(map);
    }
}
