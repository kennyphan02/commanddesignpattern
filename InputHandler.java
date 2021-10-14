import java.util.ArrayList;

public class InputHandler {
   
    private ArrayList<Command> commands;
    
    /**
     * Creates an arraylist that contains instances of the cadences.
     * @param cadence The cadence that is inputted into the array.
     */
    public InputHandler(MilitaryCadence cadence) {
        this.commands = new ArrayList<Command>();
        InArmyCommand inArmy = new InArmyCommand(cadence);
        IDontKnowCommand idk = new IDontKnowCommand(cadence);
        EverywhereCommand everywhere = new EverywhereCommand(cadence);
        this.commands.add(inArmy);
        this.commands.add(idk);
        this.commands.add(everywhere);
    }
    
    /**
     * Plays the cadence if the number inputted is an index of the array.
     * @param num The cadence that will be played.
     * @return True if the cadence can be played, false if it can't.
     */
    public boolean playCadence(int num) {
        if(num > this.commands.size()) {
            return false;
        }
        this.commands.get(num);
        return true;
    } 

}