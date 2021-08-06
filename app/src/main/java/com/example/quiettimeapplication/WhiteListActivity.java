package com.example.quiettimeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.os.Bundle;
import android.view.View;

import com.example.quiettimeapplication.databinding.ActivityBlackListBinding;
import com.example.quiettimeapplication.databinding.ActivityWhiteListBinding;
import com.google.android.material.snackbar.Snackbar;

public class WhiteListActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityWhiteListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_list);
        binding = ActivityWhiteListBinding.inflate(getLayoutInflater());
        setSupportActionBar(binding.toolbar);
    }




}