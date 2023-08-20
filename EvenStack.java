import java.util.Comparator;
import java.util.Stack;

public class EvenStack {
    public static void main(String []args){
        Stack <Integer> stack=new Stack<>();
        
        stack.push(1);
        stack.push(4);
        stack.push(16);
        stack.push(112);
        stack.push(14);
        stack.push(3);
        stack.push(15);
        stack.push(13);
        stack.push(11);
        stack.add(12);
       stack.elements();
        System.out.println(stack.size());
    }
}
