package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : observerList){
            observer.update(message);
        }
    }
}



