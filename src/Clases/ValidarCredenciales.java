/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import forms.Credenciales;


public class ValidarCredenciales {
    
    private boolean ok;
    private Credenciales cred;

    public ValidarCredenciales(String userName) {
        this.ok = false;
        this.cred = new Credenciales(userName);
        cred.setVisible(true);
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
    
    
}
