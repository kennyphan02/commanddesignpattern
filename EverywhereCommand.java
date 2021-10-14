public class EverywhereCommand implements Command {

    private MilitaryCadence cadence;
    
    public EverywhereCommand(MilitaryCadence cadence) {

    }

    public void execute() {
        cadence.singEverywhereWeGo();
    }
    
}
