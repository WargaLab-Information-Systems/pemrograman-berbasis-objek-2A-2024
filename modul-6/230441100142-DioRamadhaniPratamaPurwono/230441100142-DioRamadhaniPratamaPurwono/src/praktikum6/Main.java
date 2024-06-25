package praktikum6;

import java.util.Scanner;


abstract class Computer {
    protected InputDevice inputDevice;
    protected OutputDevice outputDevice;

    abstract void powerOn();
    abstract void powerOff();
    abstract void leftClickInputDevice();
    abstract void rightClickInputDevice();
    abstract void pressEnterInputDevice();
    abstract void printOutputDevice(String data);
}
class Mouse implements InputDevice {
    @Override
    public void leftClick() {
        System.out.println("Klik kiri mouse");
    }

    @Override
    public void rightClick() {
        System.out.println("Klik kanan mouse");
    }

    @Override
    public void pressEnter() {
    }
}
class Keyboard implements InputDevice {
    @Override
    public void leftClick() {
    }

    @Override
    public void rightClick() {
    }

    @Override
    public void pressEnter() {
        System.out.println("Keyboard ditekan Enter");
    }
}
    class Printer implements OutputDevice {
    @Override
    public void printOut(String data) {
        System.out.println("Mencetak: " + data);
    }
}
    class Screen implements OutputDevice {
    @Override
    public void printOut(String data) {
        System.out.println("Menampilkan di layar: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Pilih perangkat input: ");
            System.out.println("1. Mouse");
            System.out.println("2. Keyboard");
            String inputDeviceType = scanner.next();

            InputDevice inputDevice;
            switch (inputDeviceType) {
                case "1":
                    inputDevice = new Mouse();
                    break;
                case "2":
                    inputDevice = new Keyboard();
                    break;
                default:
                    throw new IllegalArgumentException("Jenis perangkat input tidak valid: " + inputDeviceType);
            }

            System.out.println("Pilih perangkat output: ");
            System.out.println("1. Printer");
            System.out.println("2. Screen");
            String outputDeviceType = scanner.next();

            OutputDevice outputDevice;
            switch (outputDeviceType) {
                case "1":
                    outputDevice = new Printer();
                    break;
                case "2":
                    outputDevice = new Screen();
                    break;
                default:
                    throw new IllegalArgumentException("Jenis perangkat output tidak valid: " + outputDeviceType);
            }

            System.out.println("Pilih jenis komputer: ");
            System.out.println("1. PC");
            System.out.println("2. Laptop");
            System.out.println("3. Notebook");
            int computerChoice = scanner.nextInt();

            Computer computer;
            switch (computerChoice) {
                case 1:
                    computer = new PC(inputDevice, outputDevice);
                    break;
                case 2:
                    computer = new Laptop(inputDevice, outputDevice);
                    break;
                case 3:
                    computer = new Notebook(inputDevice, outputDevice);
                    break;
                default:
                    throw new IllegalArgumentException("Pilihan jenis komputer tidak valid: " + computerChoice);
            }

            computer.powerOn();
            computer.leftClickInputDevice();
            computer.rightClickInputDevice();
            computer.pressEnterInputDevice();
            computer.printOutputDevice("Test Data");
            computer.powerOff();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
