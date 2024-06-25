package praktikum6;

class Laptop extends Computer {
    Laptop(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    @Override
    void powerOn() {
        System.out.println("Laptop dihidupkan");
    }

    @Override
    void powerOff() {
        System.out.println("Laptop dimatikan");
    }

    @Override
    void leftClickInputDevice() {
        inputDevice.leftClick();
    }

    @Override
    void rightClickInputDevice() {
        inputDevice.rightClick();
    }

    @Override
    void pressEnterInputDevice() {
        inputDevice.pressEnter();
    }

    @Override
    void printOutputDevice(String data) {
        outputDevice.printOut(data);
    }
}
