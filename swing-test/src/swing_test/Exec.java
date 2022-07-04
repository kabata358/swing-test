package swing_test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

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
		
		// ボタンを作成
		JButton btnSave = new JButton("保存");
		JButton btnReset = new JButton("リセット");
		JButton btnCancel = new JButton("キャンセル");
		
		// パネルにコンポーネントを追加
		p.add(btnSave);
		p.add(btnReset);
		p.add(btnCancel);
		
		// ContentPane にコンポーネントを追加
		frame.getContentPane().add(p, BorderLayout.SOUTH);
		
		// フレームを表示
		frame.setVisible(true);
		
	}

}
