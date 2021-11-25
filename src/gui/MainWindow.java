package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 418969130762685793L;
	private JPanel contentPane;
	private JPanel pnMainContent;
	private JPanel pnMainWindow;
	private JPanel pnHelp;
	private JButton btnContinue;
	private JPanel pnSize;
	private JLabel lblTitle;
	private JLabel lblContinue;
	private JPanel pnContinue;
	private JButton btnHelp;
	private JPanel pnSizeLabel;
	private JPanel pnSizeSlider;
	private JLabel lblChangeSize;
	private JPanel pnWestGap;
	private JPanel pnEastGap;
	private JPanel pnWestGapHelp;
	private JPanel pnEastGapHelp;
	private JPanel pnSouthGapHelp;
	private JSlider slResize;
	private JPanel panel;
	private JPanel pnNorthGap;
	private JPanel pnLoyaltyCode;
	private JPanel pnGiftsBoard;
	private JPanel pnSelectYourGifts;
	private JPanel pnTravelSelect;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_7;
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_14;
	private JPanel panel_12;
	private JButton btnNewButton_1;
	private JPanel panel_13;
	private JPanel panel_15;
	private JPanel panel_16;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/resources/img/2-2-gift-free-download-png.png")));
		setTitle("Welcome : Gifts Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(getPnMainWindow(), "pn1");
		contentPane.add(getPnLoyaltyCode(), "pn2");
		contentPane.add(getPnGiftsBoard(), "pn3");
		contentPane.add(getPnSelectYourGifts(), "pn4");
		contentPane.add(getPnTravelSelect(), "pn5");
	}

	private JPanel getPnMainContent() {
		if (pnMainContent == null) {
			pnMainContent = new JPanel();
			pnMainContent.setLayout(new GridLayout(3, 0, 0, 0));
			pnMainContent.add(getLblTitle());
			pnMainContent.add(getLblContinue());
			pnMainContent.add(getPnContinue());
		}
		return pnMainContent;
	}

	private JPanel getPnMainWindow() {
		if (pnMainWindow == null) {
			pnMainWindow = new JPanel();
			pnMainWindow.setLayout(new BorderLayout(0, 0));
			pnMainWindow.add(getPnMainContent(), BorderLayout.CENTER);
			pnMainWindow.add(getPnHelp(), BorderLayout.SOUTH);
			pnMainWindow.add(getPnWestGap(), BorderLayout.WEST);
			pnMainWindow.add(getPnEastGap(), BorderLayout.EAST);
			pnMainWindow.add(getPnNorthGap(), BorderLayout.NORTH);
		}
		return pnMainWindow;
	}

	private JPanel getPnHelp() {
		if (pnHelp == null) {
			pnHelp = new JPanel();
			pnHelp.setLayout(new BorderLayout(0, 0));
			pnHelp.add(getBtnHelp());
			pnHelp.add(getPnWestGapHelp(), BorderLayout.WEST);
			pnHelp.add(getPnEastGapHelp(), BorderLayout.EAST);
			pnHelp.add(getPnSouthGapHelp(), BorderLayout.SOUTH);
		}
		return pnHelp;
	}

	private JButton getBtnContinue() {
		if (btnContinue == null) {
			btnContinue = new JButton("CONTINUE \u2500\u25BA");
			btnContinue.setForeground(new Color(255, 255, 255));
			btnContinue.setBackground(new Color(0, 128, 0));
			btnContinue.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return btnContinue;
	}

	private JPanel getPnSize() {
		if (pnSize == null) {
			pnSize = new JPanel();
			pnSize.setLayout(new GridLayout(0, 2, 0, 0));
			pnSize.add(getPnSizeLabel());
			pnSize.add(getPnSizeSlider());
		}
		return pnSize;
	}

	private JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel("WELCOME TO THE AMAZING GIFT PANEL!!!");
			lblTitle.setFont(new Font("Tahoma", Font.BOLD, 35));
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblTitle;
	}

	private JLabel getLblContinue() {
		if (lblContinue == null) {
			lblContinue = new JLabel("Press Continue to Procced");
			lblContinue.setHorizontalAlignment(SwingConstants.CENTER);
			lblContinue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblContinue;
	}

	private JPanel getPnContinue() {
		if (pnContinue == null) {
			pnContinue = new JPanel();
			pnContinue.setLayout(new GridLayout(0, 1, 0, 0));
			pnContinue.add(getBtnContinue());
		}
		return pnContinue;
	}

	private JButton getBtnHelp() {
		if (btnHelp == null) {
			btnHelp = new JButton("HELP");
			btnHelp.setBackground(new Color(255, 255, 0));
			btnHelp.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return btnHelp;
	}

	private JPanel getPnSizeLabel() {
		if (pnSizeLabel == null) {
			pnSizeLabel = new JPanel();
			pnSizeLabel.setLayout(new GridLayout(0, 1, 0, 0));
			pnSizeLabel.add(getLblChangeSize());
		}
		return pnSizeLabel;
	}

	private JPanel getPnSizeSlider() {
		if (pnSizeSlider == null) {
			pnSizeSlider = new JPanel();
			pnSizeSlider.setLayout(new GridLayout(3, 1, 0, 0));
			pnSizeSlider.add(getPanel());
			pnSizeSlider.add(getSlResize());
		}
		return pnSizeSlider;
	}

	private JLabel getLblChangeSize() {
		if (lblChangeSize == null) {
			lblChangeSize = new JLabel("Cannot see? Increase letter size \u2500\u25BA");
			lblChangeSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblChangeSize.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblChangeSize;
	}

	private JPanel getPnWestGap() {
		if (pnWestGap == null) {
			pnWestGap = new JPanel();
		}
		return pnWestGap;
	}

	private JPanel getPnEastGap() {
		if (pnEastGap == null) {
			pnEastGap = new JPanel();
		}
		return pnEastGap;
	}

	private JPanel getPnWestGapHelp() {
		if (pnWestGapHelp == null) {
			pnWestGapHelp = new JPanel();
		}
		return pnWestGapHelp;
	}

	private JPanel getPnEastGapHelp() {
		if (pnEastGapHelp == null) {
			pnEastGapHelp = new JPanel();
		}
		return pnEastGapHelp;
	}

	private JPanel getPnSouthGapHelp() {
		if (pnSouthGapHelp == null) {
			pnSouthGapHelp = new JPanel();
		}
		return pnSouthGapHelp;
	}

	private JSlider getSlResize() {
		if (slResize == null) {
			slResize = new JSlider();
			slResize.setMaximum(68);
			slResize.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					if (slResize.getValue() <= 12) {
						getLblTitle().setFont(new Font("Tahoma", Font.BOLD, 35 + slResize.getValue()));
					}
					if (slResize.getValue() <= 68) {
						getLblContinue().setFont(new Font("Tahoma", Font.PLAIN, 20 + slResize.getValue()));
					}
					if (slResize.getValue() <= 11) {
						getLblChangeSize().setFont(new Font("Tahoma", Font.PLAIN, 20 + slResize.getValue()));
					}
					getBtnContinue().setFont(new Font("Tahoma", Font.BOLD, 24 + slResize.getValue()));
					getBtnHelp().setFont(new Font("Tahoma", Font.BOLD, 18 + slResize.getValue()));
				}
			});
			slResize.setValue(0);
		}
		return slResize;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}
	private JPanel getPnNorthGap() {
		if (pnNorthGap == null) {
			pnNorthGap = new JPanel();
			pnNorthGap.setLayout(new GridLayout(0, 1, 0, 0));
			pnNorthGap.add(getPanel_5());
		}
		return pnNorthGap;
	}
	private JPanel getPnLoyaltyCode() {
		if (pnLoyaltyCode == null) {
			pnLoyaltyCode = new JPanel();
			pnLoyaltyCode.setLayout(new BorderLayout(0, 0));
			pnLoyaltyCode.add(getPanel_1(), BorderLayout.CENTER);
		}
		return pnLoyaltyCode;
	}
	private JPanel getPnGiftsBoard() {
		if (pnGiftsBoard == null) {
			pnGiftsBoard = new JPanel();
		}
		return pnGiftsBoard;
	}
	private JPanel getPnSelectYourGifts() {
		if (pnSelectYourGifts == null) {
			pnSelectYourGifts = new JPanel();
		}
		return pnSelectYourGifts;
	}
	private JPanel getPnTravelSelect() {
		if (pnTravelSelect == null) {
			pnTravelSelect = new JPanel();
		}
		return pnTravelSelect;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(3, 1, 0, 0));
			panel_1.add(getPanel_2());
			panel_1.add(getPanel_3());
			panel_1.add(getPanel_4());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new GridLayout(2, 0, 0, 0));
			panel_2.add(getLblNewLabel());
			panel_2.add(getLblNewLabel_1());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(2, 0, 0, 0));
			panel_3.add(getLblNewLabel_2());
			panel_3.add(getPanel_7_1());
		}
		return panel_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(new GridLayout(2, 0, 0, 0));
			panel_4.add(getBtnNewButton());
			panel_4.add(getPanel_12());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(new BorderLayout(0, 0));
			panel_5.add(getPnSize());
			panel_5.add(getPanel_6(), BorderLayout.NORTH);
			panel_5.add(getPanel_8(), BorderLayout.WEST);
			panel_5.add(getPanel_9(), BorderLayout.EAST);
		}
		return panel_5;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
		}
		return panel_6;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
		}
		return panel_8;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
		}
		return panel_9;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("DO YOU HAVE A LOYALTY CODE?");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("We need the code to identify you, please introduce it at the bottom");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("  Please introduce your code here:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		}
		return lblNewLabel_2;
	}
	private JPanel getPanel_7_1() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(new GridLayout(2, 1, 0, 0));
			panel_7.add(getPanel_10());
		}
		return panel_7;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("CONTINUE");
		}
		return btnNewButton;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setLayout(new BorderLayout(0, 0));
			panel_10.add(getTextField());
			panel_10.add(getPanel_11(), BorderLayout.WEST);
			panel_10.add(getPanel_14(), BorderLayout.EAST);
		}
		return panel_10;
	}
	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
		}
		return panel_11;
	}
	private JPanel getPanel_14() {
		if (panel_14 == null) {
			panel_14 = new JPanel();
		}
		return panel_14;
	}
	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			panel_12.setLayout(new GridLayout(2, 3, 0, 0));
			panel_12.add(getPanel_16());
			panel_12.add(getPanel_13());
		}
		return panel_12;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("BACK");
		}
		return btnNewButton_1;
	}
	private JPanel getPanel_13() {
		if (panel_13 == null) {
			panel_13 = new JPanel();
			panel_13.setLayout(new BorderLayout(0, 0));
			panel_13.add(getBtnNewButton_1());
			panel_13.add(getPanel_15(), BorderLayout.SOUTH);
		}
		return panel_13;
	}
	private JPanel getPanel_15() {
		if (panel_15 == null) {
			panel_15 = new JPanel();
		}
		return panel_15;
	}
	private JPanel getPanel_16() {
		if (panel_16 == null) {
			panel_16 = new JPanel();
		}
		return panel_16;
	}
}
