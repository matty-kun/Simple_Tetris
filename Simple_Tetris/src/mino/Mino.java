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
		
	}
}
