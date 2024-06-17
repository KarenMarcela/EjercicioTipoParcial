

package www.educacion.com.sportscenter;

import www.educacion.com.sportscenter.scenario.Scenario;
import www.educacion.com.sportscenter.sportsCenter.SportCenter;


public class SportsCenter {

    public static void main(String[] args) {
        
        SportCenter sportCenter = new SportCenter("El campin", "HGH655", "Cúcuta", "24 hrs");
        
        Scenario scenario1 = new Scenario(500, TypeSports.SOCCER, "18: 00 - 22:00");
        Scenario scenario2 = new Scenario(600, TypeSports.BASKETBALL, "10: 00 - 14:00");
        Scenario scenario3 = new Scenario(200, TypeSports.VOLLEYBALL, "14: 00 - 18:00");
        
        sportCenter.addScenario(scenario3);
        sportCenter.addScenario(scenario2);
        sportCenter.addScenario(scenario1);
        
        sportCenter.bookScenario(scenario3);
        sportCenter.bookScenario(scenario1);
    }
}
