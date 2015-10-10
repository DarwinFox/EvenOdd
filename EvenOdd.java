//********************************************************
//EvenOdd.java     Author: Lewis/Loftus and Harrison Fox
//
//Demonstrates the use of the JOptionPane class.
//********************************************************

import javax.swing.JOptionPane;

public class EvenOdd
{

	public static void main (String[] args)
	{
		String numStr, result;
		int num = -1, again = 0;
		int index = 0;
		boolean valid;

		do{

			numStr = JOptionPane.showInputDialog ("Enter a non-zero integer: ");
				
				// if(numStr == null){
    	        //   	System.exit(0);
				// }

			IntTest test = new IntTest(numStr);

			valid = test.isValid();
			num = test.getInt();

				// try{
				// 	num = Integer.parseInt(numStr);
				// 	valid = true;
				// }

				// catch (NumberFormatException exception){
				// 	valid = false;
				// 	again = JOptionPane.showConfirmDialog (null, "What you entered was not an integer, Do another?");
				// }

				// if (num == 0){  //This statement tests whether the number entered was zero.
				// 	valid = false;
				// 	again = JOptionPane.showConfirmDialog (null, "What you entered was 0. Do another?");
				// }
			if(!valid){
				again = JOptionPane.showConfirmDialog (null, "What you entered was not an integer, Do another?");
			}
			
			if(test.isZero()){  //This statement tests whether the number entered was zero.
				again = JOptionPane.showConfirmDialog (null, "What you entered was 0. Do another?");
			}

			if(valid){
				
				if (num == 1){  //This "if" statement is necessary because the test for even or odd below returns "1" as even. 
				result = "That number is odd.";
				}
				else{
				result = "That number is " + ((num%2 == 0) ? "even." : "odd.");
				}


			JOptionPane.showMessageDialog (null, result);

			again = JOptionPane.showConfirmDialog (null, "Do another?");
			}
 		}
 		while (again == JOptionPane.YES_OPTION);
	}
}
