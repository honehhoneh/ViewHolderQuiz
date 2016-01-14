package sidespell.tech.viewholderquiz.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.GridView}.
 */
public class GridViewFragment extends Fragment {


    GridView mGridView;

    public static GridViewFragment newInstance() {
        return new GridViewFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gridview, container, false);
        mGridView = (GridView) view.findViewById(R.id.gridView);
    return view;
    }

}
