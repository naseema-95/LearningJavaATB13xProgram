package ex_17_array;

public class Lab095_Array_Sum {
    public static void main(String[] args) {
        int sum = 0;
        int[] i = {1,3,5,7,9};

        for(int j =0; j < i.length; j++){
            sum = sum+i[j];
        }
        System.out.println(sum);
    }
}
