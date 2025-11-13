import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        int max=list.stream().max(Integer::compareTo).get();
        int min=list.stream().min(Integer::compareTo).get();

        System.out.println(max);
        System.out.println(min);
        }
    }
