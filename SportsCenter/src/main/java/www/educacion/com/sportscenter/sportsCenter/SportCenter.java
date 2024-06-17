
package www.educacion.com.sportscenter.sportsCenter;

import java.util.ArrayList;
import java.util.List;
import www.educacion.com.sportscenter.scenario.Scenario;


public class SportCenter {
    private String name;
    private String ID;
    private String location;
    private String schedule;
    
    List<Scenario > scenaries = new ArrayList<>();
    public SportCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void addScenario(Scenario scenario){
        this.scenaries.add(scenario);
    }
    
    public void bookScenario(Scenario scenario){
        int index = this.scenaries.indexOf(scenario);
        Scenario sc = this.scenaries.get(index);
        
        if(sc.isAvailable()){
            System.out.println("Ohh, yeahh");
            sc.setAvailable(false);
        }else{
            System.out.println("Sorry, esta ocupado");
        }
    }
     
    
    
    
    
    
}
