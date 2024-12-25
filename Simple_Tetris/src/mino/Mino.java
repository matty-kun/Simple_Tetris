package mino;

import java.awt.Color;

import java.awt.Graphics2D;

import main.KeyHandler;
import main.PlayManager;

// Super Class for all Tetrominoes (shapes)
public class Mino {
	public Block b[] = new Block[4]; // Holds every block, 4 is fixed because every tetromino has 4 blocks
	public Block tempb[] = new Block[4]; // Temporary array for block rotations
	int autoDropCounter = 0;
	public int direction = 1; // There are 4 directions (1/2/3/4)
	
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
	public void updateXY(int direction) { // Updated position of the blocks
		 
		this.direction = direction;
		b[0].x = tempb[0].x;
		b[0].y = tempb[0].y;
		b[1].x = tempb[1].x;
		b[1].y = tempb[1].y;
		b[2].x = tempb[2].x;
		b[2].y = tempb[2].y;
		b[3].x = tempb[3].x;
		b[3].y = tempb[3].y;
	} 
	public void getDirection1() {}
	public void getDirection2() {}
	public void getDirection3() {}
	public void getDirection4() {}
	public void update() { // In the game loop to handle the state of the Tetromino
		
		// Move the Mino
		if(KeyHandler.upPressed) {
			switch(direction) {
			case 1: getDirection2(); break;
			case 2: getDirection3(); break;
			case 3: getDirection4(); break;
			case 4: getDirection1(); break;
			}
			KeyHandler.upPressed = false;
		}
		if(KeyHandler.downPressed) {
			
			b[0].y += Block.SIZE;
			b[1].y += Block.SIZE;
			b[2].y += Block.SIZE;
			b[3].y += Block.SIZE;
			
			// When moved down, reset the autoDropCounter
			autoDropCounter = 0;
			
			KeyHandler.downPressed = false;
		}
		if(KeyHandler.leftPressed) {
			
			b[0].x -= Block.SIZE;
			b[1].x -= Block.SIZE;
			b[2].x -= Block.SIZE;
			b[3].x -= Block.SIZE;
			
			autoDropCounter = 0;
			
			KeyHandler.leftPressed = false;
			
		}
		if(KeyHandler.rightPressed) {
			
			b[0].x += Block.SIZE;
			b[1].x += Block.SIZE;
			b[2].x += Block.SIZE;
			b[3].x += Block.SIZE;
			
			autoDropCounter = 0;
			KeyHandler.rightPressed = false;
		}
		
		
		autoDropCounter++; // the counter increases in every frame
		if(autoDropCounter == PlayManager.dropInterval) {
			// Mino goes down
			b[0].y += Block.SIZE;
			b[1].y += Block.SIZE;
			b[2].y += Block.SIZE;
			b[3].y += Block.SIZE;
			autoDropCounter = 0; // resets
		}
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
