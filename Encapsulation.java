
class  Me {

    private  String name = "pc";
    private int age = 10;

    /*Important notes:
     * We use getter and setter for accessing the private variable from the class 
     * To define the get method we have to mention the return type of the variable and name of method should start with the get keyword following with the variable name with the uppercase of first character 
     * same goes for the setter method but we don't write the return type of variable we accept the parameter with the variable type
     */
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        /*Important notes :
         * this keyword is use to refer to the current object that is created 
         * we use this keyword to seprate that with the parameter and the class private variable which we are setting the value to 
         */
        // System.out.println("this is use of this keyword"+this.name + name);
        this.name= name;
    }

    public void setAge(int age)
    {
        this.age= age;
    }
}


public  class  Encapsulation{


    public static void main(String[] args) {
        
        Me m = new Me();

        System.out.println(m.getAge() + m.getName());

 
        m.setAge(13);
        m.setName("this");
        System.out.println(m.getAge() + m.getName());

    }
}