/**
 * 
 */
package model;

import view.TestIntelligenteCameras;

/**
 * @author jeroen salaets
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
		TestIntelligenteCameras.LOGGER.info(this.toString() + " zet achtervolging in voor " + dispatch.getGesignaleerd().toString());
	}
			
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
