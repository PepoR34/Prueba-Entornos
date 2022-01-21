package PruebasE4;

import java.util.Scanner;

public class CuentaBancaria {

	public static int c = 0;
	public static int getC() { return c; }

	private String titular;
	public String getTitular() { return titular; }
	public void setTitular(String titular) {this.titular = titular;}

	private int nCuenta;
	public int getnCuenta() { return nCuenta; }
	public void setnCuenta(int nCuenta) { this.nCuenta = nCuenta; }

	private double saldo;
	public double getSaldo() { return saldo; }

	private int pin;
	public void setSaldo(int pin) { this.pin = pin; }

	private static Scanner sc = new Scanner( System.in );

	public CuentaBancaria(String titular, double saldo,  int pin) throws IllegalArgumentException {
		if(titular == null || titular.isEmpty() || titular.isBlank()) {
			throw new IllegalArgumentException("Titular obligatorio");
		}
		this.titular = titular;
		this.nCuenta = c++;
		this.saldo = saldo;
		this.pin = pin;
	}
	public static void main(String[] args) {
		CuentaBancaria cb1 = new CuentaBancaria("Yo", 10, 123);
		System.out.printf("\n(titular: %s, saldo: %,10.2f, cuenta: %010d)", cb1.titular, cb1.saldo, cb1.nCuenta);

		CuentaBancaria cb2 = new CuentaBancaria("Tú", 50, 456);
		System.out.printf("\n(titular: %s, saldo: %,10.2f, cuenta: %010d)", cb2.titular, cb2.saldo, cb2.nCuenta);

	}

	public void depositar(double importe) throws IllegalArgumentException {
		if(importe <= 0) {
			throw new IllegalArgumentException("Importe debe ser mayor de 0");
		}
		saldo += importe;
	}

	public void retirar(double importe) throws IllegalArgumentException {
		if(importe > saldo || importe <= 0) {
			throw new IllegalArgumentException("Importe debe ser mayor de 0");
		}
		saldo -= importe;
	}
	
	public void transferir(double importe, CuentaBancaria destino) {
		if( importe > saldo || destino==null ) {
			
		}
	}
}

/*		System.out.println("PIN: ");
		int pin = sc.nextInt();
		if( pin == this.pin ) {
		
		*/
