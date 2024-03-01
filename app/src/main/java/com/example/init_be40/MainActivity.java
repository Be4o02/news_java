package com.example.init_be40;
import com.example.init_be40.newsFragment;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим кнопку по идентификатору
        Button button = findViewById(R.id.button_1);

        // Устанавливаем обработчик нажатия
        // В вашей активности MainActivity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsFragment NewsFragment = new newsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, NewsFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}