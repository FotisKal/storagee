package storage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

public class MainWindow {

	public JFrame frmMainWindow;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					MainWindow window = new MainWindow();
					window.frmMainWindow.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//String x = Main.usr;
		
		//System.out.println(x);
		frmMainWindow = new JFrame();
		frmMainWindow.setTitle("Main Window");
		frmMainWindow.setBounds(100, 100, 450, 256);
		frmMainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		 JLabel usrname = new JLabel("New label");
		 usrname.setText("hello "+Main.usr);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignIn signin = new SignIn();
				signin.frmSignIn.setVisible(true);
				frmMainWindow.dispose();
			}
		});
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				SignUp signup = new SignUp();
				signup.frmSignUp.setVisible(true);
				frmMainWindow.dispose();
				
			}
		});
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frmMainWindow.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSignIn)
							.addGap(119)
							.addComponent(usrname)
							.addGap(116)
							.addComponent(btnSignUp, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(178)
							.addComponent(btnContinue)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSignIn)
						.addComponent(btnSignUp)
						.addComponent(usrname, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
					.addComponent(btnContinue)
					.addGap(60))
		);
		frmMainWindow.getContentPane().setLayout(groupLayout);
	}
}
