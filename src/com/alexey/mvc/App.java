package com.alexey.mvc;

import com.alexey.mvc.control.BeatController;
import com.alexey.mvc.control.ControllerInterface;
import com.alexey.mvc.model.BeatModelInterface;
import com.alexey.mvc.model.BeatModelOk;

/**
 * Created by NewClass7 on 18.09.2015.
 */
public class App {
    public static void main(String[] args) {
        BeatModelInterface beatModel = new BeatModelOk();
        ControllerInterface controller = new BeatController(beatModel);

    }
}