package model;

public class Aluno extends Pessoa {
	 
		private double nota;
	    private double percentualPresenca;

	    // Construtor
	    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
	        super(nome, cpf, peso, altura);
	        this.nota = nota;
	        this.percentualPresenca = percentualPresenca;
	    }

	    // Getters e Setters
	    public double getNota() {
	        return nota;
	    }

	    public void setNota(double nota) {
	        this.nota = nota;
	    }

	    public double getPercentualPresenca() {
	        return percentualPresenca;
	    }

	    public void setPercentualPresenca(double percentualPresenca) {
	        this.percentualPresenca = percentualPresenca;
	    }
	}

