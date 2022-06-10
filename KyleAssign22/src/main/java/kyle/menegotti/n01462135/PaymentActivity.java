// Kyle Menegotti, N01462135, Section RNB

package kyle.menegotti.n01462135;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class PaymentActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ImageButton btn = findViewById(R.id.KylePayButton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkFirstName())
                    if(checkLastName())
                        if(checkCardNo())
                            alertDialog();

            }
        });

    }

    private boolean checkFirstName()
    {

        EditText FName = findViewById(R.id.KyleEdit);

        String fname = (FName.getText().toString());


        if (fname.isEmpty())
        {
            FName.setError(getString(R.string.errorThree));
            return false;
        }

        else if (fname.length() < 3)
        {
            FName.setError(getString(R.string.errorOne));
            return false;
        }


        else if(fname.matches("^[0-9]$"))
        {
            FName.setError(getString(R.string.errorTwo));
            return false;
        }

        else
            return true;

    }

    private boolean checkLastName()
    {

        EditText LName = findViewById(R.id.KyleEditTextLast);

        String lname = (LName.getText().toString());


        if (lname.isEmpty())
        {
            LName.setError(getString(R.string.lasterrorThree));
            return false;
        }

        else if (lname.length() < 3)
        {
            LName.setError(getString(R.string.lasterrorOne));
            return false;
        }

        else if(lname.matches("^[0-9]$"))
        {
            LName.setError(getString(R.string.lasterrorTwo));
            return false;
        }


        else
            return true;
    }


    private boolean checkCardNo()
    {
        EditText CNumber = findViewById(R.id.KyleEditTextCard);
        Editable cNumber = CNumber.getText();

        if(cNumber.length() == 0)
        {
            CNumber.setError(getString(R.string.errorOkay));
            return false;
        }


        else
            return true;
    }


    private void alertDialog() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Your request is being processed");
        dialog.setTitle("Dialog Box");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,int which)
                    {
                        Intent intent = new Intent(PaymentActivity.this,MenegottiActivity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }



}