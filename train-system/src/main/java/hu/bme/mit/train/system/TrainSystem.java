package hu.bme.mit.train.system;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

import java.util.Timer;
import java.util.TimerTask;

public class TrainSystem {

	private static TrainController controller = new TrainControllerImpl();
	private TrainUser user = new TrainUserImpl(controller);
	private TrainSensor sensor = new TrainSensorImpl(controller, user);

	public TrainController getController() {
		System.out.println("hello world");
		return controller;
	}

	public TrainSensor getSensor() {
		return sensor;
	}

	public TrainUser getUser() {
		return user;
	}

	public static void main(String[] args) {
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                controller.setJoystickPosition(2);
                controller.followSpeed();
                System.out.println(controller.getReferenceSpeed());
            }
        };
        Timer t = new Timer();
        t.schedule(tt , 1000, 1000);
	}

}
