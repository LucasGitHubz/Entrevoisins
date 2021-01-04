package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {
    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        GetNeighbours neighbours = new GetNeighbours() {
            @Override
            public List<Neighbour> getNeighbours() {
                if (position == 0) {
                    return DI.getNeighbourApiService().getNeighbours();
                } else {
                    return DI.getNeighbourApiService().getFavoriteList();
                }
            }
        };

        NeighbourFragment fragment = NeighbourFragment.newInstance(neighbours);
        
        return fragment;
    }

    /**
     * get the number of pages
     * @return
     */
    @Override
    public int getCount() {
        return 2;
    }
}