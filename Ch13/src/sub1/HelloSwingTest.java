package sub1;

import java.awt.Container;
import java.awt.Dimension;                            

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwingTest {
		public static void main(String[] args) {
			//������ ����
			JFrame frame = new JFrame("Hello Swing");
			frame.setPreferredSize(new Dimension(300,200));
			frame.pack();
			frame.setVisible(true);
		
			//�����̳� ����
			Container pane = frame.getContentPane();
			
			//������Ʈ ��ġ
			JLabel label = new JLabel("Hello Swing!");
			pane.add(label);
			
			JButton button = new JButton("Ȯ��");
			pane.add(button);
		}
}
