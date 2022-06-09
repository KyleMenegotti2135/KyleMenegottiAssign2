// Kyle Menegotti, N01462135, Section RNB

package kyle.menegotti.n01462135;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
            case R.id.KyleMenuItem1:
                gotoUrl();
                break;

            case R.id.KyleMenuItem2:
                gotomain();
                break;

            case R.id.KyleMenuItem3:
                gotoCall();
                break;

            case android.R.id.home:
                finish();
                return true;
            default:

                return super.onOptionsItemSelected(menuitem);
        }
        return true;
    }

    private void gotoUrl()
    {
        Uri uri = Uri.parse("https://rentals.ca/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    private void gotoCall()
    {
        Uri uri = Uri.parse("tel:416-555-555");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    private void gotomain()
    {
        Intent intent = new Intent(MenuActivity.this,MenegottiActivity.class);
        startActivity(intent);
    }


}