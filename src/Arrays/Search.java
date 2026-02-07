package Arrays;

import java.util.Scanner;

public class Search {
    static void main(String[] args) {

        int[] arr = {2,4,4,5,77,8,89,89,9,96,65,55,5};
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==8) System.out.println("yo we found your number "+ arr[i]);
            else System.out.println("Sorry we do not found");
        }
    }
}
