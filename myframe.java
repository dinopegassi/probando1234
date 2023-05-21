package main;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import funcion.ListaPuntos;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import funcion.Punto;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4874481754647933051L;

	public MyFrame() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		this.setTitle("Java  GUI Demo");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		DefaultListModel<Punto> myList = new DefaultListModel<>();
		
		JList<Punto> coso = new JList<>(myList);
		
		this.add(coso);
		
		this.setVisible(true);
	}

	public MyFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MyFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public MyFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	
}
