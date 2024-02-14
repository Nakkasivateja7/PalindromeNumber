import java.util.Scanner;

class PalindromeNumber {
   public static void main(String args[]) {
      Scanner Obj = new Scanner(System.in);   
      System.out.println("Enter the number of strings/numbers to check if they are palindromes");  
      int n = Obj.nextInt();
      Obj.nextLine(); 
      String original[] = new String[n];
      for(int i=0;i<n;i++){
         System.out.println("Enter string/number " + (i+1) + ":");
         original[i] = Obj.nextLine();   
      }
      for(int i=0;i<n;i++){
         String reverse = new StringBuilder(original[i]).reverse().toString();  
         if (original[i].equals(reverse))  
            System.out.println("Entered string/number " + (i+1) + " is a palindrome.");  
         else  
            System.out.println("Entered string/number " + (i+1) + " isn't a palindrome."); 
            Obj.close();
      }
   }  
}
