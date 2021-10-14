public class InArmyCommand implements Command {

    private MilitaryCadence cadence;
    
    public InArmyCommand(MilitaryCadence cadence) {

    }

    public void execute(){
        cadence.singInArmy();
    }
    
}
