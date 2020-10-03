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

public class TretornFragment extends Fragment {
  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.tretorn, container, false);
    ((TextView) root.findViewById(R.id.tretornPC)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.tretornPC)).setText(Html.fromHtml(getResources().getString(R.string.tretorn_pro_court)));
    ((TextView) root.findViewById(R.id.tretornSer)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.tretornSer)).setText(Html.fromHtml(getResources().getString(R.string.tretorn_serie)));
    ((TextView) root.findViewById(R.id.tretornSO)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.tretornSO)).setText(Html.fromHtml(getResources().getString(R.string.tretorn_swedish_open)));
    return root;
  }
}
