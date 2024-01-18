package sub3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 283, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBackground(new Color(255, 204, 204));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setEditable(false);
		txtResult.setFont(new Font("굴림", Font.BOLD, 24));
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 240, 51);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
	
		btn7.setBackground(new Color(255, 223, 223));
		btn7.setBounds(12, 111, 51, 51);
		frame.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 223, 223));
		btn9.setBounds(138, 111, 51, 51);
		frame.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(255, 223, 223));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(201, 111, 51, 51);
		frame.getContentPane().add(btnDiv);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 223, 223));
		btn8.setBounds(75, 111, 51, 51);
		frame.getContentPane().add(btn8);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 223, 223));
		btn4.setBounds(12, 174, 51, 51);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 223, 223));
		btn5.setBounds(75, 174, 51, 51);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 223, 223));
		btn6.setBounds(138, 174, 51, 51);
		frame.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBackground(new Color(255, 223, 223));
		btnMulti.setBounds(201, 174, 51, 51);
		frame.getContentPane().add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 223, 223));
		btn1.setBounds(12, 236, 51, 51);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 223, 223));
		btn2.setBounds(75, 236, 51, 51);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 223, 223));
		btn3.setBounds(138, 236, 51, 51);
		frame.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(255, 223, 223));
		btnMinus.setBounds(201, 236, 51, 51);
		frame.getContentPane().add(btnMinus);
		
		JButton btnC = new JButton("c");
		btnC.setBackground(new Color(255, 223, 223));
		btnC.setBounds(12, 297, 51, 51);
		frame.getContentPane().add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 223, 223));
		btn0.setBounds(75, 297, 51, 51);
		frame.getContentPane().add(btn0);
		
		JButton btnequals = new JButton("=");
	
		btnequals.setBackground(new Color(255, 223, 223));
		btnequals.setBounds(138, 297, 51, 51);
		frame.getContentPane().add(btnequals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 223, 223));
		btnPlus.setBounds(201, 297, 51, 51);
		frame.getContentPane().add(btnPlus);
//		이벤트 핸들러
		
		TreeMap<Integer,Integer> operater = new TreeMap<>();
		operater.put(0,1);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "7";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "8";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "9";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "4";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "3";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "2";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "1";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "0";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "5";
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "6";
				
				if (operater.get(0)==1) {
					txtResult.setText(a);
					operater.put(0,0);
				}else {
					String b = txtResult.getText();
					txtResult.setText(b+a);
				}
			}
		});
		List<String> list = new ArrayList<String>();
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("0");
				list.removeAll(list);
				operater.put(0,1);
			}
		});
		
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(txtResult.getText());
				list.add("Div");
				operater.put(0,1);
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(txtResult.getText());
				list.add("Multi");
				operater.put(0,1);
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(txtResult.getText());
				list.add("Minus");
				operater.put(0,1);
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(txtResult.getText());
				list.add("Plus");
				operater.put(0,1);
			}
		});


		
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(txtResult.getText());
				int num1=Integer.parseInt(list.get(0));
				int result=0;
				for(int i=1; i<list.size();i++) {
					String a = list.get(i);
					if(a.equals("Multi")) {
						result= num1*Integer.parseInt(list.get(i+1));
						num1=result;
						i++;
					}else if(a.equals("Div")) {
						result= num1/Integer.parseInt(list.get(i+1));
						num1=result;
						i++;
						
					}else if(a.equals("Minus")) {
						result= num1-Integer.parseInt(list.get(i+1));
						num1=result;
						i++;
						
					}else if(a.equals("Plus")) {
						result= num1+Integer.parseInt(list.get(i+1));
						num1=result;
						i++;
					}
				}
				String re = String.valueOf(result);
				txtResult.setText(re);
				list.removeAll(list);
			}
			
		});
	
	}

}
