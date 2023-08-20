public class StrFomat  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");System.out.println(s2);
        String s = String.format("%s%s",s1,s2);   //String 3 to store the result  
            System.out.println(s);  //Displays result  
    }  
}  