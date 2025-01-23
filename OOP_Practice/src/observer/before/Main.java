package observer.before;

import observer.ConcreteSubject;
import observer.ConsoleObserver;
import observer.FileObserver;
import observer.Message;
import observer.Observer;
import observer.Subject;

public class Main {

    public static void main(String[] args){
        Subject concreteSubject = new ConcreteSubject();
        observer.Observer consoleObserver = new ConsoleObserver();
        Observer fileObserver = new FileObserver();

        concreteSubject.registerObserver(consoleObserver);
        concreteSubject.registerObserver(fileObserver);
        observer.Message message = new Message();
        for(int i=0; i<10; i++){
            concreteSubject.notify(message.getMessage());
        }
    }
}
