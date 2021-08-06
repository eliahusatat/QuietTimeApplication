package com.example.quiettimeapplication;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_home:
                displayMessage("home option");
                return true;
                case R.id.action_black_list:
                displayMessage("black list option");
                    openBlackListActivity();
                return true;
            case R.id.action_white_list:
                displayMessage("white list option");
                openWhiteListActivity();
                return true;
            case R.id.action_settings:
                displayMessage("settings option");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void displayMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    private void openBlackListActivity(){
        startActivity(new Intent(this, BlackListActivity.class));
    }
    private void openWhiteListActivity(){
        startActivity(new Intent(this, WhiteListActivity.class));
    }
}
