package eu.andykrzemien.tennisballsapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import eu.andykrzemien.tennisballsapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.fragment.NavHostFragment;

public class HomeFragment extends Fragment {


  private HomeViewModel homeViewModel;

  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {
    homeViewModel =
        ViewModelProviders.of(this).get(HomeViewModel.class);
    View root = inflater.inflate(R.layout.fragment_home, container, false);
    final TextView textView = root.findViewById(R.id.text_home);
    return root;
  }
  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    view.findViewById(R.id.dunlopButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_dunlop);
      }
    });

    view.findViewById(R.id.wilsonButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_wilson);

      }
    });
    view.findViewById(R.id.slazengerButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_slazenger);

      }
    });
    view.findViewById(R.id.tretornButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_tretorn);

      }
    });
    view.findViewById(R.id.headButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_head);

      }
    });
    view.findViewById(R.id.babolatButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_babolat);

      }
    });
    view.findViewById(R.id.tecnifibreButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_tecnifibre);

      }
    });
    view.findViewById(R.id.robinButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_navigation_home_to_navigation_robinsoderling);

      }
    });
  }

}