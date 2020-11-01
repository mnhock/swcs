package swcs.gof.creational.abstractfactory.car;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AutoSearchUI extends JFrame {

    private static final long serialVersionUID = 1L;

    public static final String NEWLINE = "\n";
    public static final String SEARCH = "Search";
    public static final String EXIT = "Exit";
    public static final String CAR = "Car";
    public static final String SUV = "SUV";

    private final JComboBox<String> cmbVehicleCategory, cmbVehicleType;

    private final JLabel lblVehicleCategory, lblVehicleType, lblCarName, lblCarNameValue;

    public AutoSearchUI() {
        super("Abstract Factory - Example");

        this.cmbVehicleCategory = new JComboBox<>();
        this.cmbVehicleCategory.addItem(VehicleFactory.LUXURY_VEHICLE);
        this.cmbVehicleCategory.addItem(VehicleFactory.NON_LUXURY_VEHICLE);

        this.cmbVehicleType = new JComboBox<>();
        this.cmbVehicleType.addItem(AutoSearchUI.CAR);
        this.cmbVehicleType.addItem(AutoSearchUI.SUV);

        this.lblVehicleCategory = new JLabel("Vehicle Category:");
        this.lblVehicleType = new JLabel("VehicleType:");
        this.lblCarName = new JLabel("Search Result:");
        this.lblCarNameValue = new JLabel(" Please click on Search button");

        // Create the open button
        JButton openButton = new JButton(AutoSearchUI.SEARCH);
        openButton.setMnemonic(KeyEvent.VK_S);
        JButton exitButton = new JButton(AutoSearchUI.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);
        ButtonHandler objButtonHandler = new ButtonHandler(this);

        openButton.addActionListener(objButtonHandler);
        exitButton.addActionListener(new ButtonHandler());

        JPanel buttonPanel = new JPanel();

        // ****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        buttonPanel.add(this.lblVehicleCategory);
        buttonPanel.add(this.cmbVehicleCategory);
        buttonPanel.add(this.lblVehicleType);
        buttonPanel.add(this.cmbVehicleType);
        buttonPanel.add(this.lblCarName);
        buttonPanel.add(this.lblCarNameValue);

        buttonPanel.add(openButton);
        buttonPanel.add(exitButton);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(this.lblVehicleCategory, gbc);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(this.cmbVehicleCategory, gbc);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(this.lblVehicleType, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(this.cmbVehicleType, gbc);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(this.lblCarName, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(this.lblCarNameValue, gbc);

        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;
        gbc.anchor = GridBagConstraints.EAST;

        gbc.gridx = 0;
        gbc.gridy = 5;
        gridbag.setConstraints(openButton, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gridbag.setConstraints(exitButton, gbc);

        // ****************************************************

        // Add the buttons and the log to the frame
        Container contentPane = getContentPane();

        contentPane.add(buttonPanel, BorderLayout.CENTER);
        try {
            // UIManager.setLookAndFeel();
            SwingUtilities.updateComponentTreeUI(AutoSearchUI.this);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new AutoSearchUI();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public String getSelectedCategory() {
        return (String) this.cmbVehicleCategory.getSelectedItem();
    }

    public String getSelectedType() {
        return (String) this.cmbVehicleType.getSelectedItem();
    }

    public void setResult(String searchResult) {
        this.lblCarNameValue.setText(searchResult);
    }
} // End of class AutoSearchUI

class ButtonHandler implements ActionListener {
    AutoSearchUI objAutoSearchUI;

    @Override
    public void actionPerformed(ActionEvent e) {
        String searchResult = null;

        if (e.getActionCommand().equals(AutoSearchUI.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(AutoSearchUI.SEARCH)) {
            // get input values
            String vhCategory = this.objAutoSearchUI.getSelectedCategory();
            String vhType = this.objAutoSearchUI.getSelectedType();

            // get one of Luxury or NonLuxury vehicle factories
            VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

            if (vhType.equals(AutoSearchUI.CAR)) {
                Car c = vf.getCar();
                searchResult = "Name: " + c.getCarName() + "  Features: " + c.getCarFeatures();
            }
            if (vhType.equals(AutoSearchUI.SUV)) {
                SUV s = vf.getSUV();
                searchResult = "Name: " + s.getSUVName() + "  Features: " + s.getSUVFeatures();
            }
            this.objAutoSearchUI.setResult(searchResult);
        }

    }

    public ButtonHandler() {
    }

    public ButtonHandler(AutoSearchUI inObjAutoSearchUI) {
        this.objAutoSearchUI = inObjAutoSearchUI;
    }

}
