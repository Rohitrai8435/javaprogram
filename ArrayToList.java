import java.util.*;
import java.util.Arrays;


public class ArrayToList {
    
      
        public static void main(String []args){
            int arr1[]={1,13,3,5,5,5};
            int arr2[]={1,3,3,5,5,5};
            ArrayList<Integer>list=new ArrayList<Integer>();
            
            List l1=Arrays.asList(Arrays.stream(arr1).boxed().toArray(Integer[]::new));
            List l2=Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new));
           
            System.out.println( Collections.frequency(l1,5 ));
            list.addAll(l2);
            list.addAll(l1);
            
            Collections.sort(list);
            // System.out.println(list.indexOf(3));
           
        }
    }

