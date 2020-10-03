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

public class RobinSoderlingFragment extends Fragment {
  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.robinsoderling, container, false);

    ((TextView) root.findViewById(R.id.RSce)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.RSce)).setText(Html.fromHtml(getResources().getString(R.string.robin_soderling_club_edition)));

    ((TextView) root.findViewById(R.id.RSallB)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.RSallB)).setText(Html.fromHtml(getResources().getString(R.string.robin_soderling_all_black)));

    ((TextView) root.findViewById(R.id.RStourE)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.RStourE)).setText(Html.fromHtml(getResources().getString(R.string.robin_soderling_tour_edition)));
    return root;
  }
}
