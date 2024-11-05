package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        integerList = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (!integerList.isEmpty()) {
            List<Integer> ascendente = new ArrayList<>(integerList);
            Collections.sort(ascendente);
            return ascendente;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> ordenarDecrescente () {
        if (!integerList.isEmpty()) {
            List<Integer> decrescente = new ArrayList<>(integerList);
            decrescente.sort(Collections.reverseOrder());
            return decrescente;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        for (int i = 0; i <= 10; i++) {
            ordenacaoNumeros.adicionarNumero(i);
        }

        System.out.println(ordenacaoNumeros.ordenarDecrescente());
        System.out.println(ordenacaoNumeros.ordenarAscendente());
    }
}
