package observer2;

import java.util.ArrayList;
import java.util.List;
 
public class MyTopic implements Subject {
 
    private List<Observer> observers;
    private String msg;
    private boolean isChanged;
    private final Object MUTEX = new Object();
 
    public MyTopic() {
        this.observers = new ArrayList<>();
    }
 
    public void register(Observer obj) {
        if (obj == null)
            throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj))
                observers.add(obj);
        }
    }
 
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }
 
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!isChanged)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.isChanged = false;
        }
 
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }
 
    public Object getUpdate(Observer obj) {
        return this.msg;
    }
 
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic : " + msg);
        this.msg = msg;
        this.isChanged = true;
        notifyObservers();
    }
}