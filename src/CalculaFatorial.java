public class CalculaFatorial {
    private int valor;
    private int fatorial;
    private long auxiliar;

    public CalculaFatorial(int valor){
        this.valor = valor;
        this.fatorial = this.valor;
        this.auxiliar = this.valor;
    }

    public long calcula(int fatorial) {
        while (fatorial > 1) {
            auxiliar = auxiliar * (fatorial - 1);
            fatorial--;
            System.out.println(auxiliar);
        }
        return this.auxiliar;
    }
    //-----------------------------------------------------------------//
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public long getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(long auxiliar) {
        this.auxiliar = auxiliar;
    }

    public int getFatorial() {
        return fatorial;
    }

    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    }
}
