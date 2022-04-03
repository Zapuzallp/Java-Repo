package com.company;

// OOP ----------------------
// Pillars of OOP
// 1. Class -> Blueprint of Object,
// 2. Object  -> Instance of a Class
// 3. Polymorphism -> Multiple Forms 1. RunTime -> Overriding | 2.Compile Time-> Overloading
// 4. Inheritance  ->
// 5. Encapsulation -> Wrapping up the data-members & Methods
// 6. Abstraction  ->  Hiding the inner implementation showing the result
//----------------------------
// Object is an real life entity with some ch. & behaviour
class Animal{
    String name;
    String type;
    static int cnt=0;
    String sound;

//    Constructor 1. Default 2. Parameterized Constructor
    private Animal(){
        System.out.println("Object Created");
    }
    void test(){
        System.out.println("Test method called");
    }


    static Animal ctr(){

        if(cnt<1) {
            Animal obj = new Animal();
            cnt++;
            return obj;
        }
        else{
            return null;
        }

    }
}
public class Main {

   public static void main(String[] args) {

//       Animal ob = new Animal(); // Syntax : ClassName ObjectName = new ClassName();
//       ob.ctr();
       Animal ob =  Animal.ctr();
       ob.test();

    }
}

// Access Specifier 1. Private-> Within The Class 2. Default-> Within the file 3. Public -> Everywhere