package main.exercicio5;

public class Circulo implements Area{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public double calculaArea() {
        double areaCirculo = (2 * raio * Math.PI);
        return areaCirculo * areaCirculo;
    }
}
