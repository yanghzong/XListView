package com.bwie.day1_rikao;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.xlistview.XListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private XListView xlvShow;
    private Adapter adapter;
    private List<String> list;
    private Handler handler=new Handler();
    private boolean  isLoadMore=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xlvShow = findViewById(R.id.xlv_show);
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("第"+(i+1)+"条数据");
        }
        adapter=new Adapter(this, list);
        xlvShow.setAdapter(adapter);




    }


}
