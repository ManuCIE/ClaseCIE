package ComposicionHerencia;

public class Ordenador {

    private Monitor monitor;
    private CPU cpu;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Ordenador(Monitor monitor, CPU cpu) {
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public double sumaPrecios() {
        return monitor.getPrecio() + cpu.getPrecio();

    }

}
