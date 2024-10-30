package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> carrinhoCompra;

    public CarrinhodeCompras() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoCompra.add(item);
    }

    public void removerItem (String nome) {
        List<Item> listaRemoverItem = new ArrayList<>();
        if (carrinhoCompra.isEmpty()) {
            for (Item i : carrinhoCompra) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    listaRemoverItem.add(i);
                }
            }
            carrinhoCompra.removeAll(listaRemoverItem);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhoCompra.isEmpty()) {
            for (Item item : carrinhoCompra) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinhoCompra.isEmpty()) {
            System.out.println(carrinhoCompra);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhodeCompras{" +
                "carrinhoCompra=" + carrinhoCompra +
                '}';
    }

    public static void main(String[] args) {
        CarrinhodeCompras compras = new CarrinhodeCompras();

        compras.adicionarItem("Capinha S24", 10, 2);
        compras.adicionarItem("Jordan 4 Preto", 1400, 1);
        compras.adicionarItem("Fone QCY" , 100, 1);

        System.out.println(compras.calcularValorTotal());

        compras.adicionarItem("Meias", 25, 16);

        System.out.println(compras.calcularValorTotal());
        compras.exibirItens();
    }
}

