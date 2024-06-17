
package www.educacion.com.sportscenter.people;

import www.educacion.com.sportscenter.Role;
import www.educacion.com.sportscenter.TypeSports;

public class Sportsman extends Person implements Doping,Diet {
    private TypeSports typeSports;
    private Category category;

    public Sportsman(TypeSports typeSports, Category category, String name, String ID, int age, String gender, Role role) {
        super(name, ID, age, gender, role);
        this.typeSports = typeSports;
        this.category = category;
    }

    @Override
    public void doDopingTest() {
        System.out.println("Realizando test de dopaje");
    }

    @Override
    public void doDiet() {
        if(this.typeSports == typeSports.BASKETBALL){
            System.out.println("Dieta basquetbolera");
            return;
        }
        if(this.typeSports == typeSports.SOCCER){
            System.out.println("Dieta futbolera");
            return;
        }
        if(this.typeSports == typeSports.VOLLEYBALL){
            System.out.println("Dieta bolleybolera");
            return;
        }
    }
    
    
}
