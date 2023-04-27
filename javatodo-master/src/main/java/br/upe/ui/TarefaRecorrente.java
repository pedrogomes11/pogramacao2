package br.upe.ui;

import br.upe.model.Tarefa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class TarefaRecorrente  extends TelaPrincipal {

    Timer timer;
    private int contador = 0;
    private  final int limiteExecucoes = 5;

    public TarefaRecorrente(){
        timer = new Timer();
        timer.schedule(new Tarefa(),0,5000);
    }
    class Tarefa extends TimerTask{


        private String texto;
        private br.upe.model.Tarefa tarefa;

        @Override
        public void run() {
            contador++;
            controlador.getTarefaTableModel();
            controlador.adicionarTarefaAtiva(tarefa);
            if(contador>= limiteExecucoes){
                System.out.println("Limites de tarefas atingidas (5) ");
                parar();
            }
            System.out.println("Tarefa executada");
        }
    }
    public void parar(){
        System.exit(0);
    }

}
