package W2_Gathering_Requirements;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    DogDoor dogDoor;

    public Remote(DogDoor door) {
        dogDoor = door;
    }

    public void RemoteControl() {
        System.out.println("Pressed to remote control button.");
        if (dogDoor.isOpen()) {
            dogDoor.close();
        } else {
            dogDoor.open();
            final Timer timer = new Timer();

            int delay = 5000; //delay in milliseconds(5 seconds)

            TimerTask timerTask = new TimerTask() {  //I created a new timerTask for the make reusable.
                @Override
                public void run() {
                    dogDoor.close();
                }
            };
            timer.schedule(timerTask, delay);


        }
    }

}
