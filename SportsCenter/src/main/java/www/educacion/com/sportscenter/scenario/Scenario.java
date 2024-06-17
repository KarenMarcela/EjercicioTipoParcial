
package www.educacion.com.sportscenter.scenario;

import www.educacion.com.sportscenter.TypeSports;


public class Scenario {
    private int capacity;
    private TypeSports typeSports;
    
    private String shedule;
    private boolean available;

    public Scenario(int capacity, TypeSports typeSports, String shedule) {
        this.capacity = capacity;
        this.typeSports = typeSports;
        this.shedule = shedule;
        this.available = true;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
    
    
}
