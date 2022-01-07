package logic;

import java.awt.EventQueue;
import java.util.Properties;

import javax.swing.UIManager;

import com.jtattoo.plaf.luna.LunaLookAndFeel;

import gui.MainWindow;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Properties props = new Properties();
					props.put("logoString", "");
					props.put("focusColor", "0 0 0");
					LunaLookAndFeel.setCurrentTheme(props);
					UIManager.setLookAndFeel(
							"com.jtattoo.plaf.luna.LunaLookAndFeel");
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
