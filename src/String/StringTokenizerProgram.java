package String;

/*import java.util.StringTokenizer;

public class StringTokenizerProgram {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("java Python IA ML", " ");
        System.out.println(st[0]);
//        while (st.hasMoreTokens()) {
//            String token = st.nextToken();
//            System.out.println(token);
//        }
    }
}*/


/* here the elements of StringTokenizer has been stored in the array
 *  and with the help of array it is being fetched

import java.util.StringTokenizer;

public class StringTokenizerProgram
{
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("java Python IA ML", " ");
        int count = st.countTokens(); // Get the number of tokens
        String[] tokensArray = new String[count]; // Create an array to hold the tokens

        for (int i = 0; i < count; i++) {
            tokensArray[i] = st.nextToken(); // Store each token in the array
        }

        // Print the array
        for (String token : tokensArray) {
            System.out.println(token);
        }
    }
}
*/



/*
class StringTokenizerProgram {
//    void display(int a) {
//        System.out.println("int method");
//    }

//    void display(double a) {
//        System.out.println("double method");
//    }
    void display(long a) {
    	System.out.println(a);
    }

    public static void main(String[] args) {
    	StringTokenizerProgram obj = new StringTokenizerProgram();
//        obj.display(10);  // Calls the int method
//        obj.display(10.5);  // Calls the double method
        obj.display('z');  // 'char' is promoted to int, calls the int method
    }
}*/

class calc
{
	void add(int a, char b) {
		System.out.println("Int char");		
	}
	void add(char a, int b) {
		System.out.println("Int char");		
	}
}
class StringTokenizerProgram{
	public static void main(String[] args) {
		calc c = new calc();
		c.add('B', 'A');
	}
}
