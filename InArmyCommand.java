public class InArmyCommand implements Command {
   
    private MilitaryCadence cadence;

    /**
     * Constructor for the In Army Command cadence.
     * @param cadence The cadence that was chosen to be played.
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
<<<<<<< HEAD
    /**
    * exectues the singInArmy method.
    */
    public void execute(){
=======

    public void execute() {
>>>>>>> 21e518990fa83012df808c18961bb86709abc330
        this.cadence.singInArmy();
    }

}