import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
public static void main(String[] args) {
	int num=new Random().nextInt(100);
	int num2=new Random().nextInt(100);
	int num3=new Random().nextInt(100);
	int num4=new Random().nextInt(100);
	int num5=new Random().nextInt(100);
	
	JOptionPane.showMessageDialog(null, num+ ","+num2+","+num3+","+num4+ ","+num5);
}
}