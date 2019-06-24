package com.example.toggle_button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton1,toggleButton2;
    private Button ButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }
//getting the togglebutton and button instance from layout.xml file.
    public void addListenerOnButtonClick()
        {
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        ButtonSubmit = (Button) findViewById(R.id.button);


        //Performing action on button click.
        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("toggleButton1 : ").append(toggleButton1.getText());
                result.append("\n toggleButton2 : ").append(toggleButton2.getText());

                //displaying message
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG).show();

            }
        });

        }
}
// toggle_button and switch are subclass of compound_button class.
