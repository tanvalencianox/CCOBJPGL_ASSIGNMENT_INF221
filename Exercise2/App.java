import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer siri = new RobotExplorer();

        earth.accept(astronaut);
        uranus.accept(astronaut);
        jupiter.accept(astronaut);
        mars.accept(astronaut);
        saturn.accept(astronaut); 
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        venus.accept(astronaut);

        jupiter.accept(siri);
        venus.accept(siri);
        uranus.accept(siri);
        neptune.accept(siri);
        mars.accept(siri); 
        saturn.accept(siri);
        mercury.accept(siri);
        earth.accept(siri);
        
        
       
    }
}