package com.elaydis.bebrucewayne;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MenuFragment extends Fragment {

    @Bind(R.id.button_start_game)
    Button startGameButton;

    @Bind(R.id.button_credits)
    Button creditsButton;

    public MenuFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button_start_game)
    void onStartGameClicked() {
        //TODO start game!
    }

    @OnClick(R.id.button_credits)
    void onCreditsClicked() {
        //TODO show credits!
    }

}
