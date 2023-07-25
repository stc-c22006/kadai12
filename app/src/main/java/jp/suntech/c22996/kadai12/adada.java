package jp.suntech.c22996.kadai12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

public class adada extends DialogFragment {
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstate){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("内容確認");
        builder.setMessage("これでよろしいですか？");
        builder.setPositiveButton("OK",new DialogButtonClickListener());
        builder.setNegativeButton("キャンセル",new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which){
            String msg="";
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = "内容を確認しました";

                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = "キャンセルしました";
                    break;
            }
            //Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
        }
    }
}
