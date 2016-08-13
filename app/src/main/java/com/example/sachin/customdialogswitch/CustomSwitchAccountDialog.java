package com.example.sachin.customdialogswitch;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Administrator on 8/11/2016.
 */
public class CustomSwitchAccountDialog extends Dialog  {

    private Context mContext;
    ListView lv;
    private ArrayList<String> mobile,name;
    private ArrayList<Integer> images;

    public CustomSwitchAccountDialog(Context context,ArrayList<String> mobile,ArrayList<String> name,ArrayList<Integer> images) {
        super(context);
        mContext = context;
        this.mobile = mobile;
        this.name = name;
        this.images = images;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.custom_switch_account_dialog);

        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.gravity = Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL;

        if (mContext != null) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        }

        getWindow().setAttributes(layoutParams);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        setCanceledOnTouchOutside(true);

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapterSwitchUser(mContext,name,mobile,images));

    }

    /*@Override
    public void onClick(View v) {

        if (v.getId() == R.id.yes) {
            Intent intent = new Intent(mContext, OTPActivity.class);

            Bundle bundle = new Bundle();
            bundle.putBoolean("check", true);

            intent.putExtra("check for OTP activity", bundle);

            if (intent != null) {

                mContext.startActivity(intent);
                dismiss();

            }
        } else {
            //do nothing
            dismiss();
        }


    }*/


}