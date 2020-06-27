package com.dev777popov.testmvpgeekbrains.standart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dev777popov.testmvpgeekbrains.R;
import com.dev777popov.testmvpgeekbrains.standart.presenter.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.editAddText)
    EditText editAddText;

    @BindView(R.id.btnAdd)
    Button btnAdd;

    @BindView(R.id.textPrint)
    TextView textPrint;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter = new MainPresenter(this);
        btnClick();
    }

    private void btnClick() {
        btnAdd.setOnClickListener(v -> mainPresenter.onBtnAddClick());
    }

    @Override
    public String getTextEdit() {
        return editAddText.getText().toString();
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