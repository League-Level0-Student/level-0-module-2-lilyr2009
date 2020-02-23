//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	int num=new Random().nextInt(4); 


	// 3. Print out this variable
System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
String question= JOptionPane.showInputDialog(null, "what is your question?");
	// 5. If the random number is 0
if (num==0) {
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "yes");
}
	// 6. If the random number is 1
if (num==1) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "no");
}
	// 7. If the random number is 2
if (num==2) {
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showInputDialog(null, "maybe you should ask google?");
}

	// 8. If the random number is 3
if (num==3) {
	// -- write your own answer
	JOptionPane.showMessageDialog (null, "no");
}
}
}
