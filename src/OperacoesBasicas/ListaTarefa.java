package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao))
            tarefaParaRemover.add(t);{

            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }
}
