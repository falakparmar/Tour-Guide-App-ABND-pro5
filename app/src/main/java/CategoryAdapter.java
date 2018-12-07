import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.AccomodationFragment;
import com.example.android.tourguide.CinemasFragment;
import com.example.android.tourguide.R;
import com.example.android.tourguide.ReligiousplacesFragment;
import com.example.android.tourguide.ResturantsFragment;
import com.example.android.tourguide.TouristsFragment;

import java.util.ArrayList;


public class CategoryAdapter extends FragmentPagerAdapter {
    private  Context mContext;
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return  new AccomodationFragment();
            case 1:
                return  new CinemasFragment();
            case 2:
                return  new ReligiousplacesFragment();
            case 3:
                return  new ResturantsFragment();
            default:
                return  new TouristsFragment();
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.food);
            case 1:
                return mContext.getString(R.string.cinema);
            case 2:
                return mContext.getString(R.string.religious);
            case 3:
                return mContext.getString(R.string.tour);
            default:
                return mContext.getString(R.string.stays);
        }
    }
}