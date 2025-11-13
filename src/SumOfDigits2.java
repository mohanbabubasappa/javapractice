public class SumOfDigits2 {
    public static void main(String[] args) {
        String num = "12345";
        int sum=0;
        int newNum=Integer.parseInt(num);
        while(newNum>0){
            sum=sum+newNum%10;
            newNum=newNum/10;
        }
        System.out.println("sum: "+sum);
    }
}