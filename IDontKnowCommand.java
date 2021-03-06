/**
 * @author Kenny Phan, Danai Angelidis, Thomas Vu, Daniel Nguyen
 * IDontKnowCommand contains contents and methods of what IDontKnow does. implements command.
 */

public class IDontKnowCommand implements Command {

    private MilitaryCadence cadence;
    
    /**
     * Constructor for the I Don't Know cadence.
     * @param cadence The cadence that was chosen to be played.
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Executes the singIDontKnow method.
     */
    public void execute() {
        this.cadence.singIDontKnow();
    }
}
