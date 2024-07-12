
@FunctionalInterface
interface A {
//	void show();

    void show(int i);
//	void show(int i,int j); 


}
@FunctionalInterface
interface  B{
    int add(int i , int j);
}
public class Lambda {

    public static void main(String[] args) {
        /*Important notes 
         * the -> this is called as lambda function , java compiler says that it will reduce the line of code 
         * 
         */
        //   	A obj=() -> System.out.println("in Show");  
        //   	obj.show();
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);
        A obj = (i) -> System.out.println("in show " + i);
        obj.show(5);


        B obj2 = (i, j) -> i + j;
        //when we are writing code or anythign in one line after the lambda fucntion it automatically get return so we don't have to write the return statement 
        /*Important notes:
         * {return i+j}
         * we use the above syntax if we want to use return keyword
         * Lambda expression works only on the functional interface because let's imagine that if there are multiple method the compiler gets confused which method to execute 
         */

        int result = obj2.add(4, 3);
        System.out.println("Result: " + result);
    }
}
