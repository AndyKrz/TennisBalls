package eu.andykrzemien.tennisballsapp;

import static java.util.Objects.*;

import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity{

  ImageButton imgButton;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationView navView = findViewById(R.id.nav_view);
    // Passing each menu ID as a set of Ids because each
    // menu should be considered as top level destinations.
    AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
        R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_dunlop, R.id.navigation_babolat,
        R.id.navigation_head, R.id.navigation_robinsoderling,R.id.navigation_slazenger,R.id.navigation_tecnifibre,
        R.id.navigation_tretorn,R.id.navigation_wilson)
        .build();
    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    NavigationUI.setupWithNavController(navView, navController);
//
//    imgButton = (ImageButton) findViewById(R.id.imageButton);
//    imgButton.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//        Toast.makeText(getApplicationContext(),"Add to favourite", Toast.LENGTH_LONG).show();
//      }
//    });



  }

}