//12. Create a class named A with a function display (), again create
//another class inside the A class named B with a function called
//display () and call the two functions in the main class.

public class Question12{
    public static void main(String args[]) {
        A main = new A();
        main.display();
        A.B internal = main.new B();
        internal.display();
    }
}

class A {
    void display(){
        System.out.println("main Class...");
    }

    class B{
        void display() {
            System.out.println("Internal Class...");
        }
    }
}