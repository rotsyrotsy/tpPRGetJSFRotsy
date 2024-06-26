/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mbds.tpprgetjsf.jsf;

import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;

/**
 * Backing bean des pages formulaire_4.xhtml et affichage_4.xhtml
 *
 * @author Rotsy
 */
@Named(value = "newbean")
@RequestScoped
public class NewBean {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage_4?nb=" + nombre + "&amp;faces-redirect=true";
    }
    public String afficherExercice4() {
        return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
    }

}
