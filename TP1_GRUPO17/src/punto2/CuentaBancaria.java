package punto2;

public class CuentaBancaria {
  private static long ultimoNumeroCuenta = 100000;
  private long numeroCuenta;
  private long dniCliente;
  private double saldoActual;
  private double interesAnual; 

  // Constructor por defecto
  public CuentaBancaria() {
    this.numeroCuenta = ++ultimoNumeroCuenta;
    this.dniCliente = 0;
    this.saldoActual = 0.0;
    this.interesAnual = 0.0;
  }

  // Constructor con dni, saldo e interés
  public CuentaBancaria(long dniCliente, double saldoActual, double interesAnual) {
    this.numeroCuenta = ++ultimoNumeroCuenta;
    this.dniCliente = dniCliente;
    this.saldoActual = saldoActual;
    this.interesAnual = interesAnual;
  }

  // Actualizar el saldo aplicando el interés diario
  public void actualizarSaldo() {
    double interesDiario = interesAnual / 365 / 100;
    this.saldoActual += this.saldoActual * interesDiario;
  }

  // Ingresar una cantidad en la cuenta
  public void ingresar(double cantidad) {
    if (cantidad > 0) {
      this.saldoActual += cantidad;
    } else {
      System.out.println("La cantidad a ingresar debe ser positiva.");
    }
  } 

  // Retirar una cantidad de la cuenta
  public void retirar(double cantidad) {
    if (cantidad > 0) {
      if (this.saldoActual >= cantidad) {
        this.saldoActual -= cantidad;
      } else {
        System.out.println("Fondos insuficientes.");
      }
    } else {
      System.out.println("La cantidad a retirar debe ser positiva.");
    }
  }

  // Mostrar todos los datos de la cuenta
  public void mostrarDatos() {
    System.out.println("Número de cuenta: " + this.numeroCuenta);
    System.out.println("DNI del cliente: " + this.dniCliente);
    System.out.println("Saldo actual: $" + this.saldoActual);
    System.out.println("Interés anual: " + this.interesAnual + "%");
  }

  //Getters y Setters
  public long getNumeroCuenta() {
    return numeroCuenta;
  }

  public long getDniCliente() {
    return dniCliente;
  }

  public void setDniCliente(long dniCliente) {
    this.dniCliente = dniCliente;
  }

  public double getSaldoActual() {
    return saldoActual;
  }

  public void setSaldoActual(double saldoActual) {
    this.saldoActual = saldoActual;
  }

  public double getInteresAnual() {
    return interesAnual;
  }

  public void setInteresAnual(double interesAnual) {
    this.interesAnual = interesAnual;
  }
}
