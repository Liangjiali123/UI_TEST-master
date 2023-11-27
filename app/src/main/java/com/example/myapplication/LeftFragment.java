package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*
 * Fragment: package android.app;||package androidx.fragment.app;
 *
 */


public class LeftFragment extends Fragment {
    /*
     * onCreateView/onDestroyView lifecycle
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)} under the condition that you must
     * return a non-null view (an IllegalStateException will be thrown if you access the view
     * lifecycle but don't return a non-null view).
     *
     * This will be set to the new {@link LifecycleOwner} after {@link #onCreateView} returns a
     * non-null View and will set to null after {@link #onDestroyView()}.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.left_fragment, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
