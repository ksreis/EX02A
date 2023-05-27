package aula.kreis;

import kreis.aula.ArvoreInt;

public class Main {
    public static void main(String[] args) {
        // a) Criação do vetor 
        int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};

        // b) Inicialização de uma Árvore
        ArvoreInt arvore = new ArvoreInt();

        // c) Inserção dos dados 
        for (int valor : vetor) {
            arvore.insert(valor);
        }

        // d) pré-ordem, em-ordem e pós-ordem 
        System.out.println("Traversal pré-ordem:");
        arvore.printInOrder();

        System.out.println("\nTraversal em-ordem:");
        arvore.printInOrder();

        System.out.println("\nTraversal pós-ordem:");
        arvore.printInOrder();
    }
}

