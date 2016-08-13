package com.example.sachin.customdialogswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListPhoneNo,arrayListFname;
    ArrayList<Integer> arrayListimages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListPhoneNo = new ArrayList<>();
        arrayListFname = new ArrayList<>();
        arrayListimages = new ArrayList<>();

        arrayListPhoneNo.add("9811123321");
        arrayListPhoneNo.add("9811123323");
        arrayListPhoneNo.add("98111233221");
        arrayListPhoneNo.add("981112332123");
        arrayListPhoneNo.add("981112332132");

        arrayListFname.add("Sachin");
        arrayListFname.add("Sk");
        arrayListFname.add("Manager");
        arrayListFname.add("Kk");
        arrayListFname.add("Kumar");

        arrayListimages.add(R.mipmap.ic_launcher);
        arrayListimages.add(R.mipmap.ic_launcher);
        arrayListimages.add(R.mipmap.ic_launcher);
        arrayListimages.add(R.mipmap.ic_launcher);
        arrayListimages.add(R.mipmap.ic_launcher);

        CustomSwitchAccountDialog customSwitchAccountDialog = new CustomSwitchAccountDialog(this, arrayListPhoneNo, arrayListFname, arrayListimages);
        customSwitchAccountDialog.show();
    }
}
