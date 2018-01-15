package org.michaelbel.moviemade.mvp.view;

import com.arellomobile.mvp.MvpView;

import org.michaelbel.moviemade.app.annotation.EmptyViewMode;
import org.michaelbel.moviemade.rest.model.Movie;
import org.michaelbel.moviemade.rest.model.People;

import java.util.List;

public interface MvpSearchView {

    interface SearchMovies extends MvpView {

        void searchStart();

        void searchComplete(List<Movie> movies, int totalResults);

        void nextPageLoaded(List<Movie> newMovies);

        void showError(@EmptyViewMode int mode);
    }

    interface SearchPeople extends MvpView {

        void searchStart();

        void searchComplete(List<People> people, int totalResults);

        void nextPageLoaded(List<People> newPeople);

        void showError(@EmptyViewMode int mode);
    }
}