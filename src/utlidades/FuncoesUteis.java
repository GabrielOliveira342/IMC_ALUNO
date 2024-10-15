package utlidades;

import java.util.InputMismatchException;

public class FuncoesUteis {

	    // Método para verificar se o CPF é válido
	    public boolean verificarCpf(String cpf) {
	        if (cpf == null || cpf.length() != 11) {
	            return false;
	        }

	        char dig10, dig11;
	        int sm, i, r, num, peso;

	        try {
	            // Cálculo do primeiro dígito verificador
	            sm = 0;
	            peso = 10;
	            for (i = 0; i < 9; i++) {
	                num = (int) (cpf.charAt(i) - 48);
	                sm = sm + (num * peso);
	                peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            dig10 = (r == 10 || r == 11) ? '0' : (char) (r + 48);

	            // Cálculo do segundo dígito verificador
	            sm = 0;
	            peso = 11;
	            for (i = 0; i < 10; i++) {
	                num = (int) (cpf.charAt(i) - 48);
	                sm = sm + (num * peso);
	                peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            dig11 = (r == 10 || r == 11) ? '0' : (char) (r + 48);

	            // Verificação final
	            return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));
	        } catch (InputMismatchException e) {
	            return false;
	        }
	    }

	    // Método para calcular o IMC
	    public double calcularIMC(double peso, double altura) {
	        return peso / (altura * altura);
	    }

	    // Método para avaliar o aluno (nota >= 5 e presença >= 75%)
	    public String avaliarAluno(double nota, double percentualPresenca) {
	        if (nota >= 5 && percentualPresenca >= 75) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }
	}

