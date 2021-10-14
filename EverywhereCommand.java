/**
 * @author Kenny Phan, Danai Angelidis, Thomas Vu, Daniel Nguyen
 * EverywhereCommand class that contents the contents and methods to print cadence. Implements command
 */
public class EverywhereCommand implements Command {

    private MilitaryCadence cadence;
    
    /**
     * Constructor for the Everywhere cadence.
     * @param cadence The cadence that was chosen to be played.
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Executes the singEverywhere method.
     */
    public void execute() {
        this.cadence.singEverywhereWeGo();
    }
    
}
