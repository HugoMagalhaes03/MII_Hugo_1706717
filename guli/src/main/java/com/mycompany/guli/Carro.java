/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guli;

/**
 *
 * @author Asus
 */

public class Carro {
    private String marca="audi";
    private String cor="amarelo";
    protected String tipo="Desportivo";
    public String portas="5 portas";
    protected String potencia="500cavalos";
    public String suspensao="baixa";
    
    //metodos
    public void	setabrirporta_passeiro_direita(String x){
        portas=x;
    }
    public void setabrirporta_condutor(String x){
        portas=x;
    }
    public void setabrirporta_passageiro_esquerda(String x){
        portas=x;
    }
    public void setabrirporta_atras_passageiro_direita(String x){
        portas=x;
    }
    private void setabrirporta_mala(String x){
        portas=x;
    }
    protected void setpassar_lomba(String x){
        suspensao=x;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getCor(){
        return cor;
    }
}

