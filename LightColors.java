package dev.speckless;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LightColors {

	// Display
	private JFrame frame;
	private JPanel panel;
	private JPanel color;
	
	// Bar-menu
	JMenuBar menu = new JMenuBar();
	JMenu file = new JMenu("Arquivo");
	JMenu options = new JMenu("Opções");
	JMenu about = new JMenu("Ajuda");
	
	// Slider
	JSlider a1 = new JSlider();
	JSlider a2 = new JSlider();
	JSlider a3 = new JSlider();
	
	// Text
	JLabel rgb = new JLabel("RGB: 0, 0, 0");
	JLabel hex = new JLabel("HEX: #FFFFFF");
	
	// bool
	boolean op_1 = false;
	boolean op_2 = false;
	boolean op_3 = false;
	
	private void initComponents() {
		if(frame != null) {
			
			// JPanel[background]
			panel = new JPanel();
			panel.setSize(250, 400);
			panel.setBackground(Color.CYAN);
			// JPanel[color]
			color = new JPanel();
			color.setSize(100, 60);
			color.setLocation(75, 250);
			color.setBackground(new Color(50, 50, 50));
			
			// menu
			menu.add(file);
			menu.add(options);
			menu.add(about);
			
			// slider
			a1.setMaximum(255);
			a2.setMaximum(255);
			a3.setMaximum(255);
			a1.setMinimum(0);
			a2.setMinimum(0);
			a3.setMinimum(0);
			//
			a1.setBackground(new Color(106, 239, 250));
			a2.setBackground(new Color(106, 239, 250));
			a3.setBackground(new Color(106, 239, 250));
			
			rgb.setLocation(75, 150);
			hex.setLocation(75, 160);
			// text
			if(op_1 == true) {
				Color rgb_ = new Color(a1.getValue(), a2.getValue(), a3.getValue());
				rgb.setText("RGB: " + a1.getValue() + ", " + a2.getValue() + " ," + a3.getValue());
				
				String h = "#" + Integer.toHexString(rgb_.getRGB()).substring(2);
				hex.setText("HEX: " + h);
			}
			
			// event
			a1.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent arg0) {
					Color rgb_ = new Color(a1.getValue(), a2.getValue(), a3.getValue());
					color.setBackground(rgb_);
					if(op_1 == true) {
						rgb.setText("RGB: " + a1.getValue() + ", " + a2.getValue() + " ," + a3.getValue());
						
						String h = "#" + Integer.toHexString(rgb_.getRGB()).substring(2);
						hex.setText("HEX: " + h);
					}					
				}
			});
			a2.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent arg0) {
					Color rgb_ = new Color(a1.getValue(), a2.getValue(), a3.getValue());
					color.setBackground(rgb_);
					if(op_1 == true) {
						rgb.setText("RGB: " + a1.getValue() + ", " + a2.getValue() + " ," + a3.getValue());
						
						String h = "#" + Integer.toHexString(rgb_.getRGB()).substring(2);
						hex.setText("HEX: " + h);
					}
				}
			});
			a3.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent arg0) {
					Color rgb_ = new Color(a1.getValue(), a2.getValue(), a3.getValue());
					color.setBackground(rgb_);
					if(op_1 == true) {
						rgb.setText("RGB: " + a1.getValue() + ", " + a2.getValue() + " ," + a3.getValue());
						
						String h = "#" + Integer.toHexString(rgb_.getRGB()).substring(2);
						hex.setText("HEX: " + h);
					}
				}
			});
			
			// add
			panel.add(a1);
			panel.add(a2);
			panel.add(a3);
			panel.add(rgb);
			panel.add(hex);
			
			//frame.setJMenuBar(menu);
			frame.add(color);
			frame.add(panel);
		} else {
			
		}
	}
	
	private void init() {
		
		frame = new JFrame("Light Colors");
		frame.setSize(250, 400);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		
		frame.setVisible(true);
	}
	
	public LightColors(boolean executar) {
		op_1 = true;
		if(executar == true) {
			init();
		} else {
			
		}
	}
	
}
