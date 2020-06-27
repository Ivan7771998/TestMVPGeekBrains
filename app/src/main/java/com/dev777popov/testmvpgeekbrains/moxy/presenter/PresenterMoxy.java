package com.dev777popov.testmvpgeekbrains.moxy.presenter;


import com.dev777popov.testmvpgeekbrains.moxy.model.ModelMoxy;
import com.dev777popov.testmvpgeekbrains.moxy.view.MoxyView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class PresenterMoxy extends MvpPresenter<MoxyView> {


    private ModelMoxy model;


    public PresenterMoxy() {
        model = new ModelMoxy();
    }

    public void onBtnAddClick(String textFromEdit) {
        String bufferText = model.getBufferText();
        if (!textFromEdit.equals("")) {
            bufferText += textFromEdit;
            getViewState().setTextPrint(bufferText);
            model.setBufferText(bufferText);
        } else {
            getViewState().showToast("Вы не ввели текст!");
        }
    }
}
