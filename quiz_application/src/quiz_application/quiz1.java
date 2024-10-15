package quiz_application;
import java.util.Scanner;

public class quiz1 {

static int ap = 1, f = 1;

static int hl = 1;
static String help = "";
static 	Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			String answer1 = "";
			String answer2 = "";
			String answer3 = "";
			String answer4 = "";
			String answer5 = "";
			String answer6 = "";
			String answer7 = "";
			String answer8 = "";
			String answer9 = "";
			String answer10 = "";

			

			int numbercorrect = 0;
			int question = 4;

			System.out.println("Which among the following is not a variable type in java?\n a:local variable\n b:class variable\n c:Instanvce variable\n c:Instanvce variable");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			if (help.equalsIgnoreCase("yes")) {
				System.out.println(" you have 2 helpline \n 1. audionce pole \n 2. fifty-fifty");
				hl = sc.nextInt();
				if (hl == 1 && ap > 0) {
					System.out.println("audionce pole is activated");
					ap--;
				} else if (hl == 2 && f > 0) {
					System.out.println("fifty-fifty is activated");
					f--;
				}

			}

			System.out.println("enter your answer here");
			answer1 = sc.nextLine();
			answer1 = sc.nextLine();

			if (answer1.equalsIgnoreCase("d")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}

			System.out.println("Which variables are static?\n a:Local variable\n b:Method variable\n c:Class variable\n d:Instance variable");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer2 = sc.nextLine();
			answer2 = sc.nextLine();

			if (answer2.equals("c")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("Which of the following is not a primitive data type in Java?\n a:Int\n b:Float\n c:Double \n d:String");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer3 = sc.nextLine();
			answer3 = sc.nextLine();

			if (answer3.equals("d")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("Which method must be defined in every java class?");
			System.out.println("a:main");
			System.out.println("b:start");
			System.out.println("c:run");
			System.out.println("d:execute");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer4 = sc.nextLine();
			answer4 = sc.nextLine();

			if (answer4.equals("a")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("What is the correct way to declare a variable count of type integer in java?");
			System.out.println("a:Int count");
			System.out.println("b:integer count");
			System.out.println("c:declare count as integer");
			System.out.println("d:var count=int");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			 m1();
			 System.out.println("enter your answer here--");
			answer5 = sc.nextLine();
			answer5 = sc.nextLine();

			if (answer5.equals("a")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("Which keyword is used to define a count in java?");
			System.out.println("a:const");
			System.out.println("b:final");
			System.out.println("c:static");
			System.out.println("d:constant");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer6 = sc.nextLine();
			answer6 = sc.nextLine();

			if (answer6.equals("b")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("which statement is used to terminate the loop in java?");
			System.out.println("a:exit");
			System.out.println("b:break");
			System.out.println("c:return");
			System.out.println("d:terminate");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			 m1();
			 System.out.println("enter your answer here--");
			answer7 = sc.nextLine();
			answer7 = sc.nextLine();

			if (answer7.equals("d")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("which the following is a valid identification in java?");
			System.out.println("a:1variable");
			System.out.println("b:_variable");
			System.out.println("c:variable$");
			System.out.println("d:variable-name");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer8 = sc.nextLine();
			answer8 = sc.nextLine();

			if (answer8.equals("b")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}
			System.out.println("which is the default value of an instance variable in java?");
			System.out.println("a:0");
			System.out.println("b:null");
			System.out.println("c:false");
			System.out.println("d:depend on the data type");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer9 = sc.nextLine();
			answer9 = sc.nextLine();

			if (answer9.equals("d")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}

			System.out.println("which keyword is used to prevent method overriding in java?");
			System.out.println("a:final");
			System.out.println("b:static");
			System.out.println("c:abstract");
			System.out.println("d:private");
			System.out.println("do you want to take any helpline");
			help = sc.next();
			m1();
			System.out.println("enter your answer here--");
			answer10 = sc.nextLine();
			answer10 = sc.nextLine();

			if (answer10.equals("a")) {
				System.out.println("Good job,that's correct");
				numbercorrect = numbercorrect + 1;
			} else {
				System.out.println("That's wrong");
				System.exit(0);
			}

		}

		static void m1()
		{
			if (help.equalsIgnoreCase("yes")) 
			{
				if (ap > 0 && f > 0) {
					System.out.println("u have 2 helpline \n 1. audiance pole \n 2.fifty-fifty\n enter ur option here");
					
					hl = sc.nextInt();
					
					switch(hl)
					{
					case 1:
						System.out.println("audiance pole  is activated");
						ap--;
						
					case 2:
						System.out.println("fifty-fifty helpline  is activated");
						f--;
						default:
							System.out.println("invalid choice");
					}
					
				} else if (ap > 0 && f == 0) 
				{
					System.out.println("u have only 1 helpline that is audiance pool do u want to use it");
					help = sc.next();
					if (help.equalsIgnoreCase("yes"))
						System.out.println("audiance pole is activated...");
					ap--;
				}
				else if (f > 0 && ap == 0)
				{
					System.out.println("u have only 1 helpline that is fifty-fifty do u want to use it");
					help = sc.next();
					if (help.equalsIgnoreCase("yes"))
						System.out.println("fifty-fifty helpline is activated...");
					f--;
				} 
				else
					System.out.println("sorry u losed all the helpines...");

			}

		}

	}



