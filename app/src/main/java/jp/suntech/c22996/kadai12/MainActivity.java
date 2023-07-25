package jp.suntech.c22996.kadai12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btConfirm);
        //リスナオブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトの取得
        Button btSend = findViewById(R.id.btSend);

        //ボタンにリスナを設定
        btSend.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        //クリアボタンにリスナを設定
        btClear.setOnClickListener(listener);
    }
    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            //名前入力欄であるEdittextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etMail);
            EditText input3 = findViewById(R.id.etMailtitle);
            EditText input4 = findViewById(R.id.etComment);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.btConfirm);

            int id = view.getId();
            String inputStr = input.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            String inputStr4 = input4.getText().toString();

            if(id == R.id.btClear){
                input.setText("");
                input2.setText("");
                input3.setText("");
                input4.setText("");
            } else if (id == R.id.btSend) {
                Snackbar.make(view,"名前>" + inputStr + "  メールタイトル>" + inputStr3 + "  メールアドレス>" + inputStr2 + "  質問内容>" + inputStr4 , Snackbar.LENGTH_LONG).show();
            }else if(id == R.id.btConfirm){
                adada dialogFragment = new adada();
                dialogFragment.show(getSupportFragmentManager(),"OrderConfirmDialogFragment");
                Snackbar.make(view,"名前>" + inputStr + "  メールタイトル>" + inputStr3 + "  メールアドレス>" + inputStr2 + "  質問内容>" + inputStr4 , Snackbar.LENGTH_LONG).show();
            }

        }
    }
}