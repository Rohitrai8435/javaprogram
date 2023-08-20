import java.io.*;
import java.util.Scanner;
  
class palindrome {
    public static void main (String[] args) {
        
        String str= "Geeks", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      if(str.equals(nstr))
      System.out.println("String is palindrome");
      System.out.println("String is note palindrome");
    }
}
