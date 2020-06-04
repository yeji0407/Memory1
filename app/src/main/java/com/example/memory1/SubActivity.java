//작성자:2018038060 홍예지
//프로그램명: Memory1
//파일명: SubActivity.java
//프로그램 설명: 기억력 게임(1)의 서브 액티비티. (점수 출력 창)
package com.example.memory1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //MainActivity.java로부터 전달받은 score변수를 통해 점수를 띄운다
        TextView txt=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        int score=intent.getExtras().getInt("score");
        txt.setText(String.valueOf(score)+"점입니다");
    }
}
