 //5. Write a Java program using overriding method where Parent class
//name Bank and child classes are EximBank, JanataBank and SonaliBank.
//Parent class has a variable named salary which holds 22000 taka and a
//string variable. Child class will extend this salary 10% for EximBank, 9%
//for JanataBank and 12% for SonaliBank. After increasing salary for each
//child class, output should be printed from main method. -6
 
 
 class BankSal{
		double salary = 22000;
		String z = "Hello";
		
	double getSalary(){
		return salary;
	}
}
 class EximBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .10;
		return salary;
	}
}
 class janataBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .09;
		return salary;
	}
}
 class sonaliBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .12;
		return salary;
	}
}
class QuestionFive{
	public static void main(String args[]){
	EximBank sl = new EximBank();
	janataBank s2 = new janataBank();
	sonaliBank s3 = new sonaliBank();
	
	System.out.println("The salary of Exim bank is:"+ sl.getSalary());
	System.out.println("The salary of janata bank is:"+ s2.getSalary());
	System.out.println("The salary of sonali bank is:"+ s3.getSalary());

	}
}
