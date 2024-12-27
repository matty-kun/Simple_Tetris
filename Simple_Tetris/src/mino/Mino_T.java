package mino;

import java.awt.Color;

public class Mino_T extends Mino{
	
	public Mino_T() {
		create(Color.magenta);
	}
	
	public void setXY(int x, int y) {
		//   #
		// # # #
		
		b[0].x = x;
		b[0].y = y;
		b[1].x = b[0].x;
		b[1].y = b[0].y - Block.SIZE;
		b[2].x = b[0].x - Block.SIZE;
		b[2].y = b[0].y;
		b[3].x = b[0].x + Block.SIZE;
		b[3].y = b[0].y;
 	}
	public void getDirection1() {
		//   #
		// # # #
		
		tempb[0].x = b[0].x;
		tempb[0].y = b[0].y;
		tempb[1].x = b[0].x;
		tempb[1].y = b[0].y - Block.SIZE;
		tempb[2].x = b[0].x - Block.SIZE;
		tempb[2].y = b[0].y;
		tempb[3].x = b[0].x + Block.SIZE;
		tempb[3].y = b[0].y;
		
		updateXY(1);
	}
	public void getDirection2() {
		// #
		// # #
		// #
		
		tempb[0].x = b[0].x;
		tempb[0].y = b[0].y;
		tempb[1].x = b[0].x + Block.SIZE;
		tempb[1].y = b[0].y;
		tempb[2].x = b[0].x;
		tempb[2].y = b[0].y - Block.SIZE;
		tempb[3].x = b[0].x;
		tempb[3].y = b[0].y + Block.SIZE;
		
		updateXY(2);
	}
	public void getDirection3() {
		// # # #
		//   #
		
		tempb[0].x = b[0].x;
		tempb[0].y = b[0].y;
		tempb[1].x = b[0].x;
		tempb[1].y = b[0].y + Block.SIZE;
		tempb[2].x = b[0].x + Block.SIZE;
		tempb[2].y = b[0].y;
		tempb[3].x = b[0].x - Block.SIZE;
		tempb[3].y = b[0].y;
		
		updateXY(3);
	}
	public void getDirection4() {
		//   #
		// # #
		//   #
		
		tempb[0].x = b[0].x;
		tempb[0].y = b[0].y;
		tempb[1].x = b[0].x;
		tempb[1].y = b[0].y - Block.SIZE;
		tempb[2].x = b[0].x;
		tempb[2].y = b[0].y + Block.SIZE;
		tempb[3].x = b[0].x;
		tempb[3].y = b[0].y - Block.SIZE;
		
		updateXY(4);
	}
	
}
