package org.example;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class App extends AppCompatActivity {

    private GreetingGenerator greetingGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        greetingGenerator = new GreetingGenerator();

        TextView textView = new TextView(this);
        textView.setText(greetingGenerator.getGreeting());
        setContentView(textView);
    }

    public String getGreeting() {
        return greetingGenerator.getGreeting();
    }
}