package com.example.manjubs.dialogproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Dialog Box function
    public void ShowDialog(View view){
        CustomDialogView cd=new CustomDialogView();
        cd.show(getSupportFragmentManager(),"my_dialog");
    }
}
