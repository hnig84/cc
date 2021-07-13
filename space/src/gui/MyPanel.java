package gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	private int rows, columns;
	
	private JPanel panel = new JPanel();
	private LayoutManager layout = new GridLayout(rows, columns);
	
	MyPanel(int rows, int columns){
		this.init();
		this.rows = rows;
		this.columns = columns;
	}
	
	public void init() {
		panel.setLayout(layout);
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public LayoutManager getLayout() {
		return layout;
	}

	public void setLayout(LayoutManager layout) {
		this.layout = layout;
	}
	
	
}
