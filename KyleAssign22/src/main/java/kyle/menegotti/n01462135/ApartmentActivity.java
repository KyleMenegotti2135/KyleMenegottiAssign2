// Kyle Menegotti, N01462135, Section RNB

package kyle.menegotti.n01462135;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ApartmentActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);


        CheckBox OptionOne = findViewById(R.id.KyleCheckBoxOne);
        CheckBox OptionTwo = findViewById(R.id.KyleCheckBoxTwo);
        CheckBox OptionThree = findViewById(R.id.KyleCheckBoxThree);
        Button btn = findViewById(R.id.KyleButton1);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (OptionOne.isChecked() || OptionTwo.isChecked() || OptionThree.isChecked())
                {
                    Intent i = new Intent(ApartmentActivity.this, PaymentActivity.class);
                    startActivity(i);
                }

                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Please choose an option.",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
            }
        });
    }
}