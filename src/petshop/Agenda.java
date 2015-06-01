/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author info206
 */
public class Agenda {
    
    String horario,animal,servico;
    int id;

    public Agenda(String horario, String animal, String servico, int id) {
        this.horario = horario;
        this.animal = animal;
        this.servico = servico;
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
