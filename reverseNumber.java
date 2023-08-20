public class reverseNumber {
    public static void main(String args[]){
        int arr[]={
            111,222,333
        };
        // for(int i=0;i<3;i++)
        // {
        //     int num=arr[i];
        //     int rvn=0;
        //     while(num!=0)
        //     {
        //         rvn+=rvn*10+num%10;
        //         num/=10;
        //     }
        //    System.out.println(rvn+ " ");

        // }
        int num=111;
        int rvn=0;
        while(num!=0)
        {   int rmd=(num%10);
            
            rvn=(rvn*10)+rmd;
            System.out.println(rvn);
            num/=10;
        }
       System.out.println(rvn+ " ");
        
    }
    
}
