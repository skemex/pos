package skemex.pos.view;

public class Login extends LoginView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2059815484173464686L;

	public Login() {
		tfPassowrd.getPassword();
		tfUser.getText();
		okButton.addActionListener(l -> {
			System.out.println("Auth " + tfUser.getText() + " " + new String(tfPassowrd.getPassword()));
		});
		cancelButton.addActionListener(l -> System.exit(0));

	}

	public static void main(String[] args) {
		new Login();
	}
}
