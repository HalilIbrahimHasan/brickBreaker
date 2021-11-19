package brickbreaker;

import javax.swing.JFrame;

public class Screen {
	
	public static void main(String[] args) {
	    new Screen();
	}

	private JFrame window;

	public Screen() {
	    window = new JFrame("Multiply components panel");
	    //window.setLayout(null);
	    window.setSize(200, 200);

	    window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	    Box b1 = new Box(10,10, "box1");
	    //b1.setBounds(10, 10, 50, 50);

	    Box b2 = new Box(100,100, "box2");
	    //b2.setBounds(100, 100, 50, 50);


	    window.add(b1);
	    //window.add(b2);


	    window.setVisible(true);

	    while (true){

	        b1.update();
	        b2.update();

	        try {
	            Thread.sleep(200);
	        } catch (Exception e) {
	            // TODO: handle exception
	        }
	    }

	}
	}