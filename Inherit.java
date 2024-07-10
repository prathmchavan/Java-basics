

class Dad{ //super class
    public String look ="like dad";
    public String me ="Dad";
}
//single level inheritance
class  Me extends  Dad{ //sub class
    public String name = "pc"; 

    public void who()
    {
        System.out.println(name +""+ look);
    }
}

//multilevel inheritance
class  Child extends Me{ //sub class of me super class

    public String grandchildof = me;


}

/*Important notes:
 * In java there is no multiple inheritance like c++ , cause it will cause ambiguity lets imagine if a class inheriting two class a and b and both a and b has same method it will get confuse which method to use 
 * in java the when will call the method using the object java go check the sub class that if that method exist in it or not it yes it will execute it if not it goes to it's super class if exist it execute
 * using inheritance we can use feature of super class in subclass
 */
public  class  Inherit{
    public static void main(String[] args) {
        Child m = new Child();
        //i can access the variable and aynthing that is holded by dad class using me class because me calss is inheriting the dad class

        System.out.println(m.look);
        m.who();

        System.out.println(m.grandchildof);
        //here i can access the variable of super calss of super class which is dad



        //multiple inheritance in java does it support interview question 
    }
}