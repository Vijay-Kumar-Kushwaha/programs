package String;

public class JavaJAVAAddressVAlueCase {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "JAVA";
		if(s1 == s2)
			System.out.println("Equal refrence");
		else
			System.out.println("Unequal  refrence"); // unequal;
		if(s1.equals(s2))
			System.out.println("Equal Value");
		else
			System.out.println("Unequal Value"); 	//unequal
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Equal in opposite case");  	//equal
		else
			System.out.println("Unequal in opposite case");
	}

}
