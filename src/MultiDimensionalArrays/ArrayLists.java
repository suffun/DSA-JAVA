package MultiDimensionalArrays;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22); a.add(32); a.add(88); a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(22); b.add(32); b.add(88); b.add(2);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(22); c.add(32); c.add(88); c.add(2);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        for(int i = 0; i<arr.size(); i++){
            for(int j =0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
