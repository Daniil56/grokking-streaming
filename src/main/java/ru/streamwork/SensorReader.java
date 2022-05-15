package ru.streamwork;

import ru.streamwork.api.Source;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class SensorReader extends Source {
    private final BufferedReader reader;

    public SensorReader(String name, int port) {
        super(name);
        this.reader = setupSocketReader(port);
    }

    @Override
    public void getEvents(List<Event> eventCollector) {
        try {
            String vehicle = reader.readLine();
            eventCollector.add(new VehicleEvent(vehicle));
            System.out.println("Sensor Reader --> " + vehicle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedReader setupSocketReader(int port) {
        try {
            Socket socket = new Socket("localhost", port);
            InputStream input = socket.getInputStream();
            return new BufferedReader(new InputStreamReader(input));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
}
