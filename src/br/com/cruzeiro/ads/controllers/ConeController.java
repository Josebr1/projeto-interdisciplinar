package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Cone;
import br.com.cruzeiro.ads.views.ConeView;

public class ConeController {

    private Cone model;
    private ConeView view;

    public ConeController(Cone model, ConeView view){
        this.model = model;
        this.view = view;
    }

    public void init() {
        model.setRaio(view.setValueRaio());
        model.setAltura(view.setValueAltura());
    }

    public void updateView() {
        view.result(model.calculoVolume());
    }
}
