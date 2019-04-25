// comments can be first package
// a empty file can be compiled too
// package is optional
package com.jse7p1.structure.fileclass; //first infromation

//import can be optional
import java.util.Date;

/** Javadoc to document
    Can be optional
 */
class People {
/*
 what you can have inside a class
*/
    String name; //instace variable, atribute, member variable
    
    //Constructors with params variables
    People(String name) {
        if (null == name) {
            name = "Jhon Mackain";
            return;
        }
        this.name = name;
    }

    //methods with local variable
    public String getName() {
        String lastName = "Mark";
        return name + lastName;
    }
}

//Can be optional
interface Picture {
    //can have a final variable and this reference can't be changed
    //is public, final and static for default
    final static int LENGHT = 5;

    //is public and abstract for default
    void authenticate(String name, String password);

}

//Can exists name class, attribute, method and constructor with the same name
class B {
    //instace variable
    int B;

    //constructor
    B() {}

    //method
    void B() {}

    //can't change de value of final variable from interface
    //error: <identifier> expected Picture.LENGHT = 2;
    //Picture.LENGHT = 2;
}

//public class can only one have
//The public type People must be defined in its own fileJava
//The type People is already defined Java
//compile error: duplicate class:
// public class People {
// }

//Be atention
/* 
    inside of a class you can have:
    only one class or interface of public type
    if the class is public it's to obliged to have the same name
    
*/