package com.elaydis.bebrucewayne.endings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elaydis.bebrucewayne.MainActivity;
import com.elaydis.bebrucewayne.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class GoodEndingFragment extends Fragment {

    public GoodEndingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_good_ending, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);

        super.onDestroyView();
    }


    @OnClick(R.id.button_back)
    public void backButtonClicked() {
        ((MainActivity)getActivity()).resetSuspicionLevel();
        getActivity().getSupportFragmentManager()
                .popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }


}
