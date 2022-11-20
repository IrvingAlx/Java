package imgBg;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BackgroundImageApp {
    private JFrame frame;

    private BackgroundImageApp create() {
        frame = createFrame();
        frame.getContentPane().add(createContent());

        return this;
    }

    private JFrame createFrame() {
        JFrame frame = new JFrame(getClass().getName());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable (false);

        return frame;
    }

    private void show() {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private Component createContent() {
        final Image image = requestImage();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
        
        JLabel imagen = new JLabel(new ImageIcon("C:\\Users\\jhons\\Desktop\\Heart.png"));
        
		    imagen.setPreferredSize(new Dimension(300, 180));
		    imagen.setBounds(0, 120, 300, 180);
    
	    panel.add(imagen); 

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel etiquetaTitulo = new JLabel("Riesgo Cardiovascular", SwingConstants.LEFT);
    	
		etiquetaTitulo.setBounds(480,35,512,58);
		etiquetaTitulo.setFont (new Font("Abel_Regular", Font.BOLD, 40));
	
		panel.add(etiquetaTitulo);
	
	JLabel etiquetaDiv = new JLabel("Div", SwingConstants.LEFT);

		etiquetaDiv.setOpaque (true);
		etiquetaDiv.setBounds(480,100,560,12);
		etiquetaDiv.setForeground(Color.RED);
		etiquetaDiv.setBackground (Color.RED);
	
	panel.add(etiquetaDiv);	
	
	JLabel etiquetaEdad = new JLabel("Edad", SwingConstants.LEFT);
		
		etiquetaEdad.setBounds(480,165,300,30);
		etiquetaEdad.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaEdad);
	
		JTextArea areaTextoEdad = new JTextArea(1,1);
		
			areaTextoEdad.setBounds(800,165,200,30);
			areaTextoEdad.setForeground(Color.BLACK);
			areaTextoEdad.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
		
			Border border = BorderFactory.createLineBorder(Color.RED);
			areaTextoEdad.setBorder(BorderFactory.createCompoundBorder(border,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		panel.add(areaTextoEdad);

	JLabel etiquetaSexo = new JLabel("Sexo", SwingConstants.LEFT);
	
		etiquetaSexo.setBounds(480,230,300,30);
		etiquetaSexo.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaSexo);
	
	JRadioButton radioButtonSexoM = new JRadioButton("Hombre"); 
		
		radioButtonSexoM.setBounds(800,230,100,30);  
		radioButtonSexoM.setFont (new Font("Abel_Regular", Font.BOLD, 20));
	
	JRadioButton radioButtonSexoF = new JRadioButton("Mujer");   
		
		radioButtonSexoF.setBounds(900,230,100,30);    
		radioButtonSexoF.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	ButtonGroup buttonGroupSexo=new ButtonGroup();    
	
		buttonGroupSexo.add(radioButtonSexoM);buttonGroupSexo.add(radioButtonSexoF);    
		panel.add(radioButtonSexoM);panel.add(radioButtonSexoF);      
		panel.setSize(300,300);    
		panel.setLayout(null);    
		panel.setVisible(true);   
	
	
	JLabel etiquetaPSS = new JLabel("Presion Sanguinea sistolica", SwingConstants.LEFT);
	
		etiquetaPSS.setBounds(480,295,400,30);
		etiquetaPSS.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaPSS);	
	
		JTextArea areaTextoPSS = new JTextArea(7,1);
		
			areaTextoPSS.setBounds(800,295,200,30);
			areaTextoPSS.setForeground(Color.BLACK);
			areaTextoPSS.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
			
			Border border2 = BorderFactory.createLineBorder(Color.RED);
			areaTextoPSS.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			
		panel.add(areaTextoPSS);

	JLabel etiquetaCol = new JLabel("Colesterol", SwingConstants.LEFT);
	
		etiquetaCol.setBounds(480,360,400,30);
		etiquetaCol.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaCol);	
	
		JTextArea areaTextoCol = new JTextArea(7,1);
		
			areaTextoCol.setBounds(800,360,200,30);
			areaTextoCol.setForeground(Color.BLACK);
			areaTextoCol.setFont (new Font("Abel_Regular", Font.ITALIC, 20));
			
			Border border3 = BorderFactory.createLineBorder(Color.RED);
			areaTextoCol.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		panel.add(areaTextoCol);

	
	JLabel etiquetaGeA = new JLabel("Glucemia en ayunas", SwingConstants.LEFT);
	
		etiquetaGeA.setBounds(480,425,300,30);
		etiquetaGeA.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaGeA);	
	
	JRadioButton radioButtonGeA1 = new JRadioButton("Si"); 
	
	radioButtonGeA1.setBounds(800,425,100,30);  
	radioButtonGeA1.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	JRadioButton radioButtonGeA2 = new JRadioButton("No");   
	
	radioButtonGeA2.setBounds(900,425,100,30);    
	radioButtonGeA2.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	ButtonGroup buttonGroupGeA=new ButtonGroup();    

	buttonGroupGeA.add(radioButtonGeA1);buttonGroupGeA.add(radioButtonGeA2);    
	panel.add(radioButtonGeA1);panel.add(radioButtonGeA2);      
	panel.setSize(300,300);    
	panel.setLayout(null);    
	panel.setVisible(true);   
	
	

	
	JLabel etiquetaEXANG = new JLabel("Angina inducida por el ejercicio", SwingConstants.LEFT);
	
		etiquetaEXANG.setBounds(480,490,300,30);
		etiquetaEXANG.setFont (new Font("Abel_Regular", Font.BOLD, 20));
		
	panel.add(etiquetaEXANG);	
	
	JRadioButton radioButtonEXANG1 = new JRadioButton("Si"); 
	
	radioButtonEXANG1.setBounds(800,490,100,30);  
	radioButtonEXANG1.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	JRadioButton radioButtonEXANG2 = new JRadioButton("No");   
	
	radioButtonEXANG2.setBounds(900,490,100,30);    
	radioButtonEXANG2.setFont (new Font("Abel_Regular", Font.BOLD, 20));

	ButtonGroup buttonGroupEXANG=new ButtonGroup();    

	buttonGroupEXANG.add(radioButtonEXANG1);buttonGroupEXANG.add(radioButtonEXANG2);    
	panel.add(radioButtonEXANG1);panel.add(radioButtonEXANG2);      
	panel.setSize(300,300);    
	panel.setLayout(null);    
	panel.setVisible(true);   	
	
	
	
	JButton buttonUpload = new JButton("Guardar");  
	buttonUpload.setBounds(480,570,150,40);  
    buttonUpload.setFont (new Font("Abel_Regular", Font.BOLD, 20));
    buttonUpload.setBackground(new Color(240, 115, 130));
    panel.add(buttonUpload);  
    
    panel.setSize(400,400);  
    panel.setLayout(null);  
    panel.setVisible(true);   
    
    
    JButton buttonCal = new JButton("Calcular");  
    
    buttonCal.setBounds(880,570,150,40);  
    buttonCal.setFont (new Font("Abel_Regular", Font.BOLD, 20));
    buttonCal.setBackground(new Color(240, 115, 130));
    panel.add(buttonCal);  
    panel.setSize(400,400);  
    panel.setLayout(null);  
    panel.setVisible(true);   

    panel.setPreferredSize(new Dimension(1080, 720));

        return panel;
    }

    private Image requestImage() {
        Image image = null;

        try {
            image = ImageIO.read(new File("C:\\Users\\jhons\\Desktop\\Heart_Mesa de trabajo 1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BackgroundImageApp().create().show();
            }
        });
    }
}