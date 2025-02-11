package cuentas;
/**
 * Esta clase representa uina cuenta bancaria con operaciones básicas como ingreso,
 * retirada o el estado de la cuenta
 * @author Juan
 * @version 1.0
 * @since 2025
 */
public class CCuenta {

	/**Encapsulados los atributos con private*/
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**Constructor vacio**/
    public CCuenta()
    {
    }

    /**Constructor completo
     * @param nom Nombre del titular de la cuenta
     * @param cue Numero de cuenta
     * @param sal Saldo inicial
     * @param tipo tipo de interes
     * **/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**Metodo que devuelve el estado de la cuenta
     * @return saldo devuelve el saldo actual
     * **/
    public double estado()
    {
        return saldo;
    }

    /**Metodo que ingresa dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception si la cantidad a ingresar es negativa
     * **/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**Metodo con el que se retira dinero
     * @param cantidad Cantidad a retirar
     * @throws Exception si la cantidad a retirar es negativa
     * @throws Exception si la cantidad a retirar es mayor al saldo disponible
     * **/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
