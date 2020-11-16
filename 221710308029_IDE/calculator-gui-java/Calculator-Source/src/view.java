
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class view{
	public void outputFinal() {
		
		//Colors
		Color ac_color = new Color(172, 57, 57);
		Color operators_color = new Color(102, 102, 102);
		Color number_color = new Color(77, 77, 77);
		Color submit_color = new Color(0, 68, 102);
		Color border_color = new Color(128, 139, 152);
		
		// JFrame
		JFrame layout = new JFrame("Calculator");
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		//Image Icon
//		Image icon = Toolkit.getDefaultToolkit().getImage("img/icon.png"); 
		
		ImageIcon icon = new ImageIcon("img/icon.png");
		
		layout.setIconImage(icon.getImage());
//		layout.setIconImage(img);

		//JPanel
		JPanel panel= new JPanel();  
		panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.black);  
	
        layout.setContentPane(panel);
		
        //Labels
        JLabel num1 = new JLabel();
		num1.setText("0");
		num1.setFont(new Font("SegoeUI", Font.PLAIN, 15));
		num1.setForeground(Color.WHITE); 
		num1.setHorizontalAlignment(JLabel.RIGHT);
		num1.setBounds(5, 5, 130, 20);
		
		JLabel op = new JLabel();
		op.setText("");
		op.setFont(new Font("SegoeUI", Font.PLAIN, 15));
		op.setForeground(Color.WHITE); 
		op.setHorizontalAlignment(JLabel.RIGHT);
		op.setBounds(135, 5, 130, 20 );
		
		JLabel num2 = new JLabel();
		num2.setText("0");
		num2.setFont(new Font("SegoeUI", Font.PLAIN, 15));
		num2.setForeground(Color.WHITE);
		num2.setHorizontalAlignment(JLabel.RIGHT);
		num2.setBounds(265, 5, 130, 20);
		
		layout.add(num2);
		layout.add(num1);
		layout.add(op);
		
		
        //JTextField
		JTextField inputField = new JTextField(16);
	    inputField.setHorizontalAlignment(JTextField.RIGHT);
		inputField.setBounds(5, 30, 395, 60);
		inputField.setFont(new Font("SegoeUI", Font.PLAIN, 30));
		inputField.setForeground(Color.WHITE);
		inputField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '/' || ke.getKeyChar() == 'x' || ke.getKeyChar() == '-' || ke.getKeyChar() == '+' || ke.getKeyChar() == '.' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE  ) {
	            	inputField.setEditable(true);
	            } else {
	            	inputField.setEditable(false);
	            }
	         }
	      });

		inputField.setBorder(new LineBorder(border_color,1));
		
		inputField.setBackground(Color.black);
		//-------------------------------------
		// Row 1
		//AC Button
		JButton ac_btn=new JButton("AC");
		ac_btn.setBounds(5, 90, 195, 75);
		ac_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		ac_btn.setBackground(ac_color);
		ac_btn.setForeground(Color.WHITE);
		
		// Div Button
		JButton div_btn=new JButton("/");
		div_btn.setBounds(200, 90, 100, 75);
		div_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		div_btn.setBackground(operators_color);
		div_btn.setForeground(Color.WHITE);
		
		// mul Button
		JButton mul_btn=new JButton("X");
		mul_btn.setBounds(300, 90, 100, 75);
		mul_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		mul_btn.setBackground(operators_color);
		mul_btn.setForeground(Color.WHITE);
		
		//------------------------------------
		// Row 2
		// 7 Button
		JButton seven_btn=new JButton("7");
		seven_btn.setBounds(5, 165, 95, 75);
		seven_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		seven_btn.setBackground(number_color);
		seven_btn.setForeground(Color.WHITE);
		
		
		// 8 Button
		JButton eight_btn=new JButton("8");
		eight_btn.setBounds(100, 165, 100, 75);
		eight_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		eight_btn.setBackground(number_color);
		eight_btn.setForeground(Color.WHITE);		
		
		// 9 Button
		JButton nine_btn=new JButton("9");
		nine_btn.setBounds(200, 165, 100, 75);
		nine_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		nine_btn.setBackground(number_color);
		nine_btn.setForeground(Color.WHITE);			
		
		// - Button
		JButton sub_btn=new JButton("-");
		sub_btn.setBounds(300, 165, 100, 75);
		sub_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		sub_btn.setBackground(operators_color);
		sub_btn.setForeground(Color.WHITE);		
		
		//--------------------------------------
		// Row 3
		// 4 Button
		JButton four_btn=new JButton("4");
		four_btn.setBounds(5, 240, 95, 75);
		four_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		four_btn.setBackground(number_color);
		four_btn.setForeground(Color.WHITE);	
				
		// 5 Button
		JButton five_btn=new JButton("5");
		five_btn.setBounds(100, 240, 100, 75);
		five_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		five_btn.setBackground(number_color);
		five_btn.setForeground(Color.WHITE);			
		
		// 6 Button
		JButton six_btn=new JButton("6");
		six_btn.setBounds(200, 240, 100, 75);
		six_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		six_btn.setBackground(number_color);
		six_btn.setForeground(Color.WHITE);	
				
		// + Button
		JButton plus_btn=new JButton("+");
		plus_btn.setBounds(300, 240, 100, 75);
		plus_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		plus_btn.setBackground(operators_color);
		plus_btn.setForeground(Color.WHITE);	
			
		// -------------------------------------
		// Row 4
		// 1 Button
		JButton one_btn=new JButton("1");
		one_btn.setBounds(5, 315, 95, 75);
		one_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		one_btn.setBackground(number_color);
		one_btn.setForeground(Color.WHITE);	
				
		// 2 Button
		JButton two_btn=new JButton("2");
		two_btn.setBounds(100, 315, 100, 75);
		two_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		two_btn.setBackground(number_color);
		two_btn.setForeground(Color.WHITE);	
				
		// 3 Button
		JButton three_btn=new JButton("3");
		three_btn.setBounds(200, 315, 100, 75);
		three_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		three_btn.setBackground(number_color);
		three_btn.setForeground(Color.WHITE);	
				
		// = Button
		JButton submit_btn=new JButton("=");
		submit_btn.setBounds(300, 315, 100, 150);
		submit_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		submit_btn.setBackground(submit_color);
		submit_btn.setForeground(Color.WHITE);	
				
		//----------------------------------------
		// 0 Button
		JButton zero_btn=new JButton("0");
		zero_btn.setBounds(5, 390, 195, 75);
		zero_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		zero_btn.setBackground(number_color);
		zero_btn.setForeground(Color.WHITE);	
				
		// dot Button
		JButton dot_btn=new JButton(".");
		dot_btn.setBounds(200, 390, 100, 75);
		dot_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		dot_btn.setBackground(operators_color);
		dot_btn.setForeground(Color.WHITE);	
		
		
		
		layout.add(num1);
		layout.add(inputField);
		layout.add(ac_btn);
		layout.add(div_btn);
		layout.add(mul_btn);
		layout.add(seven_btn);
		layout.add(eight_btn);
		layout.add(nine_btn);
		layout.add(sub_btn);
		layout.add(four_btn);
		layout.add(five_btn);
		layout.add(six_btn);
		layout.add(plus_btn);
		layout.add(one_btn);
		layout.add(two_btn);
		layout.add(three_btn);
		layout.add(submit_btn);
		layout.add(zero_btn);
		layout.add(dot_btn);

		layout.setSize(420, 510);
		
