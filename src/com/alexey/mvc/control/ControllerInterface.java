package com.alexey.mvc.control;

/**
 * Created by NewClass7 on 18.09.2015.
 */
public interface ControllerInterface {
    void start();

    void stop();

    void setBpm(int bpm);

    void increaseBpm();


    void decreaseBpm();
}
