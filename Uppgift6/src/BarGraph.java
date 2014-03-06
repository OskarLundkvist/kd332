import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class BarGraph extends JComponent {
	
	private int women;
	private int men;
	private float total;
	private float womenPercent;
	private float menPercent;
	private int womenHeight;
	private int menHeight;
	
	
	public void updateValues(int _women, int _men){
		this.women = _women;
		this.men = _men;
		this.total = this.women + this.men;
		
		this.womenPercent = this.women / this.total;
		this.menPercent = this.men / this.total;
		System.out.println(String.valueOf(this.womenPercent));
		System.out.println(String.valueOf(this.menPercent));
		
		this.womenHeight = (int) (getHeight() * this.womenPercent);
		this.menHeight = (int) (getHeight() * this.menPercent);
		System.out.println(String.valueOf(this.womenHeight));
		System.out.println(String.valueOf(this.menHeight));
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.setFont(g.getFont().deriveFont(18));
		g.drawString("Totalt sökande: " + String.valueOf(this.total), 10, 10);
		g.setColor(Color.red);
		g.fillRect(0, getHeight()-this.womenHeight, getWidth()/2, this.womenHeight );
		g.setColor(Color.blue);
		g.fillRect(getWidth()/2, getHeight()-this.menHeight, getWidth()/2, this.menHeight );
	}

	public float getWomenPercent() {
		return womenPercent;
	}

	public float getMenPercent() {
		return menPercent;
	}

}
