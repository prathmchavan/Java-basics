//method overloading


class  overloading{

    public  int add(int a , int b)
    {
        return  a+b;
    }

    //same name of method but only parameter change called as method overloading
    public  int add(int a , int b , int c)
    {
        return  a+b+c;
    }
}

class  Student {
    
    String name ; 
    int no;
}




class demo{

    public static void main(String[] args) {
        
        overloading obj = new overloading();
        System.err.println(obj.add(2,2));

        System.err.println(obj.add(2,2 , 9));



        int [][][] no = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};




        // 3d array 
        for(int i =0 ; i < no.length; i++)
        {
            // System.out.println("Slice " + (i + 1) + ":");

            for(int j =0 ; j< no[i].length;j++)
            {
                for(int k =0 ; k< no[i][j].length; k++)
                {
                    System.out.print(no[i][j][k] + " ");
                }
                System.out.println(); 
            }
            // System.out.println(); 
        }
     
        




        //array of object 

        Student s1 = new Student();

        s1.name= "pc";
        s1.no =10;


        
        Student s2 = new Student();

        s2.name= "pc";
        s2.no =10;

        
        Student s3 = new Student();

        s3.name= "pc";
        s3.no =10;


        Student student [] = new Student[3];


        student [0]=s1;
        student [1]=s2;
        student [2]=s3;

        for(Student x  : student)
        {
                System.out.println(x.name + x.no);
        }
        

    
    }



}