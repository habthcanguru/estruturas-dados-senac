package com.example;

public class CalculoNotas {
    public class Main {
        public static void main(String[] args) {
            int[] alunos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

            double[] atividade1 = {10,2,4,3,5,8,2,8,0,0,1,2,0,0,0};
            double[] atividade2 = {0,0,0,4,5,6,4,3,2,4,0,0,0,0,0};
            double[] atividade3 = {4,0,0,3,3,3,5,6,2,9,9,9,4,5,3};
            double[] atividade4 = {1,2,3,4,5,9,3,5,3,2,4,5,7,8,9};

            double[] avaliacao1 = {3,4,3,2,3,4,5,6,4,3,4,6,10,2,3};
            double[] avaliacao2 = {10,2,3,4,2,0,3,5,7,8,6,4,5,6,7};

            double[] medias = new double[15];

            for (int i = 0; i < alunos.length; i++) {
                double soma = atividade1[i] + atividade2[i] + atividade3[i] + atividade4[i] + avaliacao1[i] + avaliacao2[i];

                medias[i] = soma / 6.0;
                System.out.println(medias[i]);
            }
        }
    }
}