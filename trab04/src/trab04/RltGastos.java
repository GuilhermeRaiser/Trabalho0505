package trab04;

import java.io.PrintStream;

public class RltGastos
{
	  private String[] Rltnome = new String[100];
	    private String[] Rlttipo = new String[100];
	    private String[] Rltdata = new String[100];
	    private double[] Rltvalor = new double[100];
	    private String[] Rltpagamento = new String[100];

	    private String[] Rltrelatorio = new String[100];

	    public void setRelatorio(String nome, String tipo, String data, double valor, String pagamento, int i){
	        this.nome[i] = Rltnome;
	        this.tipo[i] = Rlttipo;
	        this.data[i] = Rltdata;
	        this.valor[i] = Rltvalor;
	        this.pagamento[i] = Rltpagamento;
	    }

	    public PrintStream getRelatorio(int i){
	        return (
	                System.out.printf("\n%30s%15s%15s%15.2f%25s \n", this.nome[i], this.tipo[i], this.data[i], this.valor[i], this.pagamento[i])
	                );
	    }

	}

