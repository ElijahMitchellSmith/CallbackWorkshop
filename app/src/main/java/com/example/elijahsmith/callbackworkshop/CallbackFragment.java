package com.example.elijahsmith.callbackworkshop;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by elijahsmith on 3/26/18.
 */

public class CallbackFragment extends android.support.v4.app.Fragment {
    private CallbackClass callback;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_controller,container,false);
        ButterKnife.bind(this,view);

        return view;
    }

    @OnClick(R.id.callback_toast_button)
    protected void showToastButtonClicked() {
        callback.showToast();

    }
    @OnClick(R.id.callback_textview)
    protected void changeTextVieewButtonClicked() {
        callback.changeTextView();

    }
    @OnClick(R.id.callback_change_background_color_button)
    protected void changeBackgroundColorClicked() {
        callback.changeBackgroundColor();

    }
    @OnClick(R.id.callback_remove_fragment_button)
    protected void removeFragmentButtonClicked() {
        callback.removeFragment();

    }

    public void attachParent(CallbackClass callback) {
        this.callback = callback;
    }

    public static CallbackFragment newInstance() {

        Bundle args = new Bundle();
        CallbackFragment fragment = new CallbackFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public interface CallbackClass {
        void showToast();
        void changeBackgroundColor();
        void changeTextView();
        void removeFragment();
    }

}
