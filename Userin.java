
import java.io.IOException;
import java.util.Scanner;

public class Userin {

    public static void main(String[] args) throws IOException {

//    	System.out.println("Enter a number");
//    	int num=System.in.read();
//    	
//  	System.out.println(num);
//    	System.out.println(num-48);
        System.out.println("Enter a number"); 
        // println is method from printstream class and out is the oject created in system class and system class is static so we can directly use the methos

 
//    	InputStreamReader in=new InputStreamReader(System.in);
//    	BufferedReader bf=new BufferedReader(in);
//    	int num=Integer.parseInt(bf.readLine());
//    	System.out.println(num);
        //  	BufferedReader bf=new BufferedReader(null);
        // 	System.out.println(num-48);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        
    }
}
