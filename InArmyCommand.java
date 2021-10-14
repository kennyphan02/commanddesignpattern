public class InArmyCommand implements Command {
    private MilitaryCadence cadence;

    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    public void execute(){
        this.cadence.singInArmy();
    }
}