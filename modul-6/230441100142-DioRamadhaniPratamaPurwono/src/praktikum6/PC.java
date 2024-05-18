package praktikum6;

class PC extends Computer {
    PC(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    @Override
    void powerOn() {
        System.out.println("PC dihidupkan");
    }

    @Override
    void powerOff() {
        System.out.println("PC dimatikan");
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