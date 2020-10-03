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

public class WilsonFragment extends Fragment {

  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.wilson, container, false);

    ((TextView) root.findViewById(R.id.wilsonRGAC)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonRGAC)).setText(Html.fromHtml(getResources().getString(R.string.wilson_roland_garros_all_court)));

    ((TextView) root.findViewById(R.id.wilsonRGC)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonRGC)).setText(Html.fromHtml(getResources().getString(R.string.wilson_roland_garros_clay)));

    ((TextView) root.findViewById(R.id.wilsonTPAC)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonTPAC)).setText(Html.fromHtml(getResources().getString(R.string.wilson_tour_premier_all_court)));

    ((TextView) root.findViewById(R.id.wilsonTPCC)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonTPCC)).setText(Html.fromHtml(getResources().getString(R.string.wilson_tour_premier_clay_court)));

    ((TextView) root.findViewById(R.id.wilsonTri)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonTri)).setText(Html.fromHtml(getResources().getString(R.string.wilson_triniti)));

    ((TextView) root.findViewById(R.id.wilsonUSOp)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.wilsonUSOp)).setText(Html.fromHtml(getResources().getString(R.string.wilson_us_open)));
    return root;
  }
}
