package mino;

import java.awt.Color;
import java.awt.Graphics2D;

// Super Class for all Tetrominoes (shapes)
public class Mino {
	public Block b[] = new Block[4]; // Holds every block, 4 is fixed because every tetromino has 4 blocks
	public Block tempb[] = new Block[4]; // Temporary array for block rotations
	
	public void create(Color c) {
		// Each block initialized in the same color
		b[0] = new Block(c);
		b[1] = new Block(c);
		b[2] = new Block(c);
		b[3] = new Block(c);
		tempb[0] = new Block(c);
		tempb[1] = new Block(c);
		tempb[2] = new Block(c);
		tempb[3] = new Block(c);
	}
	public void setXY(int x, int y) {} // Initial position of the blocks
	public void updateXY(int direction) {} // Updated position of the blocks
	public void update() { // In the game loop to handle the sate of the Tetromino
		
	}
	public void draw(Graphics2D g2) { // Rendering the Tetromino onto the game screen
		
		int margin = 2; // to cut the seamless look of the block
		g2.setColor(b[0].c);
		g2.fillRect(b[0].x + margin, b[0].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
		g2.fillRect(b[1].x + margin, b[1].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
		g2.fillRect(b[2].x + margin, b[2].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
		g2.fillRect(b[3].x + margin, b[3].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
	}
}
