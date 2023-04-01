package in.bitcode.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkSettings = findViewById(R.id.chkSettings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        mt("onCreateOptionsMenu");

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity, menu);

        menu.setGroupCheckable(R.id.commonGroup, true, true);
        //menu.setGroupDividerEnabled(true);

        /*MenuItem menuItem = menu.add(0, 1, 1, "Info");
        menuItem.setCheckable(true);
        menuItem.setChecked(true);
        menuItem.setAlphabeticShortcut('i');
        menuItem.setIcon(R.mipmap.ic_launcher);
        menuItem.setEnabled(true);

        menu.add(0, 2, 0, "Help");
        SubMenu subMenu = menu.addSubMenu(1, 3, 2, "Settings");
        subMenu.add(2, 11, 0, "System Settings");
        subMenu.add(2, 12, 0, "Phone Settings");*/

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mt("onPrepareOptionsMenu");

        //menu.findItem(3).setEnabled(chkSettings.isChecked());
        menu.findItem(R.id.menuItemSettings).setEnabled(chkSettings.isChecked());



        /*MenuItem menuItemSettings = menu.findItem(3);

        if(chkSettings.isChecked()) {
            menuItemSettings.setEnabled(true);
        }
        else {
            menuItemSettings.setEnabled(false);
        }*/

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuItemInfo:
                mt("Info selected");
                break;
            case R.id.menuItemHelp:
                mt("Help selected");
                break;
            case R.id.menuItemSettings:
                mt("Settings selected");
                break;
            case R.id.menuItemSystemSettings:
                mt("System Settings selected");
                break;
            case R.id.menuItemPhoneSettings:
                mt("Phone Settings selected");
                break;
        }

        /*switch (item.getItemId()) {
            case 1 :
                mt("Info selected");
                break;
            case 2 :
                mt("Help selected");
                break;
            case 3 :
                mt("Settings selected");
                break;
            case 11 :
                mt("System Settings selected");
                break;
            case 12 :
                mt("Phone Settings selected");
                break;
        }*/


        return true;
    }

    protected void mt(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}





