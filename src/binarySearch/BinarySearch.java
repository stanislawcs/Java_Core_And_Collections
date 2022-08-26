package binarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,14,26,35,47,53,62,71,90};
        int key,mid = 0,right,left;
        boolean flag = false;


        left = 0;
        right = 19;

        Scanner scanner = new Scanner(System.in);

        key = scanner.nextInt();

        while((left<=right)&&(flag!=true)){
            mid = (left+right)/2;

            if(key == array[mid])
                flag = true;
            if(key<array[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;

            }

        }
        System.out.println("Вы нашли элемент под индексом " + mid);
    }
}
