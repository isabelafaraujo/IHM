import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.io.*;

public class MiniFrameApp extends JFrame implements ActionListener {
	
	JButton buttons[] ;
	JButton operators[];
	JButton equal;
	JButton clr;
	JTextField tf;
		
	
	//déclaration des operateurs
	private final String options[] = { "+","-","x","/"};

	
	//construction de la calculatrice
	public MiniFrameApp(String s){
		
	    super("Calculatrice");
		setLayout(new FlowLayout());

		tf = new JTextField(10);
		add(tf);
		
		clr = new JButton("CLR");
		add(clr);		
		clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	actionEraser();
            }
        });
		
		buttons = new JButton[11];
		for (int i = 0; i<10; i++){
			buttons[i] = new JButton(i+"");
			add(buttons[i]);
			buttons[i].addActionListener(this);

		}
		
		buttons[10]=new JButton(".");
		add(buttons[buttons.length-1]);
		buttons[10].addActionListener(this);

		operators = new JButton[4];
		for (int i = 0; i<4; i++){
			operators[i] = new JButton(options[i]);
			add(operators[i]);
			operators[i].addActionListener(this);
		}
		
		equal = new JButton("=");
		add(equal);
		equal.addActionListener(this);
		
		setSize(220,200);
		setVisible(true);
		setResizable(false);
		
		
	}
	String texto = new String("");

	public void actionPerformed(ActionEvent e)
    {
        texto += e.getActionCommand();
        tf.setText(texto);
        String equacao = tf.getText(); 
        System.out.println(equacao);
        }
	
	private void actionEraser() {
	       texto = tf.getText();
	       texto = "";
	       tf.setText(texto);
	       }
    }




