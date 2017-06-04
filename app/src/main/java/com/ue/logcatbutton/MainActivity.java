package com.ue.logcatbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ue.logcatbutton.utils.LogUtils;

/*
* Logcat信息分为好6个级别，分别是：
1. [V]：详细(Verbose)信息,输出颜色为绿色
2. [D]：调试(Debug)信息,输出颜色是蓝色
3. [I]：通告(Info)信息,输出颜色为黑色
4. [W]：警告(Warn)信息,输出颜色为橙色
5. [E]：错误(Error)信息,输出颜色为红色，
6.[Assert]，（断言）信息,新版本加入的。
http://blog.csdn.net/jason_996/article/details/50420336
* */
public class MainActivity extends Activity implements OnClickListener {
    private String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        TextView tvDisplay = (TextView) findViewById(R.id.tv_hint);
        switch (id) {
            case R.id.button1:
            {
                System.out.println("1被点击了");
                tvDisplay.setText("Verbose");
                LogUtils.v(TAG,"我是v级别");
                break;
            }
            case R.id.button2:
            {
                tvDisplay.setText("Debug");
                Toast.makeText(MainActivity.this, "Debug级别", Toast.LENGTH_SHORT).show();
                LogUtils.d(TAG,"我是d级别");
                break;
            }
            case R.id.button3:
            {
                tvDisplay.setText("Info");
                LogUtils.i(TAG,"我是i级别");
                break;
            }
            case R.id.button4:
            {
                tvDisplay.setText("Warn");
                LogUtils.w(TAG,"我是w级别");
                break;
            }
            case R.id.button5:
            {
                tvDisplay.setText("Error");
                LogUtils.e(TAG,"我是e级别");
                break;
            }
            default:
                break;
        }
    }
}
