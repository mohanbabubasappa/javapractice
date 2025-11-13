public class SecondHighest {
    public static void main(String[] args){
        int[] arr={1,4,6,8,9,5,3};
        int highest=arr[0];
        int secondHighest=arr[0];
        for(int value:arr){
            if(value>highest){
                secondHighest=highest;
                highest=value;
            }
            else if(value>secondHighest&&value<highest){
                secondHighest=value;
            }
        }
        System.out.println(highest);
        System.out.println(secondHighest);
    }
}
