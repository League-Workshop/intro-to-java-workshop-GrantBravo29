package section1;

import javax.swing.JOptionPane;

public class Greeter2 {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what is your name?");
JOptionPane.showMessageDialog(null, "string bean"+ name);
}
}
