package com;

public class ListaLigada {
    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    public static void main(String[] args) {
        No inicio = null;

        inicio = inserirNoFim(inicio, 20);
        
        exibir(inicio);

        buscar(inicio, 10);

        inicio = remover(inicio, 20);

        buscar(inicio, 20);
    }

    public static No inserirNoFim(No inicio, int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            return novo;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
        return inicio;
    }

    public static No remover(No inicio, int valor) {
        if (inicio == null) {
            return null;
        }

        if (inicio.valor == valor) {
            return inicio.proximo;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }

        return inicio;
    }

    public static boolean buscar(No inicio, int valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public static void exibir(No inicio) {
        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

        System.out.println();
    }
    
    
}
