package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import logic.Clients;
import logic.Game;
import logic.Gift;
import logic.Gifts;
import logic.Main;
import logic.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MainWindow extends JFrame {

	private static final long serialVersionUID = 418969130762685793L;

	// PANELS
	private JPanel contentPane;
	private JPanel pnMainContent;
	private JPanel pnMainWindow;
	private JPanel pnHelp;
	private JPanel pnSize;
	private JPanel pnContinue;
	private JPanel pnSizeLabel;
	private JPanel pnSizeSlider;
	private JPanel pnWestGap;
	private JPanel pnEastGap;
	private JPanel pnWestGapHelp;
	private JPanel pnEastGapHelp;
	private JPanel pnSouthGapHelp;
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
	private JPanel panel_7;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_14;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel pnSizeLabel_2;
	private JLabel lblChangeSize_2;
	private JPanel pnSizeSlider_2;
	private JPanel panel_19;
	private JPanel pnNorth;
	private JPanel pnSizeLabel_3;
	private JPanel pnSizeSlider_3;
	private JPanel panel_193;

	// LABELS
	private JLabel lblTitle;
	private JLabel lblContinue;
	private JLabel lblChangeSize;
	private JLabel lblTitleLoyalty;
	private JLabel lblSubtitleLoyalty;
	private JLabel lblIntroduceCode;

	// TEXTFIELDS
	private JTextField txtCode;

	// BUTTONS
	private JButton btnContinue2;
	private JButton btnBack2;
	private JButton btnHelp;
	private JButton btnContinue;

	// SLIDERS
	private JSlider slResize;
	private JSlider slResize_2;
	private JSlider slResize_3;

	// LAYOUT
	private CardLayout crd;

	private JLabel lblTitle3;
	private JPanel pnEast;
	private JButton btnContinue3;
	private JButton btnNewButton_1;
	private JPanel panel_20;
	private JButton btnHelp3;
	private JPanel pnBoxes;
	private JPanel pnNorth_1;
	private JPanel pnSizeLabel_3_1;
	private JLabel lblSelectYourGifts;
	private JPanel pnSizeSlider_3_1;
	private JPanel panel_193_1;
	private JSlider slResize_3_1;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblImage;
	private JButton btnContinue4;
	private JPanel panel_24;
	private JPanel panel_25;
	private JLabel lblNewLabel_1;
	private JComboBox cbCategory;
	private JLabel lblNewLabel_2;
	private JComboBox cbOrder;
	private JTextField txtSearch;
	private JPanel panel_26;
	private JPanel panel_27;
	private JLabel lblRemainingPoints;
	private JLabel lblPointsCount;
	private JLabel lblNewLabel_5;
	private JComboBox cbGifts;
	private JButton btnAdd4;
	private JButton btnRemove4;
	private JLabel lblNewLabel_6;

	// LOGIC CLASSES
	private Clients cli = new Clients();
	private Gifts gf = new Gifts();
	private Game game = new Game(0, 3);
	private DefaultComboBoxModel dcbgiftm = new DefaultComboBoxModel();
	private DefaultListModel dlmGifts = new DefaultListModel();
	private MyButtonListener mbl = new MyButtonListener();
	private JPanel panel_28;
	private JPanel pnNorth4;
	private JPanel pnSouth4;
	private JPanel pnWest4;
	private JPanel pnEast4;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MainWindow.class.getResource("/img/gift.png")));
		setTitle("Welcome : Gifts Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 668);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		crd = new CardLayout(0, 0);
		contentPane.setLayout(crd);
		contentPane.add(getPnMainWindow(), "pn1");
		contentPane.add(getPnLoyaltyCode(), "pn2");
		contentPane.add(getPnGiftsBoard(), "pn3");
		contentPane.add(getPnSelectYourGifts(), "pn4");
		contentPane.add(getPnTravelSelect(), "pn5");
	}

	private void reinitializate() {
		Main.main(null);
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
			btnContinue.setToolTipText("Start the game, win some prizes!");
			btnContinue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					crd.next(getContentPane());
					getTxtCode().grabFocus();
					setTitle("Loyalty Code : Gifts Panel");
				}
			});
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
			btnHelp.setToolTipText("Get some help to start in the app");
			btnHelp.setMnemonic('H');
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
			lblChangeSize = new JLabel(
					"Cannot see? Increase letter size \u2500\u25BA");
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
			slResize.setToolTipText(
					"Move the slider and set the size of the texts in the screen to the ones you want");
			slResize.setMaximum(68);
			slResize.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					if (slResize.getValue() <= 12) {
						getLblTitle().setFont(new Font("Tahoma", Font.BOLD,
								35 + slResize.getValue()));
					}
					if (slResize.getValue() <= 68) {
						getLblContinue().setFont(new Font("Tahoma", Font.PLAIN,
								20 + slResize.getValue()));
					}
					if (slResize.getValue() <= 11) {
						getLblChangeSize().setFont(new Font("Tahoma",
								Font.PLAIN, 20 + slResize.getValue()));
					}
					getBtnContinue().setFont(new Font("Tahoma", Font.BOLD,
							24 + slResize.getValue()));
					getBtnHelp().setFont(new Font("Tahoma", Font.BOLD,
							18 + slResize.getValue()));
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
			pnGiftsBoard.setLayout(new BorderLayout(0, 0));
			pnGiftsBoard.add(getPnNorth(), BorderLayout.NORTH);
			pnGiftsBoard.add(getPnEast(), BorderLayout.EAST);
			pnGiftsBoard.add(getPanel_20(), BorderLayout.SOUTH);
			pnGiftsBoard.add(getPnBoxes(), BorderLayout.CENTER);

		}
		return pnGiftsBoard;
	}

	private JPanel getPnSelectYourGifts() {
		if (pnSelectYourGifts == null) {
			pnSelectYourGifts = new JPanel();
			pnSelectYourGifts.setLayout(new BorderLayout(0, 0));
			pnSelectYourGifts.add(getPnNorth_1(), BorderLayout.NORTH);
			pnSelectYourGifts.add(getPanel_21(), BorderLayout.CENTER);
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
			panel_2.add(getPanel_17());
			panel_2.add(getLblSubtitleLoyalty());
		}
		return panel_2;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(2, 0, 0, 0));
			panel_3.add(getLblIntroduceCode());
			panel_3.add(getPanel_7_1());
		}
		return panel_3;
	}

	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(new GridLayout(2, 0, 0, 0));
			panel_4.add(getBtnContinue2());
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

	private JLabel getLblTitleLoyalty() {
		if (lblTitleLoyalty == null) {
			lblTitleLoyalty = new JLabel("DO YOU HAVE A LOYALTY CODE?");
			lblTitleLoyalty.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitleLoyalty.setFont(new Font("Tahoma", Font.BOLD, 24));
		}
		return lblTitleLoyalty;
	}

	private JLabel getLblSubtitleLoyalty() {
		if (lblSubtitleLoyalty == null) {
			lblSubtitleLoyalty = new JLabel(
					"We need the code to identify you, please introduce it at the bottom");
			lblSubtitleLoyalty.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSubtitleLoyalty.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblSubtitleLoyalty;
	}

	private JLabel getLblIntroduceCode() {
		if (lblIntroduceCode == null) {
			lblIntroduceCode = new JLabel(
					"  Please introduce your identity code here:");
			lblIntroduceCode.setFont(new Font("Tahoma", Font.PLAIN, 22));
		}
		return lblIntroduceCode;
	}

	private JPanel getPanel_7_1() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(new GridLayout(2, 1, 0, 0));
			panel_7.add(getPanel_10());
		}
		return panel_7;
	}

	private JTextField getTxtCode() {
		if (txtCode == null) {
			txtCode = new JTextField();
			txtCode.setText("MFL137");
			txtCode.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtCode.setColumns(10);
		}
		return txtCode;
	}

	private JButton getBtnContinue2() {
		if (btnContinue2 == null) {
			btnContinue2 = new JButton("CONTINUE");
			btnContinue2.setBackground(Color.GREEN);
			btnContinue2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnContinue2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkCode(getTxtCode().getText())) {
						crd.next(getContentPane());
						setTitle("Board : Gifts Panel");
					} else {
						JOptionPane.showMessageDialog(rootPane,
								"Your Client ID is not in the Data Base or is "
										+ "incorrectly introduced, please check "
										+ "it again");
					}
				}
			});
		}
		return btnContinue2;
	}

	private boolean checkCode(String code) {
		for (Person p : cli.getClients()) {
			if (code.equals(p.getId_cliente())) {
				return true;
			}
		}
		return false;
	}

	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setLayout(new BorderLayout(0, 0));
			panel_10.add(getTxtCode());
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

	private JButton getBtnBack2() {
		if (btnBack2 == null) {
			btnBack2 = new JButton("BACK");
			btnBack2.setBackground(Color.RED);
			btnBack2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnBack2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					crd.previous(getContentPane());
				}
			});
		}
		return btnBack2;
	}

	private JPanel getPanel_13() {
		if (panel_13 == null) {
			panel_13 = new JPanel();
			panel_13.setLayout(new BorderLayout(0, 0));
			panel_13.add(getBtnBack2());
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
			panel_16.setLayout(new GridLayout(1, 0, 0, 0));
		}
		return panel_16;
	}

	private JPanel getPanel_17() {
		if (panel_17 == null) {
			panel_17 = new JPanel();
			panel_17.setLayout(new GridLayout(2, 1, 0, 0));
			panel_17.add(getPanel_18());
			panel_17.add(getLblTitleLoyalty());
		}
		return panel_17;
	}

	private JPanel getPanel_18() {
		if (panel_18 == null) {
			panel_18 = new JPanel();
			panel_18.setLayout(new GridLayout(0, 2, 0, 0));
			panel_18.add(getPnSizeLabel_2());
			panel_18.add(getPnSizeSlider_2());
		}
		return panel_18;
	}

	private JPanel getPnSizeLabel_2() {
		if (pnSizeLabel_2 == null) {
			pnSizeLabel_2 = new JPanel();
			pnSizeLabel_2.setLayout(new GridLayout(0, 1, 0, 0));
			pnSizeLabel_2.add(getLblChangeSize_2());
		}
		return pnSizeLabel_2;
	}

	private JLabel getLblChangeSize_2() {
		if (lblChangeSize_2 == null) {
			lblChangeSize_2 = new JLabel(
					"Cannot see? Increase letter size \u2500\u25BA");
			lblChangeSize_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblChangeSize_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblChangeSize_2;
	}

	private JPanel getPnSizeSlider_2() {
		if (pnSizeSlider_2 == null) {
			pnSizeSlider_2 = new JPanel();
			pnSizeSlider_2.setLayout(new GridLayout(3, 1, 0, 0));
			pnSizeSlider_2.add(getPanel_19());
			pnSizeSlider_2.add(getSlResize_2());
		}
		return pnSizeSlider_2;
	}

	private JPanel getPanel_19() {
		if (panel_19 == null) {
			panel_19 = new JPanel();
		}
		return panel_19;
	}

	private JSlider getSlResize_2() {
		if (slResize_2 == null) {
			slResize_2 = new JSlider();
			slResize_2.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					if (slResize_2.getValue() < 38) {
						getLblTitleLoyalty().setFont(new Font("Tahoma",
								Font.BOLD, 24 + slResize_2.getValue()));
					}
					if (slResize_2.getValue() < 20) {
						getLblSubtitleLoyalty().setFont(new Font("Tahoma",
								Font.PLAIN, 14 + slResize_2.getValue()));
					}
					if (slResize_2.getValue() < 12) {
						getLblChangeSize_2().setFont(new Font("Tahoma",
								Font.PLAIN, 20 + slResize_2.getValue()));
					}
					if (slResize_2.getValue() < 33) {
						getLblIntroduceCode().setFont(new Font("Tahoma",
								Font.PLAIN, 22 + slResize_2.getValue()));
					}
					if (slResize_2.getValue() < 30) {
						getBtnBack2().setFont(new Font("Tahoma", Font.PLAIN,
								18 + slResize_2.getValue()));
					}

					if (slResize_2.getValue() < 60) {
						getBtnContinue2().setFont(new Font("Tahoma", Font.PLAIN,
								18 + slResize_2.getValue()));
					}
					if (slResize_2.getValue() < 36) {
						getTxtCode().setFont(new Font("Tahoma", Font.PLAIN,
								16 + slResize_2.getValue()));
					}
				}
			});
			slResize_2.setValue(0);
			slResize_2.setMaximum(60);
		}
		return slResize_2;
	}

	private JPanel getPnNorth() {
		if (pnNorth == null) {
			pnNorth = new JPanel();
			pnNorth.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorth.add(getPnSizeLabel_3());
			pnNorth.add(getPnSizeSlider_3());
		}
		return pnNorth;
	}

	private JPanel getPnSizeLabel_3() {
		if (pnSizeLabel_3 == null) {
			pnSizeLabel_3 = new JPanel();
			pnSizeLabel_3.setLayout(new GridLayout(0, 1, 0, 0));
			pnSizeLabel_3.add(getLblTitle3());
		}
		return pnSizeLabel_3;
	}

	private JLabel getLblTitle3() {
		if (lblTitle3 == null) {
			lblTitle3 = new JLabel(
					"Do you feel lucky today? Try to open some boxes");
			lblTitle3.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle3.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblTitle3;
	}

	private JPanel getPnSizeSlider_3() {
		if (pnSizeSlider_3 == null) {
			pnSizeSlider_3 = new JPanel();
			pnSizeSlider_3.setLayout(new GridLayout(3, 1, 0, 0));
			pnSizeSlider_3.add(getPanel_193());
			pnSizeSlider_3.add(getSlResize_3());
		}
		return pnSizeSlider_3;
	}

	private JPanel getPanel_193() {
		if (panel_193 == null) {
			panel_193 = new JPanel();
		}
		return panel_193;
	}

	private JSlider getSlResize_3() {
		if (slResize_3 == null) {
			slResize_3 = new JSlider();
			slResize_3.setValue(0);
			slResize_3.setMaximum(60);
		}
		return slResize_3;
	}

	private JPanel getPnEast() {
		if (pnEast == null) {
			pnEast = new JPanel();
			pnEast.setLayout(new GridLayout(2, 2, 0, 0));
			pnEast.add(getBtnContinue3());
			pnEast.add(getBtnNewButton_1());
		}
		return pnEast;
	}

	private JButton getBtnContinue3() {
		if (btnContinue3 == null) {
			btnContinue3 = new JButton("CONTINUE");
			btnContinue3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (game.getRemainingPoints() == 0) {
						JOptionPane.showMessageDialog(rootPane, "You didn't get"
								+ " any points, hope you have better luck next "
								+ "time! The app will reset");
						close();
						reinitializate();
					} else {
						crd.next(getContentPane());
						setTitle("Redeem your Gifts : Gifts Panel");
					}
				}
			});
			btnContinue3.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnContinue3.setBackground(Color.GREEN);
			btnContinue3.setEnabled(false);
		}
		return btnContinue3;
	}

	private void close() {
		setVisible(false);
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("BACK");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					crd.previous(getContentPane());
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnNewButton_1.setBackground(Color.RED);
		}
		return btnNewButton_1;
	}

	private JPanel getPanel_20() {
		if (panel_20 == null) {
			panel_20 = new JPanel();
			panel_20.setLayout(new BorderLayout(0, 0));
			panel_20.add(getBtnHelp3(), BorderLayout.NORTH);
		}
		return panel_20;
	}

	private JButton getBtnHelp3() {
		if (btnHelp3 == null) {
			btnHelp3 = new JButton("IT'S YOUR FIRST TIME? CLICK HERE");
			btnHelp3.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return btnHelp3;
	}

	private JPanel getPnBoxes() {
		if (pnBoxes == null) {
			pnBoxes = new JPanel();
			pnBoxes.setLayout(new GridLayout(5, 5, 10, 10));
			createButtons();
		}
		return pnBoxes;
	}

	private void createButtons() {
		Random r = new Random();

		// Posible Prizes
		Integer[] possibleValues = { 1000, 250, 50, -1, -2 };

		// Counter for remaining prizes to add to the board
		Integer remain1000 = 1;
		Integer remain250 = 5;
		Integer remain50 = 8;
		Integer remainDouble = 1;
		Integer remainSpecial = 2;

		// Adding the prizes to the board
		for (int i = 1; i < 26; i++) {
			Integer pos = r.nextInt(possibleValues.length);
			if (pos == 0 && remain1000 > 0) {
				pnBoxes.add(createButton(i, possibleValues[0]));
				remain1000--;
			} else if (pos == 1 && remain250 > 0) {
				pnBoxes.add(createButton(i, possibleValues[1]));
				remain250--;
			} else if (pos == 2 && remain50 > 0) {
				pnBoxes.add(createButton(i, possibleValues[2]));
				remain50--;
			} else if (pos == 3 && remainDouble > 0) {
				pnBoxes.add(createButton(i, possibleValues[3]));
				remainDouble--;
			} else if (pos == 4 && remainSpecial > 0) {
				pnBoxes.add(createButton(i, possibleValues[4]));
				remainSpecial--;
			} else {
				pnBoxes.add(createButton(i, 0));
			}
		}
	}

	private JButton createButton(Integer i, Integer value) {
		JButton box;
		box = new JButton(String.valueOf(i));
		box.setActionCommand(String.valueOf(value));
		box.addActionListener(mbl);

		// Print the prize on each button of the board
		System.out.println(i + ": " + box.getActionCommand());

		box.setFont(new Font("Tahoma", Font.PLAIN, 18));
		return box;
	}

	class MyButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (game.getRemainingTrys() > 0) {
				game.addPoints(Integer.valueOf(e.getActionCommand()));
				((JButton) e.getSource()).setEnabled(false);
				getLblPointsCount()
						.setText(String.valueOf(game.getRemainingPoints()));
			}
			if (game.getRemainingTrys() == 0) {
				for (Component c : getPnBoxes().getComponents()) {
					c.setEnabled(false);
				}
				getBtnContinue3().setEnabled(true);
			}
		}
	}

	private JPanel getPnNorth_1() {
		if (pnNorth_1 == null) {
			pnNorth_1 = new JPanel();
			pnNorth_1.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorth_1.add(getPnSizeLabel_3_1());
			pnNorth_1.add(getPnSizeSlider_3_1());
		}
		return pnNorth_1;
	}

	private JPanel getPnSizeLabel_3_1() {
		if (pnSizeLabel_3_1 == null) {
			pnSizeLabel_3_1 = new JPanel();
			pnSizeLabel_3_1.setLayout(new GridLayout(0, 1, 0, 0));
			pnSizeLabel_3_1.add(getLblSelectYourGifts());
		}
		return pnSizeLabel_3_1;
	}

	private JLabel getLblSelectYourGifts() {
		if (lblSelectYourGifts == null) {
			lblSelectYourGifts = new JLabel("SELECT YOUR GIFTS!!!");
			lblSelectYourGifts.setHorizontalAlignment(SwingConstants.CENTER);
			lblSelectYourGifts.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblSelectYourGifts;
	}

	private JPanel getPnSizeSlider_3_1() {
		if (pnSizeSlider_3_1 == null) {
			pnSizeSlider_3_1 = new JPanel();
			pnSizeSlider_3_1.setLayout(new GridLayout(3, 1, 0, 0));
			pnSizeSlider_3_1.add(getPanel_193_1());
			pnSizeSlider_3_1.add(getSlResize_3_1());
		}
		return pnSizeSlider_3_1;
	}

	private JPanel getPanel_193_1() {
		if (panel_193_1 == null) {
			panel_193_1 = new JPanel();
		}
		return panel_193_1;
	}

	private JSlider getSlResize_3_1() {
		if (slResize_3_1 == null) {
			slResize_3_1 = new JSlider();
			slResize_3_1.setValue(0);
			slResize_3_1.setMaximum(60);
		}
		return slResize_3_1;
	}

	private JPanel getPanel_21() {
		if (panel_21 == null) {
			panel_21 = new JPanel();
			panel_21.setLayout(new BorderLayout(0, 0));
			panel_21.add(getPanel_22(), BorderLayout.NORTH);
			panel_21.add(getPanel_23(), BorderLayout.CENTER);
		}
		return panel_21;
	}

	private JPanel getPanel_22() {
		if (panel_22 == null) {
			panel_22 = new JPanel();
			panel_22.setLayout(new GridLayout(2, 0, 0, 0));
			panel_22.add(getPanel_26());
			panel_22.add(getPanel_25());
		}
		return panel_22;
	}

	private JPanel getPanel_23() {
		if (panel_23 == null) {
			panel_23 = new JPanel();
			panel_23.setLayout(new GridLayout(0, 3, 0, 0));
			panel_23.add(getScrollPane());
			panel_23.add(getPanel_28());
			panel_23.add(getBtnContinue4());
		}
		return panel_23;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_6());
		}
		return scrollPane;
	}

	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			list.setModel(dlmGifts);
		}
		return list;
	}

	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
		}
		return lblImage;
	}

	private JButton getBtnContinue4() {
		if (btnContinue4 == null) {
			btnContinue4 = new JButton("CONTINUE");
			btnContinue4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		}
		return btnContinue4;
	}

	private JPanel getPanel_24() {
		if (panel_24 == null) {
			panel_24 = new JPanel();
			panel_24.add(getLblNewLabel_1());
			panel_24.add(getCbCategory());
			panel_24.add(getLblNewLabel_2());
			panel_24.add(getCbOrder());
			panel_24.add(getTxtSearch());
		}
		return panel_24;
	}

	private JPanel getPanel_25() {
		if (panel_25 == null) {
			panel_25 = new JPanel();
			panel_25.add(getLblNewLabel_5());
			panel_25.add(getCbGifts());
			panel_25.add(getBtnAdd4());
			panel_25.add(getBtnRemove4());
		}
		return panel_25;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Category:");
		}
		return lblNewLabel_1;
	}

	private JComboBox getCbCategory() {
		if (cbCategory == null) {
			cbCategory = new JComboBox();
			cbCategory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					switch ((String) getCbCategory().getSelectedItem()) {
					case "All":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							dcbgiftm.addElement(g);
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					case "Food":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							if (g.getSection().equals("F")) {
								dcbgiftm.addElement(g);
							}
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					case "Sports":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							if (g.getSection().equals("S")) {
								dcbgiftm.addElement(g);
							}
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					case "Electronics":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							if (g.getSection().equals("E")) {
								dcbgiftm.addElement(g);
							}
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					case "Toys":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							if (g.getSection().equals("T")) {
								dcbgiftm.addElement(g);
							}
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					case "Travel and Experiences":
						dcbgiftm = new DefaultComboBoxModel();
						dcbgiftm.addElement("Select A Gift...");
						for (Gift g : gf.getGifts()) {
							if (g.getSection().equals("V")) {
								dcbgiftm.addElement(g);
							}
						}
						getCbGifts().setModel(dcbgiftm);
						getBtnAdd4().setEnabled(false);
						break;
					}
				}
			});
			cbCategory.setModel(new DefaultComboBoxModel(
					new String[] { "All", "Food", "Sports", "Electronics",
							"Toys", "Travel and Experiences" }));
		}
		return cbCategory;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Order:");
		}
		return lblNewLabel_2;
	}

	private JComboBox getCbOrder() {
		if (cbOrder == null) {
			cbOrder = new JComboBox();
			cbOrder.setModel(new DefaultComboBoxModel(
					new String[] { "Ordered by...", "Points" }));
		}
		return cbOrder;
	}

	private JTextField getTxtSearch() {
		if (txtSearch == null) {
			txtSearch = new JTextField();
			txtSearch.setText("Search...");
			txtSearch.setColumns(10);
		}
		return txtSearch;
	}

	private JPanel getPanel_26() {
		if (panel_26 == null) {
			panel_26 = new JPanel();
			panel_26.setLayout(new GridLayout(0, 2, 0, 0));
			panel_26.add(getPanel_27());
			panel_26.add(getPanel_24());
		}
		return panel_26;
	}

	private JPanel getPanel_27() {
		if (panel_27 == null) {
			panel_27 = new JPanel();
			panel_27.add(getLblRemainingPoints());
			panel_27.add(getLblPointsCount());
		}
		return panel_27;
	}

	private JLabel getLblRemainingPoints() {
		if (lblRemainingPoints == null) {
			lblRemainingPoints = new JLabel("Remaining Points:");
		}
		return lblRemainingPoints;
	}

	private JLabel getLblPointsCount() {
		if (lblPointsCount == null) {
			lblPointsCount = new JLabel(
					String.valueOf(game.getRemainingPoints()));
		}
		return lblPointsCount;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Gifts:");
		}
		return lblNewLabel_5;
	}

	private void adaptImage(JLabel label, String imagePath) {
		ImageIcon tmpImagen = new ImageIcon(getClass().getResource(imagePath));
		float delta = ((label.getWidth() * 100) / tmpImagen.getIconWidth())
				/ 100f;
		if (tmpImagen.getIconHeight() > label.getHeight())
			delta = ((label.getHeight() * 100) / tmpImagen.getIconHeight())
					/ 100f;
		int ancho = (int) (tmpImagen.getIconWidth() * delta);
		int alto = (int) (tmpImagen.getIconHeight() * delta);
		label.setIcon(new ImageIcon(tmpImagen.getImage()
				.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
	}

	private JComboBox getCbGifts() {
		if (cbGifts == null) {
			cbGifts = new JComboBox();
			cbGifts.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (getCbGifts().getSelectedItem()
							.equals("Select A Gift...")) {
						getBtnAdd4().setEnabled(false);
						adaptImage(getLblImage(), "/img/gift.png");
					} else {
						getBtnAdd4().setEnabled(true);
						String code = ((Gift) getCbGifts().getSelectedItem())
								.getCode();
						adaptImage(getLblImage(), "/img/" + code + ".png");
					}
				}
			});
			this.dcbgiftm.addElement("Select A Gift...");
			for (Gift g : gf.getGifts()) {
				dcbgiftm.addElement(g);
			}
			cbGifts.setModel(dcbgiftm);
		}
		return cbGifts;
	}

	private JButton getBtnAdd4() {
		if (btnAdd4 == null) {
			btnAdd4 = new JButton("ADD");
			btnAdd4.setEnabled(false);
			btnAdd4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Gift g = (Gift) getCbGifts().getSelectedItem();

					if (game.getRemainingPoints() - g.getPoints() >= 0) {
						dlmGifts.addElement(g);
						game.setRemainingPoints(
								game.getRemainingPoints() - g.getPoints());
						getLblPointsCount().setText(
								String.valueOf(game.getRemainingPoints()));
					} else {
						JOptionPane.showMessageDialog(rootPane, "You don't have"
								+ " enought points to claim this item");
					}
				}
			});
		}
		return btnAdd4;
	}

	private JButton getBtnRemove4() {
		if (btnRemove4 == null) {
			btnRemove4 = new JButton("REMOVE");
			btnRemove4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (getList().getSelectedValue() != null) {
						Gift g = (Gift) getList().getSelectedValue();
						dlmGifts.remove(getList().getSelectedIndex());
						game.setRemainingPoints(
								game.getRemainingPoints() + g.getPoints());
						getLblPointsCount().setText(
								String.valueOf(game.getRemainingPoints()));
					} else {
						JOptionPane.showMessageDialog(rootPane, "Please select "
								+ "an item from the list to remove it");
					}
				}
			});
		}
		return btnRemove4;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Redeemed gifts:");
		}
		return lblNewLabel_6;
	}

	private JPanel getPanel_28() {
		if (panel_28 == null) {
			panel_28 = new JPanel();
			panel_28.setLayout(new BorderLayout(0, 0));
			panel_28.add(getLblImage());
			panel_28.add(getPnNorth4(), BorderLayout.NORTH);
			panel_28.add(getPnSouth4(), BorderLayout.SOUTH);
			panel_28.add(getPnWest4(), BorderLayout.WEST);
			panel_28.add(getPnEast4(), BorderLayout.EAST);
		}
		return panel_28;
	}

	private JPanel getPnNorth4() {
		if (pnNorth4 == null) {
			pnNorth4 = new JPanel();
		}
		return pnNorth4;
	}

	private JPanel getPnSouth4() {
		if (pnSouth4 == null) {
			pnSouth4 = new JPanel();
		}
		return pnSouth4;
	}

	private JPanel getPnWest4() {
		if (pnWest4 == null) {
			pnWest4 = new JPanel();
		}
		return pnWest4;
	}

	private JPanel getPnEast4() {
		if (pnEast4 == null) {
			pnEast4 = new JPanel();
		}
		return pnEast4;
	}
}
