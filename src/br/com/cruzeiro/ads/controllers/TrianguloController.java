package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Triangulo;
import br.com.cruzeiro.ads.views.TrianguloView;

public class TrianguloController {

    private Triangulo model;
    private TrianguloView view;

    public TrianguloController(Triangulo model, TrianguloView view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        model.setAltura(view.getValueAltura());
        model.setBase(view.getValueBase());
        model.setLado(view.getValueLado());
    }

    public void updateView() {
        view.result(model.calculoArea(), model.calculoPerimetro());
    }
}
