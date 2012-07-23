package net.takaiwa.customwidthdialogalert;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // サイズ指定はダイアログ側に任せて表示する場合
        new CustomAlertDialog(this);

        // Activityでサイズを指定して表示する場合
//        WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
//        Display disp = wm.getDefaultDisplay();
//        int width = (int)(disp.getWidth() * 0.8);
//        // 画面幅80%で表示
//        new CustomAlerDialog(this, width);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }


}
