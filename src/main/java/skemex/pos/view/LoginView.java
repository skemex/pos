package skemex.pos.view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
/*
 * Created by JFormDesigner on Sat Apr 15 19:46:34 CDT 2023
 */

/**
 * @author skeme
 */
public class LoginView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 182230798252418988L;

	public LoginView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Wuilver Patricio Espiridion
		lblUser = new JLabel();
		tfUser = new JTextField();
		lblPassword = new JLabel();
		tfPassowrd = new JPasswordField();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridBagLayout());
		((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
		((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- lblUser ----
		lblUser.setText("Usuario:");
		contentPane.add(lblUser, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 7, 7), 0, 0));
		contentPane.add(tfUser, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 7, 7), 0, 0));

		//---- lblPassword ----
		lblPassword.setText("Contrase\u00f1a:");
		contentPane.add(lblPassword, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 7, 7), 0, 0));
		contentPane.add(tfPassowrd, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.BASELINE, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 7, 7), 0, 0));

		//======== buttonBar ========
		{
			buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
			buttonBar.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
			0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
			. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
			red) ,buttonBar. getBorder( )) ); buttonBar. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
			beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
			buttonBar.setLayout(new GridBagLayout());
			((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
			((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

			//---- okButton ----
			okButton.setText("Entrar");
			buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));

			//---- cancelButton ----
			cancelButton.setText("Cancelar");
			buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		contentPane.add(buttonBar, new GridBagConstraints(0, 6, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 7), 0, 0));
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Wuilver Patricio Espiridion
	private JLabel lblUser;
	public JTextField tfUser;
	private JLabel lblPassword;
	public JPasswordField tfPassowrd;
	private JPanel buttonBar;
	public JButton okButton;
	public JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
