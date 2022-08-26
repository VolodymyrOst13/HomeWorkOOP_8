package task234;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor1 = monitor;
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());

        System.out.println(device.hashCode());
    }
}
