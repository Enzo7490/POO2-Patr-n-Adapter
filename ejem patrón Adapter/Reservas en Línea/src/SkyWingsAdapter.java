public class SkyWingsAdapter extends TransWorld{
    private SkyWings skyWings;

    public SkyWingsAdapter(SkyWings skyWings) {
        this.skyWings = skyWings;
    }

    @Override
    public void verificarDisponibilidad() {
        skyWings.verificarAsiento();
    }

    @Override
    public void hacerReserva() {
        skyWings.reservarAsiento();
        skyWings.imprimirBoleto();
    }

    @Override
    public void cancelarReserva() {
        skyWings.cancelarVuelo();
    }
}

