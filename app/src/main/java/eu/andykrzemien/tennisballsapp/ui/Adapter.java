package eu.andykrzemien.tennisballsapp.ui;

import eu.andykrzemien.tennisballsapp.ui.company.BabolatFragment;
import eu.andykrzemien.tennisballsapp.ui.company.DunlopFragment;
import eu.andykrzemien.tennisballsapp.ui.company.HeadFragment;
import eu.andykrzemien.tennisballsapp.ui.company.RobinSoderlingFragment;
import eu.andykrzemien.tennisballsapp.ui.company.SlazengerFragment;
import eu.andykrzemien.tennisballsapp.ui.company.TecnifibreFragment;
import eu.andykrzemien.tennisballsapp.ui.company.TretornFragment;
import eu.andykrzemien.tennisballsapp.ui.company.WilsonFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class Adapter extends FragmentPagerAdapter {

  private int numOfTabs;

  public Adapter(FragmentManager fm, int numOfTabs) {
    super(fm);
    this.numOfTabs = numOfTabs;
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return new BabolatFragment();
      case 1:
        return new DunlopFragment();
      case 2:
        return new HeadFragment();
      case 3:
        return new RobinSoderlingFragment();
      case 4:
        return new SlazengerFragment();
      case 5:
        return new TecnifibreFragment();
      case 6:
        return new TretornFragment();
      case 7:
        return new WilsonFragment();
      default:
        return null;
    }

  }

  @Override
  public int getCount() {
    return numOfTabs;
  }

}