package br.upe;

import br.upe.ui.TarefaRecorrente;
import br.upe.ui.TelaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaPrincipal pnlMain = new TelaPrincipal();
        TarefaRecorrente tarefa = new TarefaRecorrente();

        JFrame frame = new JFrame("ToDo");
        frame.setContentPane(pnlMain.getPnlMain());
        frame.pack();
        frame.setVisible(true);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}