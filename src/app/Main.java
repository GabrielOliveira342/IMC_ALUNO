package app;

import model.Aluno;
import utlidades.FuncoesUteis;


public class Main {

	public static void main(String[] args) {
		FuncoesUteis funcoes = new FuncoesUteis();

        // teste para validação do CPF
        String cpf = "12345678909"; // Um CPF exemplo
        System.out.println("CPF válido? " + funcoes.verificarCpf(cpf));

        // criando um aluno
        Aluno aluno = new Aluno("Maria Silva", "12345678909", 70.0, 1.65, 7.5, 80.0);

        // testando o cálculo de IMC
        double imc = funcoes.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC de " + aluno.getNome() + ": " + imc);

        // aporvação para o aluno
        String avaliacao = funcoes.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Avaliação do aluno: " + avaliacao);// TODO Auto-generated method stub

	}

}
