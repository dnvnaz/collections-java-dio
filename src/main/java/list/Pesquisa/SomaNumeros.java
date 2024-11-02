package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer n : numeros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (maiorNumero < n) {
                    maiorNumero = n;
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (menorNumero > n) {
                    menorNumero = n;
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(4);

        somaNumeros.exibirNumeros();

        System.out.println("Soma = " + somaNumeros.calcularSoma());

        System.out.println("Maior numero = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor numero = " + somaNumeros.encontrarMenorNumero());

    }
}
