package ex_17_array;

public class Lab097_Array_lineraSearch {
    public static void main(String[] args) {
        int target = 89;
        int[] i ={34,1,2,89,56};

        for(int j =0 ; j < i.length ; j++){
            if(i[j] == target){
                System.out.println(i[j]+" match found");
            }

        }
    }
}
