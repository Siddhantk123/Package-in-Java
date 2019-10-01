# Package-in-Java
//Siddhant kumar mishra Package program
package evennumber;
public class evenodd
{
	public void even(int x)
	{
		int e=x;
		if(e%2==0)
		{
		System.out.println("Even Number ");
		}
		else{
		System.out.println("Odd Number");
		}
		
	}
}
//create a  new directory/floder having the folder name by package name(evennumber).
//then after save the above code in the above directory by evenodd.java
//after saving, compile the code.After compiling we will see ( .class )file,Hence the evenodd folder will have 2 file 1)evenodd.java 2)evenodd.class
//now write the below code in a new document and save it in a 
//save the above code in a folder where evennumber directory is created
// now run the above code
 


import evennumber.evenodd;
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
Scanner  obj1=new Scanner(System.in);
int n=obj1.nextInt();
evenodd obj=new evenodd();
		obj.even(n);
	}
}

	

