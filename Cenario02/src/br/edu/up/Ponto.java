package br.edu.up;
public class Ponto {

    private double x;
    private double y;

    public Ponto(){
       double ponto = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void calcularDistancia(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public void calcularDistancia(Ponto ponto){

    }
}

