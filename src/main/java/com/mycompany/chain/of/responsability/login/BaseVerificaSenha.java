/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chain.of.responsability.login;

/**
 *
 * @author igor_
 */
public abstract class BaseVerificaSenha {
    protected BaseVerificaSenha proximaVerificação;
    
    void setNextVerifica(BaseVerificaSenha verifica){
        this.proximaVerificação = verifica;
  }
}
