package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Equacao2Grau;
import br.com.cruzeiro.ads.views.Equacao2GrauView;

public class Equacao2GrauController {

    private Equacao2Grau model;
    private Equacao2GrauView view;

    public Equacao2GrauController(Equacao2Grau model, Equacao2GrauView view){
        this.model = model;
        this.view = view;
    }

    public void init() {
        view.init();
        model.setA(view.getValueA());
        model.setB(view.getValueB());
        model.setC(view.getValueC());
    }

    public void updateView() {
        view.result(model.delta(), model.temRaizes(), model.calcularX1(), model.calcularX2());
    }
}