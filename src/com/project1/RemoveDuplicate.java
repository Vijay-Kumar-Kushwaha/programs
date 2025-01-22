package com.project1;

import java.util.*;
class RemoveDuplicate {
  public static void main(String[] args) {
  	System.out.println("Program for duplicate");
      Scanner scanner  = new Scanner(System.in);
      int n = scanner.nextInt();
      LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
      for (int i = 0; i < n; i++) {
          int num = scanner.nextInt();
          uniqueNumbers.add(num);
      }
      
      for (int num : uniqueNumbers) {
          System.out.print(num + " ");
      }
      scanner.close();
  }
}
