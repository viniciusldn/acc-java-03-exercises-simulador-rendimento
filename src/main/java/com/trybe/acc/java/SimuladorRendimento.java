package com.trybe.acc.java;

import java.time.LocalDateTime;

// TODO: Auto-generated Javadoc
/**
 * The Class SimuladorRendimento.
 */
public class SimuladorRendimento {

  /** The data atual. */
  private LocalDateTime dataAtual = LocalDateTime.now();

  /** The ano atual. */
  private int anoAtual = dataAtual.getYear();

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }

  /**
   * Simular rendimento anos.
   *
   * @param investimento the investimento
   * @param objetivo     the objetivo
   * @return the int
   */
  public int simularRendimentoAnos(double investimento, double objetivo) {
    int anoObjetivo = this.anoAtual;
    while (investimento <= objetivo) {
      investimento *= 1.1;
      anoObjetivo++;
    }
    return anoObjetivo;
  }

}
