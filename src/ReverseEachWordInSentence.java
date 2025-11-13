public class ReverseEachWordInSentence {
    public  static void main(String[] args) {
        String str = "I love sneha";
        String reverseStr = "";
        String[] arr = str.split(" ");
        for(String word:arr){
            String reverseword="";
            for (int i = word.length()-1; i >= 0; i--) {
                reverseword = reverseword+word.charAt(i);
            }
            reverseStr=reverseStr+reverseword+" ";
        }
        System.out.println("reverseStr: "+reverseStr);
    }
}
