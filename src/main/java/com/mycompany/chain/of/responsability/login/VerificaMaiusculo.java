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
public class VerificaMaiusculo {
    public boolean aprovado = false;
    public String senha;
    
    public VerificaMaiusculo(String senha){
        this.senha = senha;
        if(verificarSenha(senha)){
            VerificaMaiusculo verifica = new VerificaMaiusculo(senha);
        }else{
            System.out.println("Senha não tem uma letra minuscula");
        }
    }
    
    private boolean verificarSenha(String senha){
        String regex = "[A|B||C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z|Ç]";
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
