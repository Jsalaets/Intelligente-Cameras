/**
 * 
 */
package Factory;

import generator.Randomizer;
import model.Actor;
import model.Camera;
import model.Dispatch;
import model.Locatie;
import model.Patrouille;
import model.Voertuig;

/**
 * @author jeroen salaets
 * @date 6 nov. 2017
 * @project Intelligente Cameras
 * @purpose
 */
public class ActorFactory
{
    public static final int DISPATCH = 1;
    public static final int PATROUILLE = 2;
    public static final int CAMERA = 3;
    public static final int VOERTUIG = 4;
    public static Actor createActor(int type, Locatie locatie){
        Actor actor = null;
        switch(type){
            case DISPATCH: {actor = new Dispatch(locatie); 
                break;
            }
            case PATROUILLE: {actor = new Patrouille(locatie);
                break;
            }    
            case CAMERA: {actor = new Camera(locatie);   
                break;}
            case VOERTUIG: {actor = new Voertuig(locatie);
                 ((Voertuig)actor).setNummerPlaat(Randomizer.getNummerPlaat());
                 ((Voertuig)actor).setMerk(Randomizer.getMerk());
                break;
            }    
        }
        return actor;
    }
}
