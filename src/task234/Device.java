package task234;

import java.util.Objects;

public class Device {

    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "Device:" +
                "\nManufacturer - " + manufacturer +
                "\nPrice - " + price +
                "\nSerialNumber - " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
