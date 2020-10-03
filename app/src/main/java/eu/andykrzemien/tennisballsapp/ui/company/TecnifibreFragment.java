package eu.andykrzemien.tennisballsapp.ui.company;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import eu.andykrzemien.tennisballsapp.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class TecnifibreFragment extends Fragment {
  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.tecnifibre, container, false);
    ((TextView) root.findViewById(R.id.tecnifibreCha)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.tecnifibreCha)).setText(Html.fromHtml(getResources().getString(R.string.tecnifibre_champion)));
    ((TextView) root.findViewById(R.id.tecniXLD)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.tecniXLD)).setText(Html.fromHtml(getResources().getString(R.string.tecnifibre_xld)));
    return root;
  }
}
