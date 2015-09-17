package billes;

import java.util.ArrayList;

public class Environnement {
	
	private Agent espace[][];
	private int width, height;
	private boolean toric;
	
	public Environnement(int width, int height, boolean toric) {
		this.width = width;
		this.height = height;
		this.toric = toric;
	}
	
	// Create the 2D array of Agent
	public void init() {
		this.espace = new Agent[width][height];
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	// Return true if the cell (x, y) contains an Agent, false otherwise
	public boolean isBusy(int x, int y) {
		return this.espace[x][y] != null;
	}
	
	public boolean isToric() {
		return toric;
	}
	
	
}
