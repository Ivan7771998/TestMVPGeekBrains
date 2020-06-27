package com.dev777popov.testmvpgeekbrains.moxy.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dev777popov.testmvpgeekbrains.R;
import com.dev777popov.testmvpgeekbrains.moxy.presenter.PresenterMoxy;

import butterknife.BindView;
import butterknife.ButterKnife;
import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class ActivityMoxy extends MvpAppCompatActivity implements MoxyView {

    @BindView(R.id.editAddText)
    EditText editAddText;

    @BindView(R.id.btnAdd)
    Button btnAdd;

    @BindView(R.id.textPrint)
    TextView textPrint;

    @InjectPresenter
    PresenterMoxy presenterMoxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnClick();
    }

    private void btnClick() {
        btnAdd.setOnClickListener(v -> presenterMoxy.onBtnAddClick(editAddText.getText().toString()));
    }

    @Override
    public void setTextPrint(String text) {
        textPrint.setText(text);
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
