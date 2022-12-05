// Generated by view binder compiler. Do not edit!
package com.cw.javaAndroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cw.javaAndroid.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton AddTrip;

  @NonNull
  public final TextView TitleTrips;

  @NonNull
  public final TextView deleteAllTrips;

  @NonNull
  public final RecyclerView revTrip;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final View view;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton AddTrip, @NonNull TextView TitleTrips,
      @NonNull TextView deleteAllTrips, @NonNull RecyclerView revTrip,
      @NonNull SearchView searchView, @NonNull View view) {
    this.rootView = rootView;
    this.AddTrip = AddTrip;
    this.TitleTrips = TitleTrips;
    this.deleteAllTrips = deleteAllTrips;
    this.revTrip = revTrip;
    this.searchView = searchView;
    this.view = view;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddTrip;
      FloatingActionButton AddTrip = ViewBindings.findChildViewById(rootView, id);
      if (AddTrip == null) {
        break missingId;
      }

      id = R.id.Title_Trips;
      TextView TitleTrips = ViewBindings.findChildViewById(rootView, id);
      if (TitleTrips == null) {
        break missingId;
      }

      id = R.id.delete_all_trips;
      TextView deleteAllTrips = ViewBindings.findChildViewById(rootView, id);
      if (deleteAllTrips == null) {
        break missingId;
      }

      id = R.id.revTrip;
      RecyclerView revTrip = ViewBindings.findChildViewById(rootView, id);
      if (revTrip == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, AddTrip, TitleTrips, deleteAllTrips,
          revTrip, searchView, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}