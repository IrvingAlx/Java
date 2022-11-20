package guiTests;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
public class Limit5Char extends JFrame 
{  

	private static final long serialVersionUID = 1L;
	public static void main(String[]args){
      new Limit5Char().initComponent();
   }
   public void initComponent() {
      setLayout(new FlowLayout());
      JLabel lbl = new JLabel("Enter text: ");
      JTextField texte = new JTextField(15);
      add(lbl);
      add(texte);
      texte.setDocument(new LimitJTextField(5));
      setSize(300,70);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
}
class LimitJTextField extends PlainDocument 
{

	private static final long serialVersionUID = 1L;
private int max;
   LimitJTextField(int max) {
      super();
      this.max = max;
   }
   public void insertString(int offset, String text, AttributeSet attr) throws BadLocationException {
      if (text == null)
         return;
      if ((getLength() + text.length()) <= max) {
         super.insertString(offset, text, attr);
      }
   }
}