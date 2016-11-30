package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TheFirstButton(View view) {
        display("    This button will launch my app:    \n    热门电影    ");
    }

    public void TheSecondButton(View view) {
        display("    This button will launch my app:    \n    股票雄鹰    ");
    }

    public void TheThirdButton(View view) {
        display("    This button will launch my app:    \n    XYZ 阅读器    ");
    }

    public void TheFourthButton(View view) {
        display("    This button will launch my app:    \n    最新闻    ");
    }

    public void TheFifthButton(View view) {
        display("    This button will launch my app:    \n    毕业设计    ");
    }

    public void display(String massage) {
        TextView massageTextView = (TextView) findViewById(R.id.ShowMassage);
        massageTextView.setText(massage);
    }
}
