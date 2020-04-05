package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
String nw =	JOptionPane.showInputDialog(null, "what height are you in inches?");	
int nwInt=Integer.parseInt(nw);
if(nwInt==48) {
	JOptionPane.showMessageDialog(null,"you need to grow first");
	
}
	}

}
