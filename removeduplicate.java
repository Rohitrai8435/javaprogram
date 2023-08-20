import java.util.*;

public class removeduplicate {
    public static void main(String args[]){
       
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(list1);
        Integer arr[]={1,3,4,5,5,55};
        String str[]={"amohan","dohan","bsohan","crohan"};
        List l1=Arrays.asList(arr);
        list1.addAll(l1);
        Collections.sort(list1);
        Collections.reverse(list1);
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>(list1);
        
        System.out.println(lhs);
 
    }
}
