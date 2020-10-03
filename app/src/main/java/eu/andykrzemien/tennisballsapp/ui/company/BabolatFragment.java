package eu.andykrzemien.tennisballsapp.ui.company;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import eu.andykrzemien.tennisballsapp.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class BabolatFragment extends Fragment {
  ToggleButton myToggleButton;
  private Object ToggleButton;


  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.babolat, container, false);

    ((TextView) root.findViewById(R.id.babolatTC))
        .setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.babolatTC))
        .setText(Html.fromHtml(getResources().getString(R.string.babolat_team_clay)));

    ((TextView) root.findViewById(R.id.babolat_Gold))
        .setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.babolat_Gold))
        .setText(Html.fromHtml(getResources().getString(R.string.babolat_gold)));

    ((TextView) root.findViewById(R.id.babolatRG))
        .setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.babolatRG))
        .setText(Html.fromHtml(getResources().getString(R.string.babolat_roland_garros)));
    ((TextView) root.findViewById(R.id.babolatTAC))
        .setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.babolatTAC))
        .setText(Html.fromHtml(getResources().getString(R.string.babolat_team_all_court)));



    return root;


  }

}
