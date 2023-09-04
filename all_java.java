import java.util.*;

public class all_java{
    public static void main(String args[])
    {
        // DAY1 Task 

        String data1 = "yes";
		//Getting name value 
		
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name_value = name.nextLine();
		System.out.println("Name: "+name_value);
		
		//Getting age value
		
		Scanner age = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age_value = name.nextInt();
		System.out.println("Age: "+age_value);
		
		//Getting marrage detailes
		Scanner data2 = new Scanner(System.in);
		System.out.print("Are you Married: ");
		String value = data2.nextLine();
		
		if (value.equals(data1))
		{
			System.out.println(name_value + " Married");
		}
		else
		{
			System.out.println(name_value + " is Not married");
		}


        // DAY2 EXCERSISE

        	//Arithmetic operator and Relational Operator
			
			//Getting mark 1 value
			
			Scanner user = new Scanner(System.in);
			System.out.print("Enter your first Mark: ");
			int mark1 = user.nextInt();
			
			//Getting mark 2 value
			
			Scanner user1 = new Scanner(System.in);
			System.out.print("Enter your second Mark: ");
			int mark2 = user1.nextInt();
			
			//Add the two marks and divide for 2
			int add = mark1 + mark2;
			int avg = add/2;
			if (35 <= mark1 && 35 <= mark2)
			{
					if(75 <= avg)
					{
					System.out.print("First class");	
					}
					else
					{
					System.out.print("Second class");
					}
			
			}
			else{
				System.out.print("fail");
			}
			
			
			//Ternory Operator 
			int a = 10;
			int b = 12;
			int c;
			c=(a>b)?34:35;
			System.out.print(c);
		
        // DAY3 EXCERSISE

        // While Loop examples
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Starting Number: ");
		int s = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter your End Number: ");
		int e = input1.nextInt();
		
		Scanner t = new Scanner(System.in);
		System.out.print("What do you select table number: ");
		int tbl = t.nextInt();
		
		while (s <= e)
		{
			System.out.println(s + "*" + tbl +"="+ (s*tbl));
			s++;
		}
		
		
		//For Loop Examples
		
		char s;
		for(s='z'; s>='a'; s--)
		{
			System.out.println(s);
		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Starting Number: ");
		int s = input.nextInt();
		
		for(int i=1; i<=s; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			
		}

        // DAY4 EXCERSISE


		
	alphabets Excersise
	
	char s;
	for( s='z';  s>='a'; s--)
		{
			System.out.println(s);
		}
	

	//All Natural number of 1 to n  sum
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your limit of number: ");
	int i = input.nextInt();
	
	int  sum = 0;
	for(int s=1; s<=i; s++)
	{
		sum = sum + s;
		System.out.println("Sum of Number : "+sum);
	}
	
	
	// All natural even number of limit
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your limit of number: ");
	int i = input.nextInt();
	
	int  sum = 0;
	for(int s=1; s<=i; s++)
	{
		if(s%2==1)
		{
		sum = sum + s;
		System.out.println("Sum of Number : "+sum);
		}
	}
	
	
	//ASCII VALUE
	for(int s =1; s<=255; s++)
	{
		System.out.print((char)s);
	}

    // DAY5 EXCERSISE

    //Factorial value of number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your factorial value");
		int num = input.nextInt();
		
		int fact = 1;
		for (int i=1; i<=num ; i++)
		{
			fact *= i;
			
		}
		System.out.print("Factorial value of : "+fact);
		
		
		
		//find the value of one number raised to the power of another 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your base number: ");
		int base = input.nextInt();
		System.out.print("Enter your power number: ");
		int power = input.nextInt();
		int result = 1;
		for (int i = 1; i<=power; i++ )
		{
			result *= base;
		
		}
		System.out.print("Result: " +result);
		
		
		
		//Write a program to reverse the given digits
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your digits: ");
		int num = input.nextInt();
		int a = num;
		int rem = 0;
		int rev = 0;                                                                         
		while(num>0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
			
		}
		System.out.print("Given digits: "+a);
		System.out.print("Reverse Gigits"+rev);

    }
}