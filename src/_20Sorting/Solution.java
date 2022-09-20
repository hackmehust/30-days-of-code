package _20Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// Bubble Sort

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {

            // Track number of elements swapped during a single array traversal
            for (int j = 0; j < n - 1; j++) {

                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(j, j + 1, a);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

//        System.out.println(a.stream().collect(toList()));

        System.out.println("Array is sorted in " +  numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

        bufferedReader.close();
    }

    private static void swap(Integer a, Integer b, List<Integer> arr) {
        Integer temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }
}
