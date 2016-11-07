package designPatterns.oberverpattern.observers;

import designPatterns.oberverpattern.domain.Employee;

/**
 * Created by fouli on 10/30/2016.
 */
public interface IObserver {
    void callMe(Employee employee, String msg);
}
