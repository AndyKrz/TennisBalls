package eu.andykrzemien.tennisballsapp.ui.company;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import eu.andykrzemien.tennisballsapp.R;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DunlopFragment extends Fragment {

  RecyclerView dunlopImage;
  TextView dunlopATP3;

  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.dunlop, container, false);
    ((TextView) root.findViewById(R.id.dunlopATP3)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.dunlopATP3)).setText(Html.fromHtml(getResources().getString(R.string.dunlop_atp)));

    ((TextView) root.findViewById(R.id.dunlopTourPerf)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.dunlopTourPerf)).setText(Html.fromHtml(getResources().getString(R.string.dunlop_tour_performance)));

    ((TextView) root.findViewById(R.id.dunlopFortCl)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.dunlopFortCl)).setText(Html.fromHtml(getResources().getString(R.string.dunlop_fort_clay)));

    ((TextView) root.findViewById(R.id.dunlopAOAO)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.dunlopAOAO)).setText(Html.fromHtml(getResources().getString(R.string.dunlop_ao)));

    ((TextView) root.findViewById(R.id.dunlopfo)).setMovementMethod(LinkMovementMethod.getInstance());
    ((TextView) root.findViewById(R.id.dunlopfo)).setText(Html.fromHtml(getResources().getString(R.string.dunlop_fort)));
    return root;

  }


}
