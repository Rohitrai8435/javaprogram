 import java.util.ArrayList;
import java.util.Collections;

public class sortWord1 {
    
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.
        
        String str="i.like.this.program.very.much";
        String sortWord=" ";
         String str1[] =str.split(".");
         for(int i=str1.length-1;i>=0;i-- )
         {
          //  arr.add(str1[i]);
           sortWord+=str1[i]+".";
         }
         System.out.println(sortWord);
    
       
     Collections.sort(arr);
    //  String sortWord=" ";
      for (String character : arr) {
    
        sortWord+=character+" ";
      }
      
            
           
    }

    
    
 
    
}
