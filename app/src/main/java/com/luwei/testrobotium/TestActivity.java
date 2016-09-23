package com.luwei.testrobotium;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class TestActivity extends Activity {

    private static final String TAG = TestActivity.class.getSimpleName();

    @InjectView(R.id.tips)
    TextView textView;

    @InjectView(R.id.input_et)
    TextView editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.inject(this);

        initWidget();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbind();
    }

    public void initWidget() {

    }

    @OnClick(R.id.bind_btn)
    public void bind() {
        WebActivity.navigateTo(this);
    }

    @OnClick(R.id.unbind_btn)
    public void unbind() {
        new AlertDialog.Builder(this).setTitle("hehe").setMessage("Hello").create().show();
    }

    @OnClick(R.id.start_btn)
    public void start() {
        ToastUtil.showToast("Hello world");
    }

    @OnClick(R.id.end_btn)
    public void end() {
        textView.setText("What's up");
    }
}
