package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.help.HelpBroker;
import javax.help.HelpSet;
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
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JCalendar;

import logic.Clients;
import logic.Game;
import logic.Gift;
import logic.Gifts;
import logic.Main;
import logic.Person;
import logic.Travel;
import logic.Travels;
import logic.comparators.ByPointsComparator;
import logic.comparators.BySecctionComparator;
import logic.util.FileUtil;

import javax.swing.JTextArea;

@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
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
	private JPanel pnMainContent2;
	private JPanel pnHeader2;
	private JPanel pnCenter2;
	private JPanel pnBottom2;
	private JPanel pnNorthSize;
	private JPanel pnNorthGapSize;
	private JPanel pnWestGapSize;
	private JPanel pnEastGapSize;
	private JPanel pnCodeIntroduction2;
	private JPanel pnTextAreaCode2;
	private JPanel pnWestGapCode2;
	private JPanel pnEastGapCode2;
	private JPanel pnBack2;
	private JPanel pnBackButton2;
	private JPanel pnSouthGapBack2;
	private JPanel pnNorthGapBack2;
	private JPanel pnTitle_Size2;
	private JPanel pnSize2;
	private JPanel pnSizeLabel_2;

	private JLabel lblChangeSize_2;

	private JPanel pnSizeSlider_2;
	private JPanel pnNorthGapSizeSlider;
	private JPanel pnNorth3;
	private JPanel pnSizeLabel_3;
	private JPanel pnSizeSlider_3;
	private JPanel pnNorthGapSizeSlider3;

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
	private JPanel pnEast3;
	private JButton btnContinue3;
	private JButton btnBack3;
	private JPanel pnSouth3;
	private JButton btnHelp3;
	private JPanel pnBoxes;
	private JPanel pnNorth4;
	private JPanel pnSizeLabel_4;
	private JLabel lblSelectYourGifts4;
	private JPanel pnSizeSlider_4;
	private JPanel panel_193_1;
	private JSlider slResize_4;
	private JPanel pnCenter4;
	private JPanel pnImportantInfo4;
	private JPanel pnLists4;
	private JScrollPane sPnRedeemedGifts4;
	private JList RedeemedGiftList;
	private JLabel lblImage;
	private JButton btnContinue4;
	private JPanel pnFilters4;
	private JPanel pnComboGifts4;
	private JLabel lblCategory4;
	private JComboBox cbCategory;
	private JLabel lblOrder4;
	private JComboBox cbOrder;
	private JTextField txtSearch;
	private JPanel pnFiltersPoints4;
	private JPanel pnPoints4;
	private JLabel lblRemainingPoints4;
	private JLabel lblPointsCount;
	private JLabel lblGifts;
	private JComboBox cbGifts;
	private JButton btnAdd4;
	private JButton btnRemove4;
	private JLabel lblRedeemedGifts4;

	// LOGIC CLASSES
	private Game game = new Game(0, 3);
	private Clients cli = new Clients();
	private Gifts gf = new Gifts();
	private Travels travels = new Travels();
	private LocalDateTime ldt = LocalDateTime.now();

	private DefaultComboBoxModel dcbgiftm = new DefaultComboBoxModel();
	private DefaultListModel dlmGifts = new DefaultListModel();
	private MyButtonListener mbl = new MyButtonListener();
	private DefaultComboBoxModel<Travel> dcbTravelmodel = new DefaultComboBoxModel<Travel>();

	private JPanel pnGiftImage4;
	private JPanel pnNorthImage4;
	private JPanel pnSouthImage4;
	private JPanel pnWestImage4;
	private JPanel pnEastImage4;
	private JPanel pnFinish;
	private JLabel lblTitle6;
	private JLabel lblNewLabel;
	private JButton btnExit6;
	private JCalendar travelCalendar;
	private JPanel pnNorth5;
	private JLabel lblTitle5;
	private JPanel pnCbTravels5;
	private JComboBox cbRedeemedTravels;
	private JLabel lblSelectTravel;
	private JPanel pnCalendar;
	private JPanel pnSouth5;
	private JButton btnBack5;
	private JButton btnContinue5;
	private JButton btnAssignDate5;
	private JPanel pnObservations5;
	private JTextArea txtObservations;
	private JLabel lblObservations;

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
		contentPane.add(getPnFinish(), "pn6");
		loadHelp();
	}

	private void reinitializate() {
		Main.main(null);
	}

	private void loadHelp() {

		URL hsURL;
		HelpSet hs;

		try {
			File fichero = new File("help/Help.hs");
			hsURL = fichero.toURI().toURL();
			hs = new HelpSet(null, hsURL);
		}

		catch (Exception e) {
			System.out.println("Help not found!");
			return;
		}

		HelpBroker hb = hs.createHelpBroker();

		hb.enableHelpKey(getRootPane(), "intro", hs);
		hb.enableHelpOnButton(getBtnHelp3(), "howtoplay", hs);
		hb.enableHelpOnButton(getBtnHelp(), "intro", hs);
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
			pnNorthGap.add(getPnNorthSize());
		}
		return pnNorthGap;
	}

	private JPanel getPnLoyaltyCode() {
		if (pnLoyaltyCode == null) {
			pnLoyaltyCode = new JPanel();
			pnLoyaltyCode.setLayout(new BorderLayout(0, 0));
			pnLoyaltyCode.add(getPnMainContent2(), BorderLayout.CENTER);
		}
		return pnLoyaltyCode;
	}

	private JPanel getPnGiftsBoard() {
		if (pnGiftsBoard == null) {
			pnGiftsBoard = new JPanel();
			pnGiftsBoard.setLayout(new BorderLayout(0, 0));
			pnGiftsBoard.add(getPnNorth3(), BorderLayout.NORTH);
			pnGiftsBoard.add(getPnEast3(), BorderLayout.EAST);
			pnGiftsBoard.add(getPnSouth3(), BorderLayout.SOUTH);
			pnGiftsBoard.add(getPnBoxes3(), BorderLayout.CENTER);

		}
		return pnGiftsBoard;
	}

	private JPanel getPnSelectYourGifts() {
		if (pnSelectYourGifts == null) {
			pnSelectYourGifts = new JPanel();
			pnSelectYourGifts.setLayout(new BorderLayout(0, 0));
			pnSelectYourGifts.add(getPnNorth4(), BorderLayout.NORTH);
			pnSelectYourGifts.add(getPnCenter4(), BorderLayout.CENTER);
		}
		return pnSelectYourGifts;
	}

	private JPanel getPnTravelSelect() {
		if (pnTravelSelect == null) {
			pnTravelSelect = new JPanel();
			pnTravelSelect.setLayout(new BorderLayout(0, 0));
			pnTravelSelect.add(getPnNorth5(), BorderLayout.NORTH);
			pnTravelSelect.add(getPnCalendar(), BorderLayout.CENTER);
			pnTravelSelect.add(getPnSouth5(), BorderLayout.SOUTH);
		}
		return pnTravelSelect;
	}

	private JCalendar getTravelCalendar() {
		if (travelCalendar == null) {
			travelCalendar = new JCalendar();
		}
		return travelCalendar;
	}

	private JPanel getPnMainContent2() {
		if (pnMainContent2 == null) {
			pnMainContent2 = new JPanel();
			pnMainContent2.setLayout(new GridLayout(3, 1, 0, 0));
			pnMainContent2.add(getPnHeader2());
			pnMainContent2.add(getPnCenter2());
			pnMainContent2.add(getPnBottom2());
		}
		return pnMainContent2;
	}

	private JPanel getPnHeader2() {
		if (pnHeader2 == null) {
			pnHeader2 = new JPanel();
			pnHeader2.setLayout(new GridLayout(2, 0, 0, 0));
			pnHeader2.add(getPnTitle_Size2());
			pnHeader2.add(getLblSubtitleLoyalty());
		}
		return pnHeader2;
	}

	private JPanel getPnCenter2() {
		if (pnCenter2 == null) {
			pnCenter2 = new JPanel();
			pnCenter2.setLayout(new GridLayout(2, 0, 0, 0));
			pnCenter2.add(getLblIntroduceCode());
			pnCenter2.add(getPanel_7_1());
		}
		return pnCenter2;
	}

	private JPanel getPnBottom2() {
		if (pnBottom2 == null) {
			pnBottom2 = new JPanel();
			pnBottom2.setLayout(new GridLayout(2, 0, 0, 0));
			pnBottom2.add(getBtnContinue2());
			pnBottom2.add(getPnBack2());
		}
		return pnBottom2;
	}

	private JPanel getPnNorthSize() {
		if (pnNorthSize == null) {
			pnNorthSize = new JPanel();
			pnNorthSize.setLayout(new BorderLayout(0, 0));
			pnNorthSize.add(getPnSize());
			pnNorthSize.add(getPnNorthGapSize(), BorderLayout.NORTH);
			pnNorthSize.add(getPnWestGapSize(), BorderLayout.WEST);
			pnNorthSize.add(getPnEastGapSize(), BorderLayout.EAST);
		}
		return pnNorthSize;
	}

	private JPanel getPnNorthGapSize() {
		if (pnNorthGapSize == null) {
			pnNorthGapSize = new JPanel();
		}
		return pnNorthGapSize;
	}

	private JPanel getPnWestGapSize() {
		if (pnWestGapSize == null) {
			pnWestGapSize = new JPanel();
		}
		return pnWestGapSize;
	}

	private JPanel getPnEastGapSize() {
		if (pnEastGapSize == null) {
			pnEastGapSize = new JPanel();
		}
		return pnEastGapSize;
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
		if (pnCodeIntroduction2 == null) {
			pnCodeIntroduction2 = new JPanel();
			pnCodeIntroduction2.setLayout(new GridLayout(2, 1, 0, 0));
			pnCodeIntroduction2.add(getPnTextAreaCode2());
		}
		return pnCodeIntroduction2;
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
						game.setClientLogged(getTxtCode().getText());
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

	private JPanel getPnTextAreaCode2() {
		if (pnTextAreaCode2 == null) {
			pnTextAreaCode2 = new JPanel();
			pnTextAreaCode2.setLayout(new BorderLayout(0, 0));
			pnTextAreaCode2.add(getTxtCode());
			pnTextAreaCode2.add(getPnWestGapCode2(), BorderLayout.WEST);
			pnTextAreaCode2.add(getPnEastGapCode2(), BorderLayout.EAST);
		}
		return pnTextAreaCode2;
	}

	private JPanel getPnWestGapCode2() {
		if (pnWestGapCode2 == null) {
			pnWestGapCode2 = new JPanel();
		}
		return pnWestGapCode2;
	}

	private JPanel getPnEastGapCode2() {
		if (pnEastGapCode2 == null) {
			pnEastGapCode2 = new JPanel();
		}
		return pnEastGapCode2;
	}

	private JPanel getPnBack2() {
		if (pnBack2 == null) {
			pnBack2 = new JPanel();
			pnBack2.setLayout(new GridLayout(2, 3, 0, 0));
			pnBack2.add(getPnNorthGapBack2());
			pnBack2.add(getPnBackButton2());
		}
		return pnBack2;
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

	private JPanel getPnBackButton2() {
		if (pnBackButton2 == null) {
			pnBackButton2 = new JPanel();
			pnBackButton2.setLayout(new BorderLayout(0, 0));
			pnBackButton2.add(getBtnBack2());
			pnBackButton2.add(getPnSouthGapBack2(), BorderLayout.SOUTH);
		}
		return pnBackButton2;
	}

	private JPanel getPnSouthGapBack2() {
		if (pnSouthGapBack2 == null) {
			pnSouthGapBack2 = new JPanel();
		}
		return pnSouthGapBack2;
	}

	private JPanel getPnNorthGapBack2() {
		if (pnNorthGapBack2 == null) {
			pnNorthGapBack2 = new JPanel();
			pnNorthGapBack2.setLayout(new GridLayout(1, 0, 0, 0));
		}
		return pnNorthGapBack2;
	}

	private JPanel getPnTitle_Size2() {
		if (pnTitle_Size2 == null) {
			pnTitle_Size2 = new JPanel();
			pnTitle_Size2.setLayout(new GridLayout(2, 1, 0, 0));
			pnTitle_Size2.add(getPnSize2());
			pnTitle_Size2.add(getLblTitleLoyalty());
		}
		return pnTitle_Size2;
	}

	private JPanel getPnSize2() {
		if (pnSize2 == null) {
			pnSize2 = new JPanel();
			pnSize2.setLayout(new GridLayout(0, 2, 0, 0));
			pnSize2.add(getPnSizeLabel_2());
			pnSize2.add(getPnSizeSlider_2());
		}
		return pnSize2;
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
			pnSizeSlider_2.add(getPnNorthGapSizeSlider());
			pnSizeSlider_2.add(getSlResize_2());
		}
		return pnSizeSlider_2;
	}

	private JPanel getPnNorthGapSizeSlider() {
		if (pnNorthGapSizeSlider == null) {
			pnNorthGapSizeSlider = new JPanel();
		}
		return pnNorthGapSizeSlider;
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

	private JPanel getPnNorth3() {
		if (pnNorth3 == null) {
			pnNorth3 = new JPanel();
			pnNorth3.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorth3.add(getPnSizeLabel_3());
			pnNorth3.add(getPnSizeSlider_3());
		}
		return pnNorth3;
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
			pnSizeSlider_3.add(getPnNorthGapSizeSlider3());
			pnSizeSlider_3.add(getSlResize_3());
		}
		return pnSizeSlider_3;
	}

	private JPanel getPnNorthGapSizeSlider3() {
		if (pnNorthGapSizeSlider3 == null) {
			pnNorthGapSizeSlider3 = new JPanel();
		}
		return pnNorthGapSizeSlider3;
	}

	private JSlider getSlResize_3() {
		if (slResize_3 == null) {
			slResize_3 = new JSlider();
			slResize_3.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					if (slResize_3.getValue() < 2) {
						getLblTitle3().setFont(new Font("Tahoma", Font.BOLD,
								20 + slResize_3.getValue()));
					}
					if (slResize_3.getValue() < 25) {
						getBtnContinue3().setFont(new Font("Tahoma", Font.BOLD,
								20 + slResize_3.getValue()));
					}
					if (slResize_3.getValue() < 40) {
						getBtnBack3().setFont(new Font("Tahoma", Font.PLAIN,
								18 + slResize_3.getValue()));
					}
					if (slResize_3.getValue() < 34) {
						getBtnHelp3().setFont(new Font("Tahoma", Font.BOLD,
								20 + slResize_3.getValue()));
					}
				}
			});
			slResize_3.setValue(0);
			slResize_3.setMaximum(40);
		}
		return slResize_3;
	}

	private JPanel getPnEast3() {
		if (pnEast3 == null) {
			pnEast3 = new JPanel();
			pnEast3.setLayout(new GridLayout(2, 2, 0, 0));
			pnEast3.add(getBtnContinue3());
			pnEast3.add(getBtnBack3());
		}
		return pnEast3;
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
						adaptImage(getLblImage(), "/img/gift.png");
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

	private JButton getBtnBack3() {
		if (btnBack3 == null) {
			btnBack3 = new JButton("BACK");
			btnBack3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					crd.previous(getContentPane());
				}
			});
			btnBack3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnBack3.setBackground(Color.RED);
		}
		return btnBack3;
	}

	private JPanel getPnSouth3() {
		if (pnSouth3 == null) {
			pnSouth3 = new JPanel();
			pnSouth3.setLayout(new BorderLayout(0, 0));
			pnSouth3.add(getBtnHelp3(), BorderLayout.NORTH);
		}
		return pnSouth3;
	}

	private JButton getBtnHelp3() {
		if (btnHelp3 == null) {
			btnHelp3 = new JButton("IT'S YOUR FIRST TIME? CLICK HERE");
			btnHelp3.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return btnHelp3;
	}

	private JPanel getPnBoxes3() {
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
		Integer[] possibleValues = { 1000, 250, 50, -1, -2, 0 };

		// Counter for remaining prizes to add to the board
		Integer remain1000 = 1;
		Integer remain250 = 5;
		Integer remain50 = 8;
		Integer remainDouble = 1;
		Integer remainSpecial = 2;
		Integer remainNothing = 8;

		// Adding the prizes to the board
		for (int i = 1; i < 26; i++) {
			Integer pos = r.nextInt(possibleValues.length);
			if (pos == 0) {
				if (remain1000 > 0) {
					pnBoxes.add(createButton(i, possibleValues[0]));
					remain1000--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
			} else if (pos == 1) {
				if (remain250 > 0) {
					pnBoxes.add(createButton(i, possibleValues[1]));
					remain250--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
			} else if (pos == 2) {
				if (remain50 > 0) {
					pnBoxes.add(createButton(i, possibleValues[2]));
					remain50--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
			} else if (pos == 3) {
				if (remainDouble > 0) {
					pnBoxes.add(createButton(i, possibleValues[3]));
					remainDouble--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
			} else if (pos == 4) {
				if (remainSpecial > 0) {
					pnBoxes.add(createButton(i, possibleValues[4]));
					remainSpecial--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
			} else if (pos == 5) {
				if (remainNothing > 0) {
					pnBoxes.add(createButton(i, possibleValues[5]));
					remainNothing--;
				} else {
					if (remain250 > 0) {
						pnBoxes.add(createButton(i, possibleValues[1]));
						remain250--;
					} else if (remain50 > 0) {
						pnBoxes.add(createButton(i, possibleValues[2]));
						remain50--;
					} else if (remainDouble > 0) {
						pnBoxes.add(createButton(i, possibleValues[3]));
						remainDouble--;
					} else if (remainSpecial > 0) {
						pnBoxes.add(createButton(i, possibleValues[4]));
						remainSpecial--;
					} else {
						pnBoxes.add(createButton(i, possibleValues[5]));
					}
				}
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
				for (Component c : getPnBoxes3().getComponents()) {
					c.setEnabled(false);
				}
				getBtnContinue3().setEnabled(true);
			}
		}
	}

	private JPanel getPnNorth4() {
		if (pnNorth4 == null) {
			pnNorth4 = new JPanel();
			pnNorth4.setLayout(new GridLayout(0, 2, 0, 0));
			pnNorth4.add(getPnSizeLabel_4());
			pnNorth4.add(getPnSizeSlider_4());
		}
		return pnNorth4;
	}

	private JPanel getPnSizeLabel_4() {
		if (pnSizeLabel_4 == null) {
			pnSizeLabel_4 = new JPanel();
			pnSizeLabel_4.setLayout(new GridLayout(0, 1, 0, 0));
			pnSizeLabel_4.add(getLblSelectYourGifts4());
		}
		return pnSizeLabel_4;
	}

	private JLabel getLblSelectYourGifts4() {
		if (lblSelectYourGifts4 == null) {
			lblSelectYourGifts4 = new JLabel("SELECT YOUR GIFTS!!!");
			lblSelectYourGifts4.setHorizontalAlignment(SwingConstants.CENTER);
			lblSelectYourGifts4.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblSelectYourGifts4;
	}

	private JPanel getPnSizeSlider_4() {
		if (pnSizeSlider_4 == null) {
			pnSizeSlider_4 = new JPanel();
			pnSizeSlider_4.setLayout(new GridLayout(3, 1, 0, 0));
			pnSizeSlider_4.add(getPanel_193_1());
			pnSizeSlider_4.add(getSlResize_4());
		}
		return pnSizeSlider_4;
	}

	private JPanel getPanel_193_1() {
		if (panel_193_1 == null) {
			panel_193_1 = new JPanel();
		}
		return panel_193_1;
	}

	private JSlider getSlResize_4() {
		if (slResize_4 == null) {
			slResize_4 = new JSlider();
			slResize_4.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {

					if (slResize_4.getValue() < 25) {
						getLblSelectYourGifts4().setFont(new Font("Tahoma",
								Font.BOLD, 20 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 42) {
						getLblRemainingPoints4().setFont(new Font("Tahoma",
								Font.PLAIN, 11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 42) {
						getLblPointsCount().setFont(new Font("Tahoma",
								Font.PLAIN, 11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 37) {
						getLblRedeemedGifts4().setFont(new Font("Tahoma",
								Font.PLAIN, 11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 25) {
						getLblGifts().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 25) {
						getBtnAdd4().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 25) {
						getBtnRemove4().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 17) {
						getLblCategory4().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 17) {
						getLblOrder4().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 54) {
						getBtnContinue4().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 17) {
						getCbCategory().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 17) {
						getCbOrder().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 17) {
						getTxtSearch().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
					if (slResize_4.getValue() < 25) {
						getCbGifts().setFont(new Font("Tahoma", Font.PLAIN,
								11 + slResize_4.getValue()));
					}
				}
			});
			slResize_4.setValue(0);
			slResize_4.setMaximum(53);
		}
		return slResize_4;
	}

	private JPanel getPnCenter4() {
		if (pnCenter4 == null) {
			pnCenter4 = new JPanel();
			pnCenter4.setLayout(new BorderLayout(0, 0));
			pnCenter4.add(getPnImportantInfo4(), BorderLayout.NORTH);
			pnCenter4.add(getPnLists4(), BorderLayout.CENTER);
		}
		return pnCenter4;
	}

	private JPanel getPnImportantInfo4() {
		if (pnImportantInfo4 == null) {
			pnImportantInfo4 = new JPanel();
			pnImportantInfo4.setLayout(new GridLayout(2, 0, 0, 0));
			pnImportantInfo4.add(getPnFiltersPoints4());
			pnImportantInfo4.add(getPnComboGifts4());
		}
		return pnImportantInfo4;
	}

	private JPanel getPnLists4() {
		if (pnLists4 == null) {
			pnLists4 = new JPanel();
			pnLists4.setLayout(new GridLayout(0, 3, 0, 0));
			pnLists4.add(getSPnRedeemedGifts4());
			pnLists4.add(getPnGiftImage4());
			pnLists4.add(getBtnContinue4());
		}
		return pnLists4;
	}

	private JScrollPane getSPnRedeemedGifts4() {
		if (sPnRedeemedGifts4 == null) {
			sPnRedeemedGifts4 = new JScrollPane();
			sPnRedeemedGifts4.setViewportView(getRedeemedGiftList());
			sPnRedeemedGifts4.setColumnHeaderView(getLblRedeemedGifts4());
		}
		return sPnRedeemedGifts4;
	}

	private JList getRedeemedGiftList() {
		if (RedeemedGiftList == null) {
			RedeemedGiftList = new JList();
			RedeemedGiftList
					.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			RedeemedGiftList.setModel(dlmGifts);
		}
		return RedeemedGiftList;
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
			btnContinue4.setBackground(Color.GREEN);
			btnContinue4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// You didn't spend all the points
					if (game.getRemainingPoints() > 0) {
						switch (JOptionPane.showConfirmDialog(rootPane,
								"You didn't expend all your POINTS, the "
										+ "remaining points will be lost "
										+ "forever.\n "
										+ "You really want to continue?")) {
						case 0:
							ListModel<Gift> d = getRedeemedGiftList()
									.getModel();
							if (dcbTravelmodel.getSize() != 0) {
								travels.setTravels(new ArrayList<Travel>());
								dcbTravelmodel.removeAllElements();
							}
							for (int i = 0; i < d.getSize(); i++) {
								if (d.getElementAt(i).getSection()
										.equals("V")) {
									Travel t = new Travel(
											d.getElementAt(i).getName(),
											d.getElementAt(i).getCode(),
											ldt.getDayOfMonth(),
											ldt.getMonthValue(),
											Year.MIN_VALUE + ldt.getYear(), "");
									travels.add(t);
								} else {
									game.addRedeemedGift((d.getElementAt(i)));
								}
							}
							if (travels.getTravels().size() == 0) {
								FileUtil.saveToFile("deliveries",
										game.getClientLogged(),
										game.getRedeemedGifts(),
										travels.getTravels());
								crd.show(getContentPane(), "pn6");
							} else {
								for (Travel t : travels.getTravels()) {
									dcbTravelmodel.addElement(t);
								}
								cbRedeemedTravels.setModel(dcbTravelmodel);
								crd.show(getContentPane(), "pn5");
							}
							break;
						}
					} else { // You spend all your points
						ListModel<Gift> d = getRedeemedGiftList().getModel();
						if (dcbTravelmodel.getSize() != 0) {
							travels.setTravels(new ArrayList<Travel>());
							dcbTravelmodel.removeAllElements();
						}
						for (int i = 0; i < d.getSize(); i++) {
							if (d.getElementAt(i).getSection().equals("V")) {
								Travel t = new Travel(
										d.getElementAt(i).getName(),
										d.getElementAt(i).getCode(),
										ldt.getDayOfMonth(),
										ldt.getMonthValue(),
										Year.MIN_VALUE + ldt.getYear(), "");
								travels.add(t);
							} else {
								game.addRedeemedGift((d.getElementAt(i)));
							}
						}
						// No travels selected
						if (travels.getTravels().size() == 0) {
							FileUtil.saveToFile("deliveries",
									game.getClientLogged(),
									game.getRedeemedGifts(),
									travels.getTravels());
							crd.show(getContentPane(), "pn6");
						} else { // One or more travels selected
							for (Travel t : travels.getTravels()) {
								dcbTravelmodel.addElement(t);
							}
							cbRedeemedTravels.setModel(dcbTravelmodel);
							crd.show(getContentPane(), "pn5");
						}
					}
				}
			});
		}
		return btnContinue4;
	}

	private JPanel getPnFilters4() {
		if (pnFilters4 == null) {
			pnFilters4 = new JPanel();
			pnFilters4.add(getLblCategory4());
			pnFilters4.add(getCbCategory());
			pnFilters4.add(getLblOrder4());
			pnFilters4.add(getCbOrder());
			pnFilters4.add(getTxtSearch());
		}
		return pnFilters4;
	}

	private JPanel getPnComboGifts4() {
		if (pnComboGifts4 == null) {
			pnComboGifts4 = new JPanel();
			pnComboGifts4.add(getLblGifts());
			pnComboGifts4.add(getCbGifts());
			pnComboGifts4.add(getBtnAdd4());
			pnComboGifts4.add(getBtnRemove4());
		}
		return pnComboGifts4;
	}

	private JLabel getLblCategory4() {
		if (lblCategory4 == null) {
			lblCategory4 = new JLabel("Category:");
		}
		return lblCategory4;
	}

	private JComboBox getCbCategory() {
		if (cbCategory == null) {
			cbCategory = new JComboBox();
			cbCategory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getCbOrder().setSelectedIndex(0);
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

	private JLabel getLblOrder4() {
		if (lblOrder4 == null) {
			lblOrder4 = new JLabel("Order:");
		}
		return lblOrder4;
	}

	private JComboBox getCbOrder() {
		if (cbOrder == null) {
			cbOrder = new JComboBox();
			cbOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Initializate all necessary fields
					List<Gift> aux = new ArrayList<Gift>();
					List<Gift> auxStr = new ArrayList<Gift>();

					for (int i = 1; i < dcbgiftm.getSize(); i++) {
						auxStr.add((Gift) dcbgiftm.getElementAt(i));
					}

					for (Gift elem : auxStr) {
						for (Gift gift : gf.getGifts()) {
							if (gift.getName().equals(elem.getName())) {
								aux.add(gift);
							}
						}
					}

					// Order cb by Points
					if (getCbOrder().getSelectedItem() == "Points") {
						Collections.sort(aux, new ByPointsComparator());
					} else if (getCbOrder().getSelectedItem() == "Section") {
						Collections.sort(aux, new BySecctionComparator());
					}
					// Change the actual model of the cbs
					dcbgiftm.removeAllElements();
					dcbgiftm.addElement("Select A Gift...");
					for (Gift gift : aux) {
						dcbgiftm.addElement(gift);
					}
				}
			});
			cbOrder.setModel(new DefaultComboBoxModel(
					new String[] { "Ordered by...", "Points", "Section" }));
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

	private JPanel getPnFiltersPoints4() {
		if (pnFiltersPoints4 == null) {
			pnFiltersPoints4 = new JPanel();
			pnFiltersPoints4.setLayout(new GridLayout(0, 2, 0, 0));
			pnFiltersPoints4.add(getPnPoints4());
			pnFiltersPoints4.add(getPnFilters4());
		}
		return pnFiltersPoints4;
	}

	private JPanel getPnPoints4() {
		if (pnPoints4 == null) {
			pnPoints4 = new JPanel();
			pnPoints4.add(getLblRemainingPoints4());
			pnPoints4.add(getLblPointsCount());
		}
		return pnPoints4;
	}

	private JLabel getLblRemainingPoints4() {
		if (lblRemainingPoints4 == null) {
			lblRemainingPoints4 = new JLabel("Remaining Points:");
		}
		return lblRemainingPoints4;
	}

	private JLabel getLblPointsCount() {
		if (lblPointsCount == null) {
			lblPointsCount = new JLabel(
					String.valueOf(game.getRemainingPoints()));
		}
		return lblPointsCount;
	}

	private JLabel getLblGifts() {
		if (lblGifts == null) {
			lblGifts = new JLabel("Gifts:");
		}
		return lblGifts;
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
					try {
						if (!getCbGifts().getSelectedItem()
								.equals("Select A Gift...")) {
							getBtnAdd4().setEnabled(true);
							String code = ((Gift) getCbGifts()
									.getSelectedItem()).getCode();
							adaptImage(getLblImage(), "/img/" + code + ".png");
						} else {
							getBtnAdd4().setEnabled(false);
							adaptImage(getLblImage(), "/img/gift.png");
						}
					} catch (NullPointerException exception) {
						getBtnAdd4().setEnabled(false);
						adaptImage(getLblImage(), "/img/gift.png");
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
					if (getRedeemedGiftList().getSelectedValue() != null) {
						Gift g = (Gift) getRedeemedGiftList()
								.getSelectedValue();
						if (g.getSection().equals("V")) {
							for (Travel t : travels.getTravels()) {
								if (t.getDescription().equals(g.getName())) {
									travels.remove(t);
								}
							}
						} else {
							game.removeRedeemedGift(g);
						}
						dlmGifts.remove(
								getRedeemedGiftList().getSelectedIndex());
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

	private JLabel getLblRedeemedGifts4() {
		if (lblRedeemedGifts4 == null) {
			lblRedeemedGifts4 = new JLabel("Redeemed gifts:");
		}
		return lblRedeemedGifts4;
	}

	private JPanel getPnGiftImage4() {
		if (pnGiftImage4 == null) {
			pnGiftImage4 = new JPanel();
			pnGiftImage4.setLayout(new BorderLayout(0, 0));
			pnGiftImage4.add(getLblImage());
			pnGiftImage4.add(getPnNorthImage4(), BorderLayout.NORTH);
			pnGiftImage4.add(getPnSouthImage4(), BorderLayout.SOUTH);
			pnGiftImage4.add(getPnWestImage4(), BorderLayout.WEST);
			pnGiftImage4.add(getPnEastImage4(), BorderLayout.EAST);
		}
		return pnGiftImage4;
	}

	private JPanel getPnNorthImage4() {
		if (pnNorthImage4 == null) {
			pnNorthImage4 = new JPanel();
		}
		return pnNorthImage4;
	}

	private JPanel getPnSouthImage4() {
		if (pnSouthImage4 == null) {
			pnSouthImage4 = new JPanel();
		}
		return pnSouthImage4;
	}

	private JPanel getPnWestImage4() {
		if (pnWestImage4 == null) {
			pnWestImage4 = new JPanel();
		}
		return pnWestImage4;
	}

	private JPanel getPnEastImage4() {
		if (pnEastImage4 == null) {
			pnEastImage4 = new JPanel();
		}
		return pnEastImage4;
	}

	private JPanel getPnFinish() {
		if (pnFinish == null) {
			pnFinish = new JPanel();
			pnFinish.setLayout(new BorderLayout(0, 0));
			pnFinish.add(getLblTitle6(), BorderLayout.NORTH);
			pnFinish.add(getLblNewLabel(), BorderLayout.CENTER);
			pnFinish.add(getBtnExit6(), BorderLayout.SOUTH);
		}
		return pnFinish;
	}

	private JLabel getLblTitle6() {
		if (lblTitle6 == null) {
			lblTitle6 = new JLabel("ENJOY YOUR GIFTS!!");
			lblTitle6.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle6.setFont(new Font("Tahoma", Font.BOLD, 45));
		}
		return lblTitle6;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel(
					"You can get your gifts on the stand next to the terminal");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}

	private JButton getBtnExit6() {
		if (btnExit6 == null) {
			btnExit6 = new JButton("EXIT");
			btnExit6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					close();
					reinitializate();
				}
			});
			btnExit6.setBackground(Color.GREEN);
			btnExit6.setFont(new Font("Tahoma", Font.BOLD, 40));
		}
		return btnExit6;
	}

	private JPanel getPnNorth5() {
		if (pnNorth5 == null) {
			pnNorth5 = new JPanel();
			pnNorth5.setLayout(new GridLayout(2, 0, 0, 0));
			pnNorth5.add(getLblTitle5());
			pnNorth5.add(getPnCbTravels5());
		}
		return pnNorth5;
	}

	private JLabel getLblTitle5() {
		if (lblTitle5 == null) {
			lblTitle5 = new JLabel("Select the Date for your Trips");
			lblTitle5.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle5.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblTitle5;
	}

	private JPanel getPnCbTravels5() {
		if (pnCbTravels5 == null) {
			pnCbTravels5 = new JPanel();
			pnCbTravels5.add(getLblSelectTravel());
			pnCbTravels5.add(getCbRedeemedTravels());
			pnCbTravels5.add(getBtnAssignDate5());
		}
		return pnCbTravels5;
	}

	private JComboBox getCbRedeemedTravels() {
		if (cbRedeemedTravels == null) {
			cbRedeemedTravels = new JComboBox();
		}
		return cbRedeemedTravels;
	}

	private JLabel getLblSelectTravel() {
		if (lblSelectTravel == null) {
			lblSelectTravel = new JLabel("Redeemed Travels: ");
			lblSelectTravel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return lblSelectTravel;
	}

	private JPanel getPnCalendar() {
		if (pnCalendar == null) {
			pnCalendar = new JPanel();
			pnCalendar.setLayout(new GridLayout(2, 1, 0, 0));
			pnCalendar.add(getTravelCalendar());
			pnCalendar.add(getPnObservations5());
		}
		return pnCalendar;
	}

	private JPanel getPnSouth5() {
		if (pnSouth5 == null) {
			pnSouth5 = new JPanel();
			pnSouth5.setLayout(new GridLayout(0, 2, 0, 0));
			pnSouth5.add(getBtnBack5());
			pnSouth5.add(getBtnContinue5());
		}
		return pnSouth5;
	}

	private JButton getBtnBack5() {
		if (btnBack5 == null) {
			btnBack5 = new JButton("Go Back");
			btnBack5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					crd.previous(getContentPane());
				}
			});
			btnBack5.setBackground(Color.RED);
			btnBack5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnBack5;
	}

	private JButton getBtnContinue5() {
		if (btnContinue5 == null) {
			btnContinue5 = new JButton("Continue");
			btnContinue5.setEnabled(false);
			btnContinue5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FileUtil.saveToFile("deliveries", game.getClientLogged(),
							game.getRedeemedGifts(), travels.getTravels());
					crd.next(getContentPane());
				}
			});
			btnContinue5.setBackground(Color.GREEN);
			btnContinue5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return btnContinue5;
	}

	private JButton getBtnAssignDate5() {
		if (btnAssignDate5 == null) {
			btnAssignDate5 = new JButton("Assign Date to Selected Travel");
			btnAssignDate5.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnAssignDate5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Travel t = (Travel) getCbRedeemedTravels()
							.getSelectedItem();
					for (Travel travel : travels.getTravels()) {
						if (travel.equals(t)) {
							t.setDay(getTravelCalendar().getDayChooser()
									.getDay());
							t.setMonth(getTravelCalendar().getDate().getMonth()
									+ 1);
							t.setYear(getTravelCalendar().getDate().getYear()
									+ 1900);
							t.setObservations(getTxtObservations().getText());
							t.setDateAssigned(true);
						}
					}
					// Checking if you already set the day for every travel you
					// get
					if (allDatesAssigned()) {
						getBtnContinue5().setEnabled(true);
					}
				}
			});
			btnAssignDate5.setBackground(Color.YELLOW);
		}
		return btnAssignDate5;
	}

	private boolean allDatesAssigned() {
		for (Travel travel : travels.getTravels()) {
			if (!travel.isDateAssigned()) {
				return false;
			}
		}
		return true;
	}

	private JPanel getPnObservations5() {
		if (pnObservations5 == null) {
			pnObservations5 = new JPanel();
			pnObservations5.setLayout(new BorderLayout(0, 0));
			pnObservations5.add(getLblObservations(), BorderLayout.NORTH);
			pnObservations5.add(getTxtObservations());
		}
		return pnObservations5;
	}

	private JTextArea getTxtObservations() {
		if (txtObservations == null) {
			txtObservations = new JTextArea();
		}
		return txtObservations;
	}

	private JLabel getLblObservations() {
		if (lblObservations == null) {
			lblObservations = new JLabel("    Observations:");
		}
		return lblObservations;
	}
}
