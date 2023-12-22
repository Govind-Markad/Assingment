//6. Write a program to reverse a string
//brief description of the solution :
//Step 1 : I have taken  variables str = "Welcome" given String,reverse as " " emmpty space  and ch store each character of the original string during the loop.
//Step 2 : Then I Used for loop to iterate through each character of the original string str.
//step 3 : Inside the loop Extracting the character at the current index i using ch = str.charAt(i);
//step 4 : Concatenate the current character to the beginning of the "reverse" string (reverse = ch + reverse;).This builds the reversed string.
// Step 5 : Out of loop printing reverse.

package Assingmnet;

public class ReverseString {

	public static void main(String[] args) {
		String str = "welcome" ,reverse = " ";
		char ch ;

System.out.println("Original String: ");
System.out.println(str);

for (int i = 0;i<str.length();i++) {

ch = str.charAt(i);
reverse = ch + reverse;

}

System.out.println("Reverse Of Given String is: "+reverse);



}

	}


