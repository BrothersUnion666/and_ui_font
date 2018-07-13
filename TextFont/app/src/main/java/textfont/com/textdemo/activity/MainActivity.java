package textfont.com.textdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import textfont.com.textdemo.R;
import textfont.com.textdemo.adapter.TextFontAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<String> mTextLists;
    private TextFontAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListener();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recycler_view);
    }

    private void initData() {
        //1、后面还有文字效果可相继添加在这儿
        mTextLists = new ArrayList<>();
        mTextLists.add("文字粒子效果");
        mTextLists.add("文字上下跳动");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new TextFontAdapter(getApplicationContext(), mTextLists);
        mRecyclerView.setAdapter(mAdapter);
    }


    private void initListener() {
        mAdapter.setOnItemClickListener(new TextFontAdapter.ItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                //2、开始跳转到自己添加的界面
                Toast.makeText(getApplicationContext(),"position=" + position,Toast.LENGTH_LONG).show();
                switch (position){
                    case 0:   //文字粒子效果
                        startActivity(new Intent(MainActivity.this,ItemFirstActivity.class));
                        break;
                    case 1:   //文字上下跳动
                        startActivity(new Intent(MainActivity.this,ItemSecondActivity.class));
                        break;
                        default:
                }
            }
        });
    }
}
