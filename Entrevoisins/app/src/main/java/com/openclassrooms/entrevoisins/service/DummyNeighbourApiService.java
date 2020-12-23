package com.openclassrooms.entrevoisins.service;

import android.util.Log;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }

    @Override
    public List<Neighbour> getFavoriteList() {
        List<Neighbour> favoriteList = null;
        for (Neighbour neighbour: neighbours) {
            if (neighbour.isFavorite) {
                favoriteList.add(neighbour);
            }
        }
        return favoriteList;
    }

    @Override
    public Boolean toogleFavorite(Neighbour neighbour) {
        for (Neighbour neighbour1: neighbours) {
            if (neighbour1.getId() == neighbour.getId()) {
                neighbour1.isFavorite = !neighbour.isFavorite;
                neighbour = neighbour1;
                break;
            }
        }
        return neighbour.isFavorite;
    }
}
