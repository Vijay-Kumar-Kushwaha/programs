package String;

public class StringReverseUsingIbuiltMethod {
    public static void main(String[] args) {
        String original = "Hello, World!";
        
        // Create a StringBuilder object and pass the original string
        StringBuilder sb = new StringBuilder(original);
        
        // Reverse the string using the reverse() method
        String reversed = sb.reverse().toString();
        
//         Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }

}