package com.project1;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input value
        int n = sc.nextInt();
        sc.close();

        // Define the grade boundaries and corresponding grades
        NavigableMap<Integer, String> gradeMap = new TreeMap<>();
        gradeMap.put(91, "A+");
        gradeMap.put(81, "A");
        gradeMap.put(71, "B+");
        gradeMap.put(61, "B");
        gradeMap.put(51, "C+");
        gradeMap.put(35, "C");
        gradeMap.put(0, "Fail");  // Note: This should be the lowest boundary

        // Determine the grade based on the input value
        if (n < 0 || n > 100) {
            System.out.println("Invalid");
        } else {
            Map.Entry<Integer, String> entry = gradeMap.floorEntry(n);
            if (entry != null) {
                System.out.println(entry.getValue());
            }
        }
    }
}
