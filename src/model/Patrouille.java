/**
 * 
 */
package model;

import java.util.ListIterator;

/**
 * @author jeroe
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Patrouille extends Actor implements IObserver{
	private static int count = 0;
	
	public Patrouille(Locatie locatie) {
		super(locatie);
		setCounter(++count);
	}
	@Override
	public void update(Dispatch dispatch) {
		ListIterator<Patrouille> listIterator = dispatch.getObservers().listIterator();
		Patrouille patrouille;
		while (listIterator.hasNext()) {
			patrouille = listIterator.next();
			System.out.println(patrouille.toString());
		}
		
	}
}
