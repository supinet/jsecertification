// comments can be first package
// a empty file can be compiled too
package com.jse7p1.structure.fileclass; //first infromation

import java.util.Date; //import can be optional

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

}

class B {
    int B;
}
