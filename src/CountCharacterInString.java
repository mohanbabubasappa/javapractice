import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str="i am an indian";
        String newStr=str.replaceAll("\\s","");
        char[] arr=newStr.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
