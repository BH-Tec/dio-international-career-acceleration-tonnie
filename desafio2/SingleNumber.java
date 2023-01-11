/*
Challenge
John has a list of people for an activity at the company he works for. He needs to check who is with a partner and who is without. Each person in the pair has the same identification number. Create a program that reads these lists, finds the person who is without a partner, and prints out their identification number.

Input
The input will be a list with equal numbers and only one different.

Output
The output must be the different number.
*/

import java.util.*; 
public class Main {  
  public static void main(String[] args) {  
    Scanner inputReader = new Scanner(System.in);  

    List<Integer> numbers = new ArrayList<>(); 

    while (inputReader.hasNext()){ 
      int number = inputReader.nextInt();  
      numbers.add(numero);
    }  
    Integer result = 0;
   
   // TODO: Implement your logic to check which number has only one occurrence in List "numbers".
    for (Integer number : numbers) {
     //Tip: For this, a useful method can be the "Collections.frequency(list, value)".
      
    }
    System.out.println(result);  
  }  
}