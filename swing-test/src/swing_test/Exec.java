package swing_test;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exec {

	public static void main(String[] args) {
		
		// フレームを作成
		JFrame frame = new JFrame("My First GUI App");
		
		// x座標, y座標, width, height
		frame.setBounds(100, 100, 600, 400);
		// 閉じるボタンがクリックされた時の処理を設定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// パネルを作成
		JPanel p = new JPanel();
		
		// ラベルを作成
		JLabel labelAge = new JLabel("年齢");
		JLabel labelGender = new JLabel("性別");
		
		// テキストフィールドを作成
		JTextField text = new JTextField(2);
		String str = text.getText();
		
		
		// ボタンを作成
		JButton btnSave = new JButton("保存");
		JButton btnReset = new JButton("リセット");
		JButton btnCancel = new JButton("キャンセル");
		
		// ラジオボタンを作成
		JRadioButton[] radio = new JRadioButton[2];
		radio[0] = new JRadioButton("男性");
		radio[1] = new JRadioButton("女性");
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(radio[0]);
		btnGroup.add(radio[1]);
		
		// パネルにコンポーネントを追加
		p.add(labelAge);
		p.add(text);
		p.add(labelGender);
		p.add(radio[0]);
		p.add(radio[1]);
		p.add(btnSave);
		p.add(btnReset);
		p.add(btnCancel);

		
		// ContentPane にコンポーネントを追加
		frame.getContentPane().add(p, BorderLayout.SOUTH);
		
		// フレームを表示
		frame.setVisible(true);
		
	}

}
