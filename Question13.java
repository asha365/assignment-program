//13. Write a program to create automatic type conversions apply to
//overriding.

public class Question13{
public static void main(String args[])
{
int i = 500;
 
//automatic type conversion
long l = i;
 
//automatic type conversion
float f = l;
System.out.println("Int value "+i);
System.out.println("Long value "+l);
System.out.println("Float value "+f);
}
}