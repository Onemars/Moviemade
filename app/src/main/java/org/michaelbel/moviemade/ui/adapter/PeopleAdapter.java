package org.michaelbel.moviemade.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import org.michaelbel.moviemade.rest.TmdbObject;
import org.michaelbel.moviemade.rest.model.v3.People;
import org.michaelbel.moviemade.ui.adapter.recycler.Holder;
import org.michaelbel.moviemade.ui.view.CastView;

import java.util.ArrayList;
import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter {

    private List<TmdbObject> people;

    public PeopleAdapter() {
        people = new ArrayList<>();
    }

    public void addPeople(List<TmdbObject> results) {
        people.addAll(results);
        notifyItemRangeInserted(people.size() + 1, results.size());
    }

    public List<TmdbObject> getPeople() {
        return people;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(new CastView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        People p = (People) people.get(position);

        CastView view = (CastView) holder.itemView;
        view.setName(p.name)
            .setCharacter(String.valueOf(p.popularity))
            .setProfile(p.profilePath)
            .setDivider(true);
    }

    @Override
    public int getItemCount() {
        return people != null ? people.size() : 0;
    }
}