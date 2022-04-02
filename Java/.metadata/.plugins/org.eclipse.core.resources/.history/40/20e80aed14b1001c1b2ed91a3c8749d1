/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Relogio {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;        
    }

    public Relogio(int hora) {
    	if(hora >= 0 && hora <=24) { //Valida horas
    		this.hora = hora;
    	}
    	else {
    		System.out.println("Valor para horas inválido");
    	}        
    }

    public Relogio(int hora, int minuto) {
    	if (hora >= 0 && hora <= 24){ //Valida horas
            this.hora = hora;
        } 
        else {
            System.out.println("Valor para horas inválido");
        }
        if (minuto >= 0 && minuto <= 60){ //Valida minutos
            this.minuto = minuto;
        } 
        else {
            System.out.println("Valor para minutos inválido");
        }        
    }

    public Relogio(int hora, int minuto, int segundo) {        
        if (hora >= 0 && hora <= 24){ //Valida horas
            this.hora = hora;
        } 
        else {
            System.out.println("Valor para horas inválido");
        }
        if (minuto >= 0 && minuto <= 60){ //Valida minutos
            this.minuto = minuto;
        } 
        else {
            System.out.println("Valor para minutos inválido");
        }
        if (segundo >= 0 && segundo <= 60){ //Valida minutos
            this.segundo = segundo;
        } 
        else {
            System.out.println("Valor para segundos inválido");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
    	if (hora >= 0 && hora <= 60){
            this.hora = hora;
        } 
        else {
            System.out.println("Valor para horas inválido");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 60){
            this.minuto = minuto;
        } 
        else {
            System.out.println("Valor para minutos inválido");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        } 
        else {
            System.out.println("Valor para segundos inválido");
        }
        
    }    
}
