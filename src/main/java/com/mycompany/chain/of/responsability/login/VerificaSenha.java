/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chain.of.responsability.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author igor_
 */
public class VerificaSenha {
    public boolean aprovado = false;
    public String senha;
    
    public VerificaSenha(String senha){
        this.senha = senha;
        if(verificarSenha(senha)){
            VerificaMinusculo verifica = new VerificaMinusculo(senha);
        }else{
            System.out.println("Senha não tem numero");
        }
    }
    
    private boolean verificarSenha(String senha){
        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        matcher.find();
        try{
            matcher.start();
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
