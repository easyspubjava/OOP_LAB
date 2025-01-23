package observer.before;

import observer.Observer;

public abstract class Subject {
    public abstract void registerObserver(observer.Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notify(String message);

}
