package java_july;

public class forLoopPattern {

	public static void main(String[] args) {
// Pattern #1
		/*for (int i =1 ; i<=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			}
		System.out.println();
	*/

// Pattern #2
		/*for (int i =1 ; i<=5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			
			}
		System.out.println();
	*/
		
// Pattern #3
		
		  for (int i =1 ; i<=5; i++) { for (int j = 1; j <= 5 - i; j++) {
		  System.out.print(" ");
		  
		  } for (int k =1; k <= i; k++) { System.out.print("*");
		  
		  } System.out.println(""); }
		 
		
		
			}
		
}
