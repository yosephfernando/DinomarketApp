package yoseph.dinomarketapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yoseph on 11/4/2017.
 */

public class loginFragment extends Fragment {
    public loginFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View login = inflater.inflate(R.layout.loginfragment, null);
        return login;
    }
}
