//2. Write a Program for the first 10 numbers of Fibonacci series.
//brief description of the solution :
//Step 1: Here I am Using method Febonaci with Integger N as Parameter Can print N terms.
//Step 2 : In this step I have taken variables  num1 and num2 to  print sequnce 0, 1;
// Step 3: I have taken variable counter to chek from 0 how many terms are generated.
// step 4 :I have taken the while loop runs as long as the counter is less than N.
// Step 5 : In loop frist I printing num1 then Calculate the next Fibonacci number and Increment the counter
// step 6 : In main method  creates an instance of the FebonaciSeries class and set N = 10 to print 10 numbers.

package Assingmnet;

public class FibonacciSeries {

	public  void Febonaci(int N) {
	int num1= 0, num2=1;
	int counter = 0;

	while(counter < N) {
		System.out.println(num1);

		int num3 = num2 + num1;
		num1 = num2;
		num2 = num3;
		counter = 1 + counter;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries s = new FibonacciSeries();
		int N = 10;

		s.Febonaci(N);

	}

}
