package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Paralelepipedo;
import br.com.cruzeiro.ads.views.ParalelepipedoView;

public class ParalelepipedoController {

    private Paralelepipedo model;
    private ParalelepipedoView view;

    public ParalelepipedoController(Paralelepipedo model, ParalelepipedoView view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        model.setComprimento(view.setValueComprimento());
        model.setLargura(view.setValueLargura());
        model.setAltura(view.setValueAltura());
    }

    public void updateView() {
        view.result(model.calculoVolume());
    }
}
