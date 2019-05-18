package com.example.noticeboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        ... 코드 계속
        리사이클러뷰에 표시할 데이터 리스트 생성.
        */

        super.onCreate(savedInstanceState);

        //메인 레이아웃 출력
        setContentView(R.layout.content_main);

        //뷰홀더 갯수
        ArrayList<NoticeData> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(new NoticeData(i ,"시작","임성범"));
        }

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        SimpleTextAdapter adapter = new SimpleTextAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
