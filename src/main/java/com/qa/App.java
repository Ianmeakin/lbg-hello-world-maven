
package com.qa;
//import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayHelloToSomeone("Ian"));
        System.out.println(sayHelloToSomeone("Pete"));
        System.out.println(sayGoodbye());

        //Scanner myInput = new Scanner(System.in);
        //System.out.println("Enter your name");
        //String userName = myInput.nextLine();
        //System.out.println("Hi there " + userName);
        System.out.println("Hello adam");

        //for(int i =0; i < 6; i++){

            
            //System.out.println(i);
          //  System.out.println("Hello Adam looking i am counting")
        //}

      
    }



    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
