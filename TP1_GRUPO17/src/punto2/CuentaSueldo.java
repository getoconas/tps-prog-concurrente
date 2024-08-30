package punto2;

import java.util.Random;

public class CuentaSueldo extends CuentaBancaria {
  private int legajo;
  private String institucion;
  private String beneficios;
  private long CBU;
  private double tope;

  // Constructor por defecto
  public CuentaSueldo() {
    super();
    this.legajo = 0;
    this.institucion = "";
    this.beneficios = "";
    this.CBU = 0;
    this.tope = 15000.0;
  }

  // Constructor que utiliza los datos de CuentaBancaria
  public CuentaSueldo(long dni, double saldoActual, double interes, int legajo, String institucion, String beneficios) {
    super(dni,saldoActual,interes);
    this.CBU = this.generarCBU();
    this.legajo = legajo;
    this.institucion = institucion;
    this.beneficios = beneficios;
    this.tope = 15000.0;
  }
  
  // Genera un cbu de 18 digitos numericos
  private long generarCBU() {
    Random random = new Random();
    return (long) (random.nextDouble()*Math.pow(10,18));
  }

  // Sobrescribe el método retirar
  @Override
  public void retirar(double cantidad) {
    if (cantidad > 0) {
      if (cantidad <= tope) {
        if (getSaldoActual() >= cantidad) {
          setSaldoActual(getSaldoActual() - cantidad);
          System.out.println("Retiro realizado exitosamente. Saldo actual: $" + getSaldoActual());
        } else {
          System.out.println("Fondos insuficientes.");
        }
      } else {
        System.out.println("La cantidad excede el tope permitido de $" + tope);
      }
    } else {
      System.out.println("La cantidad a retirar debe ser positiva.");
    }
  }

  // Transferencia por CBU
  public void transferir(double monto, long CBU) {
    if (monto > 0) {
      if (getSaldoActual() >= monto) {
        setSaldoActual(getSaldoActual() - monto);
        System.out.println("Transferencia de $" + monto + " realizada al CBU " + CBU);
        System.out.println("Saldo actual: $" + getSaldoActual());
      } else {
        System.out.println("Fondos insuficientes para realizar la transferencia.");
      }
    } else {
      System.out.println("El monto a transferir debe ser positivo.");
    }
  }

  // Transferencia por alias
  public void transferir(double monto, String alias) {
    if (monto > 0) {
      if (getSaldoActual() >= monto) {
        setSaldoActual(getSaldoActual() - monto);
        System.out.println("Transferencia de $" + monto + " realizada al alias " + alias);
        System.out.println("Saldo actual: $" + getSaldoActual());
      } else {
        System.out.println("Fondos insuficientes para realizar la transferencia.");
      }
    } else {
      System.out.println("El monto a transferir debe ser positivo.");
    }
  }

  // Mostrar todos los datos de la cuenta
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Legajo: " + this.legajo);
    System.out.println("Institución: " + this.institucion);
    System.out.println("Beneficios: " + this.beneficios);
    System.out.println("CBU: " + this.CBU);
    System.out.println("Tope de retiro: $" + this.tope);
  }

  // Getters y Setters
  public int getLegajo() {
    return legajo;
  }

  public void setLegajo(int legajo) {
    this.legajo = legajo;
  }

  public String getInstitucion() {
    return institucion;
  }

  public void setInstitucion(String institucion) {
    this.institucion = institucion;
  }

  public String getBeneficios() {
    return beneficios;
  }

  public void setBeneficios(String beneficios) {
    this.beneficios = beneficios;
  }

  public long getCBU() {
    return CBU;
  }

  public void setCBU(long CBU) {
    this.CBU = CBU;
  }

  public double getTope() {
    return tope;
  }

  public void setTope(double tope) {
    this.tope = tope;
  }
}
