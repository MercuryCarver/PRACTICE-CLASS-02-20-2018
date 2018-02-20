import java.util.Scanner;
public class CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner math = new Scanner(System.in);
System.out.println("Choose what numbers you want added, subtracted, multiplied, or divided. They are in order accordingly from 1-4. ");

int number1 = math.nextInt();
System.out.println("Your first input is " + number1);
int number2 = math.nextInt();
System.out.println("Your second input is " + number2);
int decision = math.nextInt();
int b = work(decision, number1, number2);
System.out.println("Your result is " + b);
	}
	
	public static int work(int finish, int first, int second) {
if(finish==1)
	{System.out.println("You have chosen addition" );
int add =first+second;
return add;
	}else if (finish ==2)
	{System.out.println("You have chosen subtraction");
		int subtract = first-second;
	return subtract;
	}else if (finish ==3)
	{System.out.println("You have chosen multiplication");
		int multiply = first*second;
	return multiply;
	}else {
		System.out.println("You have chosen division");
		int divide = first/second;
		return divide;
	}
	}

}