//		public void TextFieldInput() {
//			
//		}
		
		zero_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {

				String input = inputField.getText();
				String num = "0";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}
			}
			});
		
		one_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {

				String input = inputField.getText();
				String num = "1";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}

			}
			});
		
		two_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "2";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}
			}
			});
		
		three_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "3";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}
			}
			});

		four_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "4";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}
			}
			});
		
		five_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "5";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		
		six_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "6";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		seven_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "7";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		eight_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "8";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		
		nine_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "9";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		
		dot_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = ".";
				input += num;
				
				inputField.setText(input);
				if(op.getText() == "") {
					num1.setText(input);
//					System.out.println("Num1:" + input);
				}
				else {
					num2.setText(input);
//					System.out.println("Num2:" + input);
				}			}
			});
		
		plus_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "+";

				input = num;
				
				inputField.setText("");
				op.setText(input);
				

			}
			});
		
		sub_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "-";
				input = num;
				
				inputField.setText("");
				op.setText(input);
			}
			});
		
		mul_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "x";
				input = num;
				
				inputField.setText("");
				op.setText(input);
			}
			});
		
		div_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "/";
input = num;
				
				inputField.setText("");
				op.setText(input);
			}
			});
		
		ac_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
					inputField.setText("");
					num1.setText("");
					num2.setText("");
					op.setText("");
			}
			});
			
		submit_btn.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				float n1 = Float.valueOf(num1.getText());
				float n2 = Float.valueOf(num2.getText());
				String operator = op.getText();
			
				float ans;
				
				switch(operator) {
					case "+": ans = n1 + n2;
					
					String sans = String.valueOf(ans);
					String output = "";
					for(int i=0; i<sans.length(); i++) {	
						if(sans.charAt(i) == '.') {
							if(sans.charAt(i+1) != '0' )
							{
								output+=sans.charAt(i);
							}
							else
							break;
						}
						else {
							output += sans.charAt(i);
//							System.out.println(output);
						}
					}
								inputField.setText(String.valueOf(output));
								num1.setText(String.valueOf(output));
								num2.setText("");
								break;
								
					case "-": ans = n1 - n2;
					String sans1 = String.valueOf(ans);
					String output1 = "";
					for(int i=0; i<sans1.length(); i++) {	
						if(sans1.charAt(i) == '.') {
							if(sans1.charAt(i+1) != '0' )
							{
								output1+=sans1.charAt(i);
							}
							else
							break;
						}
						else {
							output1 += sans1.charAt(i);
//							System.out.println(output1);
						}
					}
								inputField.setText(String.valueOf(output1));
								num1.setText(String.valueOf(output1));
								num2.setText("");
					break;
					
					case "x": ans = n1 * n2;
					String sans2 = String.valueOf(ans);
					String output2 = "";
					for(int i=0; i<sans2.length(); i++) {	
						if(sans2.charAt(i) == '.') {
							if(sans2.charAt(i+1) != '0' )
							{
								output2+=sans2.charAt(i);
							}
							else
							break;
						}
						else {
							output2 += sans2.charAt(i);
//							System.out.println(output2);
						}
					}
								inputField.setText(String.valueOf(output2));
								num1.setText(String.valueOf(output2));
								num2.setText("");
					break;
					
					case "/": ans = n1 / n2;
					String sans3 = String.valueOf(ans);
					String output3 = "";
					for(int i=0; i<sans3.length(); i++) {	
						if(sans3.charAt(i) == '.') {
							if(sans3.charAt(i+1) != '0' )
							{
								output3+=sans3.charAt(i);
							}
							else
							break;
						}
						else {
							output3 += sans3.charAt(i);
//							System.out.println(output3);
						}
					}
								inputField.setText(String.valueOf(output3));
								num1.setText(String.valueOf(output3));
								num2.setText("");
					break;
					
					default: System.out.println("Invalid");
				}
				
			}
			
			
		});
		
		BorderLayout border = new BorderLayout();
		
		layout.setLayout(border);
		layout.setLocation(640, 250);
		layout.setVisible(true);
		layout.setResizable(false);

	}
	
}