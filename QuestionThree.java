
//3. Write a program for the following
// ->Example for call by value.
// ->Example for call by reference.

public class QuestionThree{
    public static void main(String args[]) {
        Reference refe = new Reference();

        System.out.println("Before call by refe the name is: " + refe.name);
        refe.setNameByReference(refe);
        System.out.println("After call by refe the name is: " + refe.name);


    }
}

/**
 * Reference
 */
class Reference {
    String name = "My Name Is Asha Afrin";

    void setNameByReference(Reference obj) {
        obj.name = "I'm changed call by Reference";
    }

    void setNameByValue(String name) {
        this.name = name;
    }
}