package mvc;

import mvc.control.BeatController;
import mvc.control.ControllerInterface;
import mvc.model.BeatModelInterface;
import mvc.model.BeatModelOk;

/**
 * Created by NewClass7 on 18.09.2015.
 */
public class App {
    public static void main(String[] args) {
        BeatModelInterface beatModel = new BeatModelOk();
        ControllerInterface controller = new BeatController(beatModel);

    }
}