// Generated code from Butter Knife. Do not modify!
package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.openclassrooms.entrevoisins.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NeighbourDetailsActivity_ViewBinding implements Unbinder {
  private NeighbourDetailsActivity target;

  @UiThread
  public NeighbourDetailsActivity_ViewBinding(NeighbourDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NeighbourDetailsActivity_ViewBinding(NeighbourDetailsActivity target, View source) {
    this.target = target;

    target.backButton = Utils.findRequiredViewAsType(source, R.id.back_button, "field 'backButton'", Button.class);
    target.profilImage = Utils.findRequiredViewAsType(source, R.id.profil_imageView, "field 'profilImage'", ImageView.class);
    target.bigName = Utils.findRequiredViewAsType(source, R.id.big_name_textField, "field 'bigName'", TextView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name_textView, "field 'name'", TextView.class);
    target.location = Utils.findRequiredViewAsType(source, R.id.profil_location, "field 'location'", TextView.class);
    target.number = Utils.findRequiredViewAsType(source, R.id.profil_number, "field 'number'", TextView.class);
    target.network = Utils.findRequiredViewAsType(source, R.id.profil_network, "field 'network'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
    target.favoriteButton = Utils.findRequiredViewAsType(source, R.id.favoriteBtn, "field 'favoriteButton'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NeighbourDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.backButton = null;
    target.profilImage = null;
    target.bigName = null;
    target.name = null;
    target.location = null;
    target.number = null;
    target.network = null;
    target.description = null;
    target.favoriteButton = null;
  }
}
