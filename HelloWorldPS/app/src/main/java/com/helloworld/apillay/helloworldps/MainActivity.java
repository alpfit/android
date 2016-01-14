package com.helloworld.apillay.helloworldps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /*
        use version view in java
        VersionView vView = new VersionView(this);
        setContentView(vView);
        setContentView(R.layout.activity_main);
        TextView hwTextView = (TextView)this.findViewById(R.id.idHW);
        try {
            PackageInfo mpackage = getPackageManager().getPackageInfo(getPackageName(),0);
            hwTextView.setText(mpackage.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
