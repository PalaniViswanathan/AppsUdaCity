package com.techlink.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.techlink.helpers.CommonHelper;

public class PortfolioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_main, menu);
        return true;
    }

    public void onButtonClick(View view){
        Button sportyButton = (Button) view;

        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.label_selctedmessageprefix));
        sb.append(CommonHelper.Space);
        sb.append(CommonHelper.getStringResourceByName(getResources()
                .getResourceEntryName(sportyButton.getId()), getPackageName(), "string", this));
        sb.append(CommonHelper.Space);
        sb.append(getString(R.string.label_appescalmation));

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
