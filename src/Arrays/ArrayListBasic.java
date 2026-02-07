package Arrays;
import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(45);
        arr.add(23);
        arr.add(26);

        System.out.println(arr);  //not traversing the array by ourselves

        int n = arr.size();
//        for(int i = 0; i<n; i++){
//            System.out.print(arr.get(i)+" ");
//        }for(int ele : arr) {
//            System.out.print(ele+" ");
//        }
        int i =0, j=arr.size() -1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }
        System.out.println(arr);
    }

}
