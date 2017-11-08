/**
 * 
 */
package model;

/**
 * @author jeroe
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Patrouille extends Actor {
	private static int count = 0;
	public Patrouille(Locatie locatie) {
		super(locatie);
		setCounter(++count);
	}

}
