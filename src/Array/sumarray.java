package Array;

public class sumarray {
    public static void main(String args[]){
        int[] arr={2,5,6,9,56,84};
        int sum=0;
                for(int i=0;i< arr.length;i++){
                    sum+=arr[i];
                }
        System.out.println(2*sum);
    }
}
