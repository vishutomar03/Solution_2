import java.util.*;
import java.lang.*;

    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int k = 1; k <= t; k++) {
                int n = scan.nextInt();
                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = scan.nextInt();
                }

                int value = findMax(array, n);
                System.out.println(value);
            }
        }

        public static int findMax(int[] arr, int n) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int count =0;
                for (int i=0; i < n - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        count+=1;
                    }
                    else {
                        arrayList.add(count);
                        count = 0;
                    }
                    
                }
                arrayList.add(count);
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) > max)
                    max = arrayList.get(j);
            }
            return max;
        }
    }
