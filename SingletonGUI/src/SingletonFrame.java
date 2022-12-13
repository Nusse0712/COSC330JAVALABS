import javax.swing.*; 
//SingletonFrame class extends the JFrame class
public class SingletonFrame extends JFrame  {
	//declaring a static SingletonFrame variable and initializing  it to null
	//this is so the getInstance function can declare a new SingletonFrame
	private static SingletonFrame myInstance = null;
	//constructor for the SingletonFrame class that sets the parameters
	private SingletonFrame(){
		this.setSize(500,100);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
	//getInstance function, if myInstance equals null, then a new SingletonFrame is assigned to myInstance
	public static SingletonFrame getInstance() {
		if(myInstance == null) {
			myInstance = new SingletonFrame();
		}
		return myInstance;
	}
	



}
