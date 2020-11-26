//2. Write a program to create a class ‘simple_object‘. Using constructor
//display the message

public class QuestionTwo{
    public static void main(String args[]) {
        new SimpleObject();
    }
}

class SimpleObject{
    SimpleObject(){
        System.out.println("This is a constructor message.");
    }
}