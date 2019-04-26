//for convention you can organize class on packages
//now you can compile: from de certification directory javac com/certification/jse7p1/executableapp/HelloWorld.java
//and run a program: java com.certification.jse7p1.executableapp/HelloWorld first second
package com.jse7p1.executableapp;

//is not needed to be public class to run the main class
public class HelloWorld {
    //method needs to be public, static and void
    //String[] can be String...
    //args cab be params[]
    public static void main(String[] args) {
        System.out.println("Running my program");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " => " + args[i]);
        }
    }

    //import to know
    //JDK java development kit has the javac that is a compiler
    //JRE Java Runtime Environment if you want only run a program

    //given properties use: -D
    //java -Dsystem=production -Dproduct=certification com.certification.jse7p1.executableapp/HelloWorld first second

    //how java find my classes: CLASSPATH
    //for default the CLASSPATH is current directory: CLASSPATH=.
    //you can have a lot of directories and files: CLASSPATH=.:/usr/librares/file.jar
    //TIP: is not a good pratice pass a CLASSPATH to the app because you are change de global path and all apps will use
    //instead of use global CLASSPATH use: java -classpath . com.jse7p1/executableapp/HelloWorld
    //a shortcut to the above command is: java -cp . com.jse7p1/executableapp/HelloWorld
    //you can return one folder and set your classpath cd ..
    //java -cp jse7p1 com.jse7p1.executableapp/HelloWorld
    //jvm search for classes inside of jse7p1 directory


}