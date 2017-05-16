package com.handongkeji.btvdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.nevermore.oceans.widget.BottomTabLayout;
import com.nevermore.oceans.widget.BottomTabView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private BottomTabLayout btl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btl = (BottomTabLayout) findViewById(R.id.btl);
        tv = (TextView) findViewById(R.id.tv);
            
        btl.setOnItemTabClickListener(new BottomTabLayout.OnItemTabClickListener() {
            @Override
            public void onItemTabClick(int position, View itemView) {

                if(itemView instanceof BottomTabView){
                    String tabText = ((BottomTabView) itemView).getTabText();
                    tv.setText(tabText);
                }
                btl.selectItem(itemView);

            }
        });


        btl.selectItem(0);
    }
}
