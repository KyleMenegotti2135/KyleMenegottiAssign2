// Kyle Menegotti N01462135 Section RNB

package kyle.menegotti.n01462135;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class RentActivity extends MenuActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);


        RadioButton Apartment = findViewById(R.id.KyleRadioButton1);
        RadioButton Detached = findViewById(R.id.KyleRadioButton2);
        RadioButton SemiDetached = findViewById(R.id.KyleRadioButton3);
        ImageButton btn = findViewById(R.id.KyleImageButton1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Apartment.isChecked())
                {
                    Intent i = new Intent(RentActivity.this, ApartmentActivity.class);
                    startActivity(i);
                }

                else if (Detached.isChecked())
                {
                    Intent i = new Intent(RentActivity.this, DetachedActivity.class);
                    startActivity(i);
                }

                else if (SemiDetached.isChecked())
                {
                    Intent i = new Intent(RentActivity.this, SemiDetachedActivity.class);
                    startActivity(i);
                }

                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(), "Select an option",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }

            }
        });

    }
}