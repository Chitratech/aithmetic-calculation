import javax.swing.JOptionPane;
public class apples {

	public static void main(String[] args) {
		
		String fn=JOptionPane.showInputDialog("enter the first num");
		String sn=JOptionPane.showInputDialog("enter the second num");
		 
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		
		JOptionPane.showMessageDialog(null,"the sum is " +sum,"the title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"the sub is " +sub,"the title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," the mul ans is" +mul,"the title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null," the div ans is" +div,"the title",JOptionPane.PLAIN_MESSAGE);
		
		String hn=JOptionPane.showInputDialog("enter the a num to find square");
		String gn=JOptionPane.showInputDialog("enter the a num to find cube");
		
		int num3=Integer.parseInt(hn); 
		int num4=Integer.parseInt(gn);
		
		int squ=num4*num4;
		int cube=num3*num3*num3;
		
		JOptionPane.showMessageDialog(null,"the cube is " +squ,"the title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"the cube is " +cube,"the title",JOptionPane.PLAIN_MESSAGE);
	}

}
