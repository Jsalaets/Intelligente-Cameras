/**
 * 
 */
package model;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author jeroe
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class Dispatch extends Actor implements ISubject{

	private LinkedList<Camera> cameras;
	private LinkedList<IVoertuig> geseind;
	private LinkedList<IVoertuig> gesignaleerd = new LinkedList<IVoertuig>();
	private LinkedList<Patrouille> observers = new LinkedList<Patrouille>();
	private static int count = 0;
	
	public Dispatch(Locatie locatie) {
		super(locatie);
		setCounter(++count);
	}
	/**
	 * @return the cameras
	 */
	public LinkedList<Camera> getCameras() {
		return cameras;
	}
	/**
	 * @param cameras the cameras to set
	 */
	public void setCameras(LinkedList<Camera> cameras) {
		this.cameras = cameras;
	}
	/**
	 * @return the geseind
	 */
	public LinkedList<IVoertuig> getGeseind() {
		return geseind;
	}
	/**
	 * @param geseind the geseind to set
	 */
	public void setGeseind(LinkedList<IVoertuig> geseind) {
		this.geseind = geseind;
	}
	
	public void signaleer(IVoertuig voertuig) {
		this.gesignaleerd.add(voertuig);
		
	}
	
	public void registerObserver(Patrouille patrouille) {
		getObservers().add(patrouille);
	}
	
	public void removeObserver(Patrouille patrouille) {
		getObservers().remove(patrouille);
	}
	
	public LinkedList<IVoertuig> getGesignaleerd() {
		return gesignaleerd;
	}
	/**
	 * @return the observers
	 */
	public LinkedList<Patrouille> getObservers() {
		return observers;
	}
	/**
	 * @param observers the observers to set
	 */
	public void setObservers(LinkedList<Patrouille> observers) {
		this.observers = observers;
	}
	
	public void notifyObservers() {
		Iterator<Patrouille> i = getObservers().iterator();
		while (i.hasNext()) {
			Patrouille p = i.next();
			p.update(this);
		}
	}

}
