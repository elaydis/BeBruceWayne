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

/**
 * Created by Nadine on 23.04.16.
 */
public class NeutralEndingFragment extends Fragment {

    public NeutralEndingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_neutral_ending, container, false);
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
