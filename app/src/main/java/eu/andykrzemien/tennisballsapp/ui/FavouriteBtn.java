package eu.andykrzemien.tennisballsapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import eu.andykrzemien.tennisballsapp.R;

import androidx.core.content.ContextCompat;

public class FavouriteBtn extends Activity {

  ToggleButton toggleButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      toggleButton = findViewById(R.id.myToggleButton);
//      toggleButton.setChecked(false);
      toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
      toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
          if (isChecked)
            toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_on));
          else
            toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(),android.R.drawable.btn_star_big_off));
        }
      });
    }


  private void saveState(boolean isFavourite) {
    SharedPreferences aSharedPreferences = this.getSharedPreferences(
        "Favourite", Context.MODE_PRIVATE);
    SharedPreferences.Editor aSharedPreferencesEdit = aSharedPreferences
        .edit();
    aSharedPreferencesEdit.putBoolean("State", isFavourite);
    aSharedPreferencesEdit.commit();
  }

  private boolean readState() {
    SharedPreferences aSharedPreferences = this.getSharedPreferences(
        "Favourite", Context.MODE_PRIVATE);
    return aSharedPreferences.getBoolean("State", true);
  }
}
