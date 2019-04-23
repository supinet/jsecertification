public class Test {

    String instanceName = "Jhon Vick";
    String fullInstanceName = instanceName + " Bradock";

    public static void main(String[] args) {
        Test t = new Test();
        t.m1("Jhon");
        t.m2();
        t.instanceName = "Rambo";
        System.out.println("accessing instance variable from main: " + t.instanceName);

        People p = new People();
        System.out.println("static variable accessible from any scope p.id: " + p.id);
        System.out.println("static variable accessible from any scope People.id: " + People.id);
        People.method();

        //it's not allowed to have the same variable name
        //int a = 0;
        //int a = 10;
    }

    public Test() {
        System.out.println("accessing instance variable inside of the public constructor: " + instanceName);
    }

    public void m1(String localName) {
        int x = 10; //local variable only can be access locally
        System.out.println("local variable value x: " + x);

        if (x >= 10) {
            int y = 50;
            System.out.println("local variable value y: " + y);
        }
        //System.out.println(y); //it doesn't exist outside of the curly braces above

        for (int i = 0, j = 0; i <= 10; i++) j++;
        //System.out.println(i); //it doesn't exist because the for doesn't have curly braces so only exists inside of the parentheses
        //System.out.println(j); //it doesn't exist because the for doesn't have curly braces so only exists inside of the parentheses

        for (int i = 0, j = 0; i <= 10; i++) {
            j++;
            System.out.println("i: " + i);
            System.out.println("j: " + j);
        }

        System.out.println("local variable name: " + localName);
    }

    public void m2() {
        //System.out.println(localName); //it doesn't exists, bacause param variable was defined inside of the m1 method not in m2
        System.out.println("instance variable name inside of method: " + instanceName);
        System.out.println("instance variable full name: " + fullInstanceName);
    }
}

class People {
    static int id = 1;
    static void method() {
        System.out.println("accessing static variable value from static method: " + id);
    }
    //int id = 0; can't have static variable and instance variable wiht same name

    static int x = 0;
    int y = 0;

    //shadowing
    public static void setX(int x) {
        People.x = x;
    }

    //shadowing
    public void setY(int y) {
        this.y = y;
    }
}

