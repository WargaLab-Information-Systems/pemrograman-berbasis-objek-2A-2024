package komputer;

abstract class Komputer implements Keyboard, Mouse, Printer {
    abstract void hidupkan_os();
    abstract void hidupkan_os(String OSnama);
    abstract void matikan_os();
    abstract void matikan_os(String OS);
}
