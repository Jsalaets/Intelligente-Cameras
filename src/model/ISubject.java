/**
 * 
 */
package model;

/**
 * @author: Jeroen Salaets
 * @date: 8 nov. 2017
 * @Project: GitIntelligenteCameras
 * @Purpose: subject interface
 */
public interface ISubject {
	public void registerObserver (Patrouille patrouille);
	public void removeObserver( Patrouille patrouille);
	public void notifyObservers();
}
