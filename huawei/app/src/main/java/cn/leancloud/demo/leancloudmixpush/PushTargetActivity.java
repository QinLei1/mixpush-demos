package cn.leancloud.demo.leancloudmixpush;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PushTargetActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_push_target);

    String content = this.getIntent().getStringExtra("content");
    System.out.println("received content from Intent Extra: " + content);
  }

  @Override
  protected void onResume() {
    super.onResume();
    System.out.println("onResume");
  }
}
