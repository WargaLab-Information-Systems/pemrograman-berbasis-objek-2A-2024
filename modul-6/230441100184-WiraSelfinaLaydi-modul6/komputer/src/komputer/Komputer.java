package komputer;
//interface
interface Mouse {
    public void klikKiri();
    public void klikKanan();
}
interface Keyboard {
    public void tekanEnter();
}
interface Printer {
    public void cetakData();
}
//abstaract class-nya
abstract class Komputer implements Mouse, Keyboard, Printer {
//    overload
    abstract void hidupkan_os();
    abstract void hidupkan_os(String OSnama);
    abstract void matikan_os();
    abstract void matikan_os(String OS);
}

