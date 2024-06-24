
package praktikum6;

class Notebook extends Computer {
    Notebook(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    @Override
    void powerOn() {
        System.out.println("Notebook dihidupkan");
    }

    @Override
    void powerOff() {
        System.out.println("Notebook dimatikan");
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
