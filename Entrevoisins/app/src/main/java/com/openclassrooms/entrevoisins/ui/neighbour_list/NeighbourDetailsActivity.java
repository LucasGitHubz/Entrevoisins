package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NeighbourDetailsActivity extends AppCompatActivity {
    @BindView(R.id.back_button)
    Button backButton;
    @BindView(R.id.profil_imageView)
    ImageView profilImage;
    @BindView(R.id.big_name_textField)
    TextView bigName;
    @BindView(R.id.name_textView)
    TextView name;
    @BindView(R.id.profil_location)
    TextView location;
    @BindView(R.id.profil_number)
    TextView number;
    @BindView(R.id.profil_network)
    TextView network;
    @BindView(R.id.description)
    TextView description;
    @BindView(R.id.favoriteBtn)
    ImageView favoriteButton;

    private NeighbourApiService mApiService = DI.getNeighbourApiService();

    private Neighbour neighbour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        neighbour = intent.getParcelableExtra("neighbour");
        setContentView(R.layout.neighbour_details);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setStarImage();
        Glide.with(profilImage.getContext())
                .load(neighbour.getAvatarUrl())
                .into(profilImage);
        bigName.setText(neighbour.getName());
        name.setText(neighbour.getName());
        location.setText(neighbour.getAddress());
        number.setText(neighbour.getPhoneNumber());
        description.setText(neighbour.getAboutMe());

        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mApiService.toogleFavorite(neighbour);
                setStarImage();
            }
        });
    }

    private void setStarImage() {
        if (neighbour.isFavorite) {
            favoriteButton.setImageResource(R.drawable.ic_star_white_24dp);
        } else {
            favoriteButton.setImageResource(R.drawable.ic_star_border_white_24dp);
        }
    }
}
