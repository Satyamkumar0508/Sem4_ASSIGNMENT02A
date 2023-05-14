import java.util.*;
	public class Q03_stack {
		
		static  void convertDecimalToBinary(int Number) {
	        Stack<Integer> stack = new Stack<>();
	        while (Number > 0) {
	            int remainder = Number % 2;
	            stack.push(remainder);
	            Number /= 2;
	        }
	        StringBuilder binaryNumber = new StringBuilder();
	        while (!stack.isEmpty()) {
	            System.out.print(stack.pop());
	        }
	        
	    }
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a decimal number: ");
		        int decimalNumber = scanner.nextInt();
		        convertDecimalToBinary(decimalNumber);
		      
		    }

		    
		}


