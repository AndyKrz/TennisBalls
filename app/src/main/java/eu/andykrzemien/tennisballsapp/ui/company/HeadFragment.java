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

public class HeadFragment extends Fragment {
  public View onCreateView(@NonNull LayoutInflater inflater,
                                                      ViewGroup container, Bundle savedInstanceState) {

  View root = inflater.inflate(R.layout.head, container, false);
    ((TextView) root.findViewById(R.id.headCha)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.headCha)).setText(Html.fromHtml(getResources().getString(R.string.head_championship)));

    ((TextView) root.findViewById(R.id.headPr)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.headPr)).setText(Html.fromHtml(getResources().getString(R.string.head_pro)));

    ((TextView) root.findViewById(R.id.headTe)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.headTe)).setText(Html.fromHtml(getResources().getString(R.string.head_team)));
    ((TextView) root.findViewById(R.id.headTo)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.headTo)).setText(Html.fromHtml(getResources().getString(R.string.head_tour)));
  return root;
}
}
