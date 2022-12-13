import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 

//class MyFrame extends JFrame
public class MyFrame extends JFrame {

	//declaring two buttons for the frame 
	JButton jButton1 = new JButton(); 
	JButton jButton2 = new JButton();
	
	//constructor for the myFrame class, just calls the init function 
	public MyFrame() {
		init();
	}
	
	//test class that declares a new MyFrame and sets the visibility to true
	public static void main(String[] args) {
		MyFrame frame = new MyFrame(); 
		frame.setSize(300,250);
		frame.setVisible(true);

	}
//init function. sets the buttons up and then adds them to the content pane 
	private void init(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setting the parameters for the button
		jButton1.setText("Show Singleton Frame");
		jButton1.setBounds(new Rectangle(12, 12, 220, 40));
		//adding a actionListener to the button 
		jButton1.addActionListener(
				new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						//when the button is clicked, a new singletonFrame is declare by calling the getInstance() function
						SingletonFrame singletonFrame = SingletonFrame.getInstance();
						//setting the title to the certain JFrame to show its from button 1
						singletonFrame.setTitle("Singleton Frame. From Button 1 TimeStamp: " +System.currentTimeMillis());
						singletonFrame.setVisible(true);
					}
				}
				);
		//setting the parameters to button 2
		jButton2.setText("Show the same Singleton Frame");
		jButton2.setBounds(new Rectangle(12, 72, 220, 40));
		//adding an action listener to button 2
		jButton2.addActionListener(
				new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e) {
						//when the button is clicked, a new singletonFrame is declare by calling the getInstance() function
						SingletonFrame singletonFrame2 = SingletonFrame.getInstance();
						//setting the title to the certain JFrame to show its from button 2
						singletonFrame2.setTitle("Singleton Frame. From Button 2 TimeStamp: " +System.currentTimeMillis());
						singletonFrame2.setVisible(true);
					
				
					}
				}
				);
		//adding the buttons to the content pane
		this.getContentPane().setLayout(null);
		this.getContentPane().add(jButton1,null); 
		this.getContentPane().add(jButton2, null);
		
				
	}
	
	

}
