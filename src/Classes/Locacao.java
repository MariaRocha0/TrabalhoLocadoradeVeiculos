package Classes;

import java.util.Calendar;

public class Locacao {

    private Cliente cnh;
    private Veiculo placa;
    private Calendar datainicio, datafinal;
    private double valor;

    public Locacao(Cliente cnh, Veiculo placa, Calendar datainicio, Calendar datafinal, double valor) {
        this.cnh = cnh;
        this.placa = placa;
        this.datainicio = datainicio;
        this.datafinal = datafinal;
        this.valor = valor;
    }

    public long getCnh() {
        return cnh.getCnh();
    }

    public void setCnh(Cliente cnh) {
        this.cnh = cnh;
    }

    public String getPlaca() {
        return placa.getPlaca();
    }

    public void setPlaca(Veiculo placa) {
        this.placa = placa;
    }

    public Calendar getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Calendar datainicio) {
        this.datainicio = datainicio;
    }

    public Calendar getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Calendar datafinal) {
        this.datafinal = datafinal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Locacao [cnh=" + cnh.getCnh() + ", placa=" + placa.getPlaca() + ", data inicial= " +  datainicio.get(Calendar.DAY_OF_MONTH) + "/" + (datainicio.get(Calendar.MONTH) + 1) + "/" + datainicio.get(Calendar.YEAR) +
        "; data final: " + datafinal.get(Calendar.DAY_OF_MONTH) + "/" + (datafinal.get(Calendar.MONTH) + 1) + "/" + datafinal.get(Calendar.YEAR) +
        ", valor=" + valor + "]" + "\n";
    }

}
