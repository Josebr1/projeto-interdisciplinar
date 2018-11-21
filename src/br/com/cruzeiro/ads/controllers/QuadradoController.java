package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Quadrado;
import br.com.cruzeiro.ads.views.QuadradoView;

public class QuadradoController {

    private Quadrado model;
    private QuadradoView view;

    public QuadradoController(Quadrado model, QuadradoView view) {
        this.model = model;
        this.view = view;
    }

    private void init() {
        model.setLado(view.getValueLado());
    }

    private void updateView() {
        view.result(model.calculoArea(), model.calculoPerimetro());
    }

    public void exec() {
        init();
        updateView();
    }
}
