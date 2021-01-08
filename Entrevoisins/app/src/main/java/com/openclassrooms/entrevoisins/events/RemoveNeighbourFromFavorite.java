package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class RemoveNeighbourFromFavorite {
    public Neighbour neighbour;

    public RemoveNeighbourFromFavorite(Neighbour neighbour) {
        this.neighbour = neighbour;
    }
}
