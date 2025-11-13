public class SumOfDigits {
    public static void main(String[] args) {
        String num="12345";
        char[] arr=num.toCharArray();
        int sum=0;
        for(char c:arr){
            sum=sum+Character.getNumericValue(c);
        }
        System.out.println("sum: "+sum);
    }
}
