package mvc.model;

import mvc.view.BeatObserver;
import mvc.view.BpmObserver;

/**
 * Created by NewClass7 on 18.09.2015.
 */
public interface BeatModelInterface {
    //controller methods
    void on();
    void off();
    void setBpm(int bpm);

    //update info
    //for controller and view
    int getBpm();
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);

    void registerObserver(BpmObserver bpmObserver);
    void removeObserver(BpmObserver bpmObserver);
}
