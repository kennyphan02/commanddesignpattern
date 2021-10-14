/**
 * @author Kenny Phan, Danai Angelidis, Thomas Vu, Daniel Nguyen
 * InArmyCommands contains contents and methods of what an InArmy does. Implements command.
 */
public class InArmyCommand implements Command {
   
    private MilitaryCadence cadence;

    /**
     * Constructor for the In Army Command cadence.
     * @param cadence The cadence that was chosen to be played.
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
    * exectues the singInArmy method.
    */
    public void execute() {
        this.cadence.singInArmy();
    }

}