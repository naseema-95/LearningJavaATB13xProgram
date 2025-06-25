package ex_17_array;

public class Lab092_Array_min_max {
    public static void main(String[] args) {
        int[] marks = {51, 100, 98, 32, 48, 110};
        /* Arrays.sort(marks); easiest way

        for(int i=0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }*/
        int max_output = max_array(marks);
        System.out.println(max_output);

        int min_output = min_array(marks);
        System.out.println(min_output);

    }
     static int max_array(int[] array){
            int max = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        static int min_array(int[] array){
         int min = array[0];

         for(int i =0; i < array.length; i++){
             if(array[i] < min){
                 min=array[i];
             }
         }
        return min;
    }



}
