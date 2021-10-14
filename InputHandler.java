import java.util.ArrayList;

public class InputHandler {
   
    private ArrayList<Command> commands;
    
    public InputHandler(MilitaryCadence cadence) {
        InArmyCommand inArmy = new InArmyCommand(cadence);
        IDontKnowCommand idk = new IDontKnowCommand(cadence);
        EverywhereCommand everywhere = new EverywhereCommand(cadence);
        commands.add(inArmy);
        commands.add(idk);
        commands.add(everywhere);
    }
    
    public boolean playCadence(int num) {
        if(num>=3) {
            return false;
        }
        this.commands.get(num);
        return true;
    } 

}
