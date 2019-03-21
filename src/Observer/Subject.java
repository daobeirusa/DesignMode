package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void detach(Observer observer){
        try {
            this.observers.remove(observer);
        }catch (Exception e){
            System.out.println("Observer "+observer+"not been found.");
        }
    }

    public void observerNotify(){
        for (Observer observer:observers
             ) {
            observer.update();
        }
    }
}
