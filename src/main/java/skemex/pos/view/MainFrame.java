package skemex.pos.view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Product Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and add ProductRegistrationPanel to frame
		ProductRegistrationPanel panel = new ProductRegistrationPanel();
		add(panel);

		pack(); // Size the frame to fit its contents
		setLocationRelativeTo(null); // Center the frame on the screen
	}

	public static void main(String[] args) {
		// Run the frame on the event dispatch thread
		SwingUtilities.invokeLater(() -> {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
		});
	}
}
