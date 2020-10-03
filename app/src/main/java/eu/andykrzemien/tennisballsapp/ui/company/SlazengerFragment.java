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

public class SlazengerFragment extends Fragment {
  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.slazenger, container, false);
    ((TextView) root.findViewById(R.id.slazenger)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.slazenger)).setText(Html.fromHtml(getResources().getString(R.string.slazenger_wimbledon)));

    ((TextView) root.findViewById(R.id.slazenger_ch)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.slazenger_ch)).setText(Html.fromHtml(getResources().getString(R.string.slazenger_championship)));

    ((TextView) root.findViewById(R.id.slazenger_tourr)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.slazenger_tourr)).setText(Html.fromHtml(getResources().getString(R.string.slazenger_tournament)));
    return root;
  }
}
