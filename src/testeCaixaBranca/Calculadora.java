package testeCaixaBranca;

public class Calculadora {

	
	private int soma;
	private int div;
	private int sub;
	private int mult;
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public int getDiv() {
		return div;
	}
	public void setDiv(int div) {
		this.div = div;
	}
	public int getSub() {
		return sub;
	}
	public void setSub(int sub) {
		this.sub = sub;
	}
	public int getMult() {
		return mult;
	}
	public void setMult(int mult) {
		this.mult = mult;
	}
	
	public int soma(int x, int y) {
	int soma = x +y;
	return soma;
}
public int multiplica(int x, int y) {
	int multiplica = x *y;
	return multiplica;
}
public int divide(int x, int y) {
	
	return x/y;
}
public int subtrai(int x, int y) {
	
	return x-y;
}

	
	
	
	
	
	
	
}