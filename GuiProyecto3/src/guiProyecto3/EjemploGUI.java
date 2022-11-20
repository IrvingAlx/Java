package guiProyecto3;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EjemploGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * @return
	 */
	EjemploGUI create() {
		PanelUnoEx panl = new PanelUnoEx();
        frame = createFrame();
        frame.getContentPane().add(panl.createContent());

        return this;
    }
    
    /**
     * @return
     */
    private JFrame createFrame() {
        JFrame frame = new JFrame(getClass().getName());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable (false);

        return frame;
    }

    /**
     *
     */
    public void show() {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
	
	
	
	
	

}