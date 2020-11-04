package br.ufjf.dcc193;

public class Retangulo {

    private double altura;
    private double largura;
    private double profundidade;
    private double volume;

    public Retangulo() {
        this.altura = 0;
        this.largura = 0;
        this.profundidade = 0;
    }
    
    public Retangulo(int x, int y, int z) {
        this.altura = x;
        this.largura = y;
        this.profundidade = z;
    }

    public double calculaVolume() {
        this.volume = this.altura * this.largura * this.profundidade;
        return this.volume;
    }
}
