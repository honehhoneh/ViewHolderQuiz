package sidespell.tech.viewholderquiz.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    ListView mlistView;

    /*
    static class ViewHolder{
    ImageView img;
    TextVIew name;
    TextView genre;



    -- override getView}*/

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container, false);
        mlistView = (ListView)view.findViewById(R.id.listView);

        return view;
    }
}
