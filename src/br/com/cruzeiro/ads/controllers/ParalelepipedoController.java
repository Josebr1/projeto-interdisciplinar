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

    private void init() {
        model.setComprimento(view.getValueComprimento());
        model.setLargura(view.getValueLargura());
        model.setAltura(view.getValueAltura());
    }

    private void updateView() {
        view.result(model.calculoVolume());
    }

    public void exec() {
        init();
        updateView();
    }
}
