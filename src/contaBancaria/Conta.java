package contaBancaria;

public class Conta {
	private int numero;
	private String name;
	private double inicial;
	private double saldo;
	private double deposito;
	private double saque;

	public Conta() {

	}

	public Conta(int numero, String name) {
		this.numero = numero;
		this.name = name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInicial(double inicial) {
		this.inicial = inicial;
		saldo += inicial;

	}

	public double getSaldo() {
		return saldo;

	}

	public String getName() {
		return name;
	}

	public int getNumero() {
		return numero;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
		saldo += deposito;
	}

	public void setSaque(double saque) {
		this.saque = saque;
		saldo -= saque + 5;

	}

	public String toString() {
		return String.format("Conta: %d%nTitular: %s%nSaldo: %.2f", getNumero(), getName(), getSaldo());
	}

}
