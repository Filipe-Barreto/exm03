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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
    
}
