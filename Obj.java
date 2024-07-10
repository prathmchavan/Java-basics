
class  Me{


    public void show()
    {
            System.out.println("Object created");
    }
}


public class Obj{
    public static void main(String[] args) {
        //this below line is called as anonymouse object , the object which do not have any reference yet
        //it is alone in heap memory 
        new Me();


        //the below is called as reference object 
        // the o variable from stack hold the address of the object me in heap 
        Me o = new Me();
    }
}