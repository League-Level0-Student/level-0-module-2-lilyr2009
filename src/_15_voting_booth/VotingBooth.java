package _15_voting_booth;

import javax.swing.JOptionPane;

/*
 * Ask the user how old they are
 * If they are 18 or older then tell them they are
 * old enough to vote
 * Else tell them they need to grow up first
 */
public class VotingBooth {
	public static void main(String[] args) {
String num=JOptionPane.showInputDialog(null,"how old are you?");
int numInt=Integer.parseInt(num);
if(numInt<18) {
JOptionPane.showMessageDialog(null, "you are too young");

}
else {
	JOptionPane.showMessageDialog(null, "you can vote");	
}
}
}