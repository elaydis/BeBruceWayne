package com.elaydis.bebrucewayne;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elaydis.bebrucewayne.charity_gala.CharityGalaFirstSceneFragment;
import com.elaydis.bebrucewayne.christmas_tree_lighting.ChristmasTreeFirstSceneFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntroFragment extends Fragment {

    public IntroFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);

        super.onDestroyView();
    }

    @OnClick(R.id.button_scenario_1)
    void scenarioOneClicked() {
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new CharityGalaFirstSceneFragment())
                .addToBackStack(IntroFragment.class.getSimpleName())
                .commit();
    }

    @OnClick(R.id.button_scenario_2)
    void scenarioTwoClicked() {
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new ChristmasTreeFirstSceneFragment())
                .addToBackStack(IntroFragment.class.getSimpleName())
                .commit();
    }
}
