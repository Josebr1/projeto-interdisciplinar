package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Cilindro;
import br.com.cruzeiro.ads.views.CilindroView;

public class CilindroController {
    private Cilindro model;
    private CilindroView view;

    public CilindroController(Cilindro model, CilindroView view){
        this.model = model;
        this.view = view;
    }

    private void init() {
        model.setRaio(view.getValueRaio());
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
