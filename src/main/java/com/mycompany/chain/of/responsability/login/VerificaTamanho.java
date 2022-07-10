/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chain.of.responsability.login;

/**
 *
 * @author igor_
 */
public class VerificaTamanho {
    public boolean aprovado = false;
    public String senha;
    
    public VerificaTamanho(String senha){
        this.senha = senha;
        if(verificarSenha(senha)){
            CaracterEspecial verifica = new CaracterEspecial(senha);
        }else{
            System.out.println("Senha não tem o tamanho correto (entre 8 e 16)");
        }
    }
    
    private boolean verificarSenha(String senha){
        return !(senha.length() < 8 || senha.length() > 16);
    }
}
