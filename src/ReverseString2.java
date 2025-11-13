public class ReverseString2 {
    public static void main(String[] args){
        String str="sneha";
        String reverseStr="";
        for(int i=str.length();i>=0;i++){
            reverseStr=reverseStr+str.charAt(i);
        }
        System.out.println("reversed string: "+reverseStr);
    }
}
