public class ReverseString {
    public static void main(String[] args) {
        String str="mohan";
        String reverseStr="";
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            reverseStr=reverseStr+arr[i];
        }
        System.out.println("reversed string: "+reverseStr);
    }
}