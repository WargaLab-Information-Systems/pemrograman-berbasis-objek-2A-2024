package komputer;

final class KomputerCetak {
    void cetakSemua(Komputer perangkat) {
        perangkat.hidupkan_os();
        perangkat.hidupkan_os("windows");
        perangkat.matikan_os();
        perangkat.matikan_os("punya dia sendiri");
        perangkat.klikKanan();
        perangkat.klikKiri();
        perangkat.tekanEnter();
        perangkat.cetakData();
    }
    final void cetak(Komputer[] obj) {
        for (Komputer perangkat : obj) {
            cetakSemua(perangkat);
        }
    }
}
