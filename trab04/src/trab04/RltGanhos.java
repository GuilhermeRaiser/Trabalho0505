package trab04;

import java.io.PrintStream;

public class RltGanhos{
	 private String[] Rltnome1 = new String[100];
	    private String[] Rlttipo1 = new String[100];
	    private String[] Rltdata1 = new String[100];
	    private double[] Rltvalor1 = new double[100];

	    private String[] Rltrelatorio1 = new String[100];

	    public void setRelatorio(String nome, String tipo, String data, double valor, int i){
	        this.nome[i] = Rltnome1;
	        this.tipo[i] = Rlttipo1;
	        this.data[i] = Rltdata1;
	        this.valor[i] = Rltvalor1;
	    }

	    public PrintStream getRelatorio(int i){
	        return (
	                System.out.printf("\n%30s%15s%15s%15.2f \n", this.nome[i], this.tipo[i], this.data[i], this.valor[i])
	        );
	    }

	}

