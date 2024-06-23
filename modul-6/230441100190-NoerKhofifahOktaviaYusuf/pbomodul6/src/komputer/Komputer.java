package komputer;

abstract class Komputer implements Mouse, Keyboard, Printer {
//    overload
    abstract void hidupkan_os();
    abstract void hidupkan_os(String OSnama);
    abstract void matikan_os();
    abstract void matikan_os(String OS);


}

