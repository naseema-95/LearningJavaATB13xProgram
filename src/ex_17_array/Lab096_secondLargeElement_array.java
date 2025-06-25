package ex_17_array;

public class Lab096_secondLargeElement_array {
    public static void main(String[] args) {
        int[] arr = {1,78,98,90,89,23,99};

        int maxip = sec_arr(arr);
        System.out.println(maxip);
      }

    static int sec_arr(int[] array){
        int sec_max = array[0];

        for(int i =0; i < array.length; i++)
        {
            if(array[i] > sec_max){
                sec_max=array[i-1];
            }
        }
        return sec_max;
    }

}
