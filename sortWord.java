
import java.util.ArrayList;

import java.util.Collections;

public class sortWord {
    
    public static void main(String[] args) {
        ArrayList<Character> arr=new ArrayList<>();
        
        String str="rohit";
    

        for(int i=0;i<str.length(); i++)
       {
            arr.add(str.charAt(i));
       }
        Collections.sort(arr);
      
    //    Collections.reverse(arr);
       String sortWord = " ";
       for (Character character : arr) {
        sortWord+=character;
        
       }
      System.out.println(sortWord);
            
           
    }
    
}
