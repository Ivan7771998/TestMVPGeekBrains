package com.dev777popov.testmvpgeekbrains.moxy.view;


import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MoxyView extends MvpView {

    @StateStrategyType(value = AddToEndStrategy.class)
    void setTextPrint(String text);

    void showToast(String text);

}
