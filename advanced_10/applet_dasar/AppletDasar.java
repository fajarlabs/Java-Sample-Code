package advanced_10.applet_dasar;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Contoh event handling di applet
 * Jalankan file ini dengan cara,
 * Klik kanan -> Run As -> Java Applet
 */
public class AppletDasar extends Applet implements MouseListener,
		ActionListener {
	
	/* Inisialisasi komponen */
	StringBuffer strBuffer;
	TextArea txtArea;
	Button b,c;

	/* Init komponen */
	public void init() {
		/* Tambahkan listener event ini */
		addMouseListener(this);
		strBuffer = new StringBuffer();
		addItem("initializing the apple ");
		
		/* Tambah komponen text area */
		txtArea = new TextArea(10, 20);
		txtArea.setEditable(false);
		// Masukkan kedalam window
		add(txtArea, "center");
		
		/* Tambah button */
		b = new Button("Add");
		c = new Button("Subtract");
		
		/* Tambahkan event */
		b.addActionListener(this);
		c.addActionListener(this);
		
		/* Masukkan kedalam window */
		add(b);
		add(c);
	}

	public void start() {
		addItem("starting the applet ");
	}

	public void stop() {
		addItem("stopping the applet ");
	}

	public void destroy() {
		addItem("unloading the applet");
	}

	void addItem(String word) {
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}

	public void paint(Graphics g) {
		/* Draw a Rectangle around the applet's display area. */
		g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

		/* display the string inside the rectangle. */
		g.drawString(strBuffer.toString(), 10, 20);
	}

	public void mouseEntered(MouseEvent event) {
	}

	public void mouseExited(MouseEvent event) {
	}

	public void mousePressed(MouseEvent event) {
	}

	public void mouseReleased(MouseEvent event) {
	}

	public void mouseClicked(MouseEvent event) {
		addItem("mouse clicked! ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* Dapatkan komponen melalu event */
		Button button = (Button)e.getSource();
		
		/* Filter / Periksa komponen sesuai button event-nya masing2 */
		if(b == button)
			System.out.println("Button b");
		
		if(c == button)
			System.out.println("Button c");

	}
}
