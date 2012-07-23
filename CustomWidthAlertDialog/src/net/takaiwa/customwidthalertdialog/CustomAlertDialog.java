package net.takaiwa.customwidthalertdialog;

import net.takaiwa.customwidthdialogalert.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;

public class CustomAlertDialog extends AlertDialog.Builder {

    /**
     * コンストラクタ
     * ダイアログ側でサイズを指定
     * @param context
     */
    public CustomAlertDialog(Context context) {
        super(context);
        this.showDialog(context, LayoutParams.FILL_PARENT);
    }

    /**
     * コンストラクタ
     * 呼び出し元に指定されたサイズでダイアログを表示
     * @param context
     * @param width
     */
    public CustomAlertDialog(Context context, int width) {
        super(context);
        this.showDialog(context,width);
    }

    private void showDialog(Context context, int width) {

        // XMLファイルからレイアウトを読み込む
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dialog_layout, null);

        setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                /* OKボタンをクリックした時の処理 */
                dialog.cancel();
            }
        });
        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                /* Cancelボタンをクリックした時の処理 */
                dialog.cancel();
            }
        });
//        setTitle("hogehoge");
        setView(view);

        Dialog d = create();
        d.show();
        LayoutParams lp = d.getWindow().getAttributes();
        lp.width = width;
        d.getWindow().setAttributes(lp);
    }


}
