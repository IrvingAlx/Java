package guiP1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class PanelUnoEx extends JPanel {


	private static final long serialVersionUID = 1L;
	static JTextField textField;

	public PanelUnoEx(){
	
	this.setLayout (null);
	
	
	 JLabel imagen = new JLabel(new ImageIcon("C:\\Users\\jhons\\Desktop\\bg2.png"));
	    
		imagen.setPreferredSize(new Dimension(449, 720));
		imagen.setBounds(-15, -10, 449, 720);
		
	 this.add(imagen); 
	
	
	JLabel etiquetaTitulo = new JLabel("Riesgo Cardiovascular", SwingConstants.LEFT);
	
		etiquetaTitulo.setBounds(480,35,512,58);
		etiquetaTitulo.setFont (new Font("Abel_Regular", Font.BOLD, 40));
	
	this.add(etiquetaTitulo);
	
	JLabel etiquetaDiv = new JLabel("Div", SwingConstants.LEFT);

		etiquetaDiv.setOpaque (true);
		etiquetaDiv.setBounds(480,100,560,12);
		etiquetaDiv.setForeground(Color.RED);
		etiquetaDiv.setBackground (Color.RED);
	
	this.add(etiquetaDiv);	
	
	JLabel etiquetaSexo = new JLabel("Sexo", SwingConstants.LEFT);
	
	etiquetaSexo.setBounds(480,165,300,30); //(480,165,300,30);
	etiquetaSexo.setFont (new Font("Abel_Regular", Font.BOLD, 20));
	
	this.add(etiquetaSexo);
	
	JRadioButton radioButtonSexoM = new JRadioButton("Hombre"); 
		
		radioButtonSexoM.setBounds(800,165,100,30);  
		radioButtonSexoM.setFont (new Font("Abel_Regular", Font.BOLD, 20));
	
	JRadioButton radioButtonSexoF = new JRadioButton("Mujer");   
		
		radioButtonSexoF.setBounds(900,165,100,30);    
		radioButtonSexoF.setFont (new Font("Abel_Regular", Font.BOLD, 20));
	
	ButtonGroup buttonGroupSexo=new ButtonGroup();    
	
		buttonGroupSexo.add(radioButtonSexoM);buttonGroupSexo.add(radioButtonSexoF);    
		this.add(radioButtonSexoM);this.add(radioButtonSexoF);      
		this.setSize(300,300);    
		this.setLayout(null);    
		this.setVisible(true);   
	
	JLabel etiquetaEdad = new JLabel("Edad", SwingConstants.LEFT);
		
		etiquetaEdad.setBounds(480,230,300,30);		//(480,230,300,30); 
		etiquetaEdad.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	this.add(etiquetaEdad);
	
		JTextField areaTextoEdad = new JTextField(1);
	 //   TextPrompt placeholder = new TextPrompt("años", areaTextoEdad);

    		areaTextoEdad.setDocument(new LimitJTextField(2));
    		
    		areaTextoEdad.setBounds(800,230,200,30);
			areaTextoEdad.setForeground(Color.BLACK);
			areaTextoEdad.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
		//    placeholder.changeAlpha(0.75f);
		//    placeholder.changeStyle(Font.ITALIC);
		    
			Border border = BorderFactory.createLineBorder(Color.RED);
			areaTextoEdad.setBorder(BorderFactory.createCompoundBorder(border,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		this.add(areaTextoEdad);

	JLabel etiquetaPSS = new JLabel("Presion Sanguinea sistolica", SwingConstants.LEFT);
	
		etiquetaPSS.setBounds(480,295,400,30);
		etiquetaPSS.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	this.add(etiquetaPSS);	
	
		JTextField areaTextoPSS = new JTextField(1);
	    TextPrompt placeholder2 = new TextPrompt("mmHg", areaTextoPSS);

    	//	areaTextoPSS.setDocument(new LimitJTextField(5));
			
    		areaTextoPSS.setBounds(800,295,200,30);
			areaTextoPSS.setForeground(Color.BLACK);
			areaTextoPSS.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
		    placeholder2.changeAlpha(0.75f);
		    placeholder2.changeStyle(Font.ITALIC);
		    
			Border border2 = BorderFactory.createLineBorder(Color.RED);
			areaTextoPSS.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
		this.add(areaTextoPSS);

	JLabel etiquetaCol = new JLabel("Colesterol", SwingConstants.LEFT);
	
		etiquetaCol.setBounds(480,360,400,30);
		etiquetaCol.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	this.add(etiquetaCol);	
	
		JTextField areaTextoCol = new JTextField(1);
	    TextPrompt placeholder3 = new TextPrompt("mg/Dl", areaTextoCol);

	    	//areaTextoCol.setDocument(new LimitJTextField(5));
			
	    	areaTextoCol.setBounds(800,360,200,30);
			areaTextoCol.setForeground(Color.BLACK);
			areaTextoCol.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
		    placeholder3.changeAlpha(0.75f);
		    placeholder3.changeStyle(Font.ITALIC);	
			
		    Border border3 = BorderFactory.createLineBorder(Color.RED);
			areaTextoCol.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		this.add(areaTextoCol);

	
	JLabel etiquetaGeA = new JLabel("Glucemia en ayunas", SwingConstants.LEFT);
	
		etiquetaGeA.setBounds(480,425,300,30);
		etiquetaGeA.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	this.add(etiquetaGeA);	

	JLabel etiquetaFbs = new JLabel("*Fasting blood sugar > 120 mg/dl", SwingConstants.LEFT);
	
		etiquetaFbs.setBounds(480,455,400,30);
		etiquetaFbs.setFont (new Font("Abel_Regular", Font.ITALIC, 15));
		
	this.add(etiquetaFbs);	  
	
	JRadioButton radioButtonGeA1 = new JRadioButton("Si"); 
	
		radioButtonGeA1.setBounds(800,425,100,30);  
		radioButtonGeA1.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	JRadioButton radioButtonGeA2 = new JRadioButton("No");   
	
		radioButtonGeA2.setBounds(900,425,100,30);    
		radioButtonGeA2.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	ButtonGroup buttonGroupGeA=new ButtonGroup();    

	buttonGroupGeA.add(radioButtonGeA1);buttonGroupGeA.add(radioButtonGeA2);    
	this.add(radioButtonGeA1);this.add(radioButtonGeA2);      
	this.setSize(300,300);    
	this.setLayout(null);    
	this.setVisible(true);   
	
	

	
	JLabel etiquetaEXANG = new JLabel("Angina inducida por el ejercicio", SwingConstants.LEFT);
	
		etiquetaEXANG.setBounds(480,490,300,30);
		etiquetaEXANG.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	this.add(etiquetaEXANG);	
	
	JRadioButton radioButtonEXANG1 = new JRadioButton("Si"); 
	
	radioButtonEXANG1.setBounds(800,490,100,30);  
	radioButtonEXANG1.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	JRadioButton radioButtonEXANG2 = new JRadioButton("No");   
	
	radioButtonEXANG2.setBounds(900,490,100,30);    
	radioButtonEXANG2.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	ButtonGroup buttonGroupEXANG=new ButtonGroup();    

	buttonGroupEXANG.add(radioButtonEXANG1);buttonGroupEXANG.add(radioButtonEXANG2);    
	this.add(radioButtonEXANG1);this.add(radioButtonEXANG2);      
	this.setSize(300,300);    
	this.setLayout(null);    
	this.setVisible(true);   	
	
	
	
	JButton buttonUpload = new JButton("Guardar");  
	buttonUpload.setBounds(480,570,150,40);  
    buttonUpload.setFont (new Font("Abel_Regular", Font.BOLD, 20));
    buttonUpload.setBackground(new Color(240, 115, 130));

    this.add(buttonUpload);  
    
    this.setSize(400,400);  
    this.setLayout(null);  
    this.setVisible(true);   
    
    
    JButton buttonCal = new JButton("Calcular");  
    
    buttonCal.setBounds(880,570,150,40);  
    buttonCal.setFont (new Font("Abel_Regular", Font.BOLD, 20));
    buttonCal.setBackground(new Color(240, 115, 130));
    this.add(buttonCal);  
    this.setSize(400,400);  
    this.setLayout(null);  
    this.setVisible(true);   
	
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
}




