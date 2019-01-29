package com.fangwolf.fastgo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fangwolf.fastgo.activity.ButtonActivity;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @Auther 獠牙血狼
 * @Date 2019/1/29
 * @Desc home
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_go_button)
    Button btnGoButton;
    @BindView(R.id.btn_go_empty)
    Button btnGoEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_go_button, R.id.btn_go_empty})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_go_button:
                startActivity(new Intent(this, ButtonActivity.class));
                break;
            case R.id.btn_go_empty:
                break;
        }
    }
}
