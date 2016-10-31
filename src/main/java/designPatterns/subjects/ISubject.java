package designPatterns.subjects;

import designPatterns.observers.IObserver;

/**
 * Created by fouli on 10/30/2016.
 */
public interface ISubject {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
