package com.dev777popov.testmvpgeekbrains.standart.presenter;

import com.dev777popov.testmvpgeekbrains.standart.model.Model;
import com.dev777popov.testmvpgeekbrains.standart.view.MainView;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }

    public void onBtnAddClick() {
        String bufferText = model.getBufferText();
        if (!mainView.getTextEdit().equals("")) {
            bufferText += mainView.getTextEdit();
            mainView.setTextPrint(bufferText);
            model.setBufferText(bufferText);
        } else {
            mainView.showToast("Вы не ввели текст!");
        }
    }

}
