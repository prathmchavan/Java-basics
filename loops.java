import  java.util.Scanner;

class  loops
{   
    public static void main(String[] args) {
        loop();

        isTrue(8, 4);
    }
    public static void loop()
    {
        int i = 0 ;
        while(i<=10){
            
            System.out.println(i);
            i++;
        }

            // int j =10;
        // do { 
        //     System.err.println(j);
        //     i--;
        // } while (j>0);


        //how to take input from the user
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        System.err.println(c);


    

        int [] nums = {1 , 2,4};
        
        for(int q=0 ; q< nums.length; q++) {
            System.err.println(nums[q]);
        }

        
        int [] ages ={ 19,20 ,79, 10};
        int sum =0;
        for(int x : ages)
        {
            sum += x;
            
        }
        System.out.println(sum);
        


        int [][] number  ={ {1,2,3},{4,5,6}};

        for( int s =0 ; s<number.length; s++)
        {
            for(int r =0 ; r< number[s].length ; r++)
            {
                System.out.println(number[s][r]);
            }
        }


    }


    public static boolean  isTrue(int k , int z)
    {
        if(k>z)
        {
            return  true;
        }
        else{
            return  false;
        }
    }
}