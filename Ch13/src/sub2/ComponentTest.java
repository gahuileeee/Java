package sub2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ComponentTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtnum3;
	private JTextField txtnum4;
	private JTextField txtnum5;
	private JTextField txtnum6;
	private JTextField txtnum7;
	private JTextField txtnum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
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
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCEF4\uD3EC\uB10C\uD2B8 \uC2E4\uC2B5");
		lblNewLabel.setBounds(12, 0, 238, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("\uD655\uC7781");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인 1 클릭클릭쓰!");
			}
		});
		btn1.setBounds(12, 76, 71, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("\uD655\uC7782");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!");
			}
		});
		btn2.setBounds(135, 76, 71, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("\uD655\uC7783");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 하이하이루!", "확인대화상자",JOptionPane.YES_NO_OPTION);
				if(answer == 0 ) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn3.setBounds(263, 76, 71, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("\uBC84\uD2BC \uC2E4\uC2B5");
		lblNewLabel_1.setBounds(12, 46, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uD14D\uC2A4\uD2B8 \uD544\uB4DC \uC2E4\uC2B5");
		lblNewLabel_2.setBounds(12, 124, 110, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_3.setBounds(12, 149, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(53, 146, 124, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("\uD655\uC778");
	
		btnUid.setBounds(193, 145, 63, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultId = new JLabel("\uACB0\uACFC: ");
		lbResultId.setBounds(268, 149, 124, 15);
		frame.getContentPane().add(lbResultId);
		
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC774\uB984");
		lblNewLabel_3_1.setBounds(12, 178, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(53, 175, 124, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("\uD655\uC778");
		
		btnName.setBounds(193, 174, 63, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("\uACB0\uACFC: ");
		lbResultName.setBounds(268, 178, 124, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_3_2 = new JLabel("\uD734\uB300\uD3F0");
		lblNewLabel_3_2.setBounds(12, 207, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(53, 204, 124, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("\uD655\uC778");
	
		btnHp.setBounds(193, 203, 63, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("\uACB0\uACFC: ");
		lbResultHp.setBounds(268, 207, 124, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_3_3 = new JLabel("\uB367\uC148");
		lblNewLabel_3_3.setBounds(12, 236, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		txtnum1 = new JTextField();
		txtnum1.setColumns(10);
		txtnum1.setBounds(53, 233, 57, 21);
		frame.getContentPane().add(txtnum1);
		
		JButton btnPlus = new JButton("\uD655\uC778");
	
		btnPlus.setBounds(202, 232, 63, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("\uACB0\uACFC: ");
		lbResultPlus.setBounds(278, 236, 124, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(135, 233, 57, 21);
		frame.getContentPane().add(txtnum2);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(120, 235, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("\uBE84\uC148");
		lblNewLabel_3_3_1.setBounds(12, 265, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(53, 262, 57, 21);
		frame.getContentPane().add(txtnum3);
		
		JLabel lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setBounds(120, 264, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtnum4 = new JTextField();
		txtnum4.setColumns(10);
		txtnum4.setBounds(135, 262, 57, 21);
		frame.getContentPane().add(txtnum4);
		
		JButton btnMinus = new JButton("\uD655\uC778");
	
		btnMinus.setBounds(202, 261, 63, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbResultMinus = new JLabel("\uACB0\uACFC: ");
		lbResultMinus.setBounds(278, 265, 124, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("\uACF1\uC148");
		lblNewLabel_3_3_2.setBounds(12, 294, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_3_2);
		
		txtnum5 = new JTextField();
		txtnum5.setColumns(10);
		txtnum5.setBounds(53, 291, 57, 21);
		frame.getContentPane().add(txtnum5);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setBounds(120, 293, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		txtnum6 = new JTextField();
		txtnum6.setColumns(10);
		txtnum6.setBounds(135, 291, 57, 21);
		frame.getContentPane().add(txtnum6);
		
		JButton btnMulti = new JButton("\uD655\uC778");
	
		btnMulti.setBounds(202, 290, 63, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbResultMulti = new JLabel("\uACB0\uACFC: ");
		lbResultMulti.setBounds(278, 294, 124, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("\uB098\uB217\uC148");
		lblNewLabel_3_3_3.setBounds(12, 323, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_3_3);
		
		txtnum7 = new JTextField();
		txtnum7.setColumns(10);
		txtnum7.setBounds(53, 320, 57, 21);
		frame.getContentPane().add(txtnum7);
		
		JLabel lblNewLabel_7 = new JLabel("/");
		lblNewLabel_7.setBounds(120, 322, 57, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		txtnum8 = new JTextField();
		txtnum8.setColumns(10);
		txtnum8.setBounds(135, 320, 57, 21);
		frame.getContentPane().add(txtnum8);
		
		JButton btnDiv = new JButton("\uD655\uC778");
	
		btnDiv.setBounds(202, 319, 63, 23);
		frame.getContentPane().add(btnDiv);
		
		JLabel lbResultDiv = new JLabel("\uACB0\uACFC: ");
		lbResultDiv.setBounds(278, 323, 124, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JLabel lblNewLabel_8 = new JLabel("\uCCB4\uD06C\uBC15\uC2A4 \uC2E4\uC2B5");
		lblNewLabel_8.setBounds(12, 365, 110, 15);
		frame.getContentPane().add(lblNewLabel_8);
		
		JCheckBox chk1 = new JCheckBox("\uC11C\uC6B8");
		chk1.setBounds(12, 386, 71, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("\uB300\uC804");
		chk2.setBounds(87, 386, 71, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("\uB300\uAD6C");
		chk3.setBounds(162, 386, 71, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("\uBD80\uC0B0");
		chk4.setBounds(237, 386, 71, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("\uAD11\uC8FC");
		chk5.setBounds(312, 386, 71, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("\uD655\uC778");
	
		btnCheck.setBounds(387, 386, 71, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("\uACB0\uACFC :");
		lbCheckResult.setBounds(12, 423, 261, 15);
		frame.getContentPane().add(lbCheckResult);
	
		//이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				텍스트 필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
//				결과 라벨에 가져온 문자열 입력하기
				lbResultId.setText("결과 : " +uid); 
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과 : "+name);
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : "+hp);
			}
		});
		
		//계산기 이벤트 리스너
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtnum1.getText());
				int b = Integer.parseInt(txtnum2.getText());
				
				lbResultPlus.setText("결과 : "+(a+b));
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtnum3.getText());
				int b = Integer.parseInt(txtnum4.getText());
				
				lbResultMinus.setText("결과 : "+(a-b));
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtnum5.getText());
				int b = Integer.parseInt(txtnum6.getText());
				
				lbResultMulti.setText("결과 : "+(a*b));
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtnum7.getText());
				int b = Integer.parseInt(txtnum8.getText());
				
				lbResultDiv.setText("결과 : "+(a/b));
			}
		});
//		체크박스 이벤트 헨들러
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText(cities.toString());
			}
		});
	}
}
