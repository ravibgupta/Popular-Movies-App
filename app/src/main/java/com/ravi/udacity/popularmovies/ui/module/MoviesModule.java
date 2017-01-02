
package com.ravi.udacity.popularmovies.ui.module;


import com.ewintory.udacity.popularmovies.ApplicationModule;
import com.ewintory.udacity.popularmovies.ui.fragment.FavoredMoviesFragment;
import com.ewintory.udacity.popularmovies.ui.fragment.MovieFragment;
import com.ewintory.udacity.popularmovies.ui.fragment.SortedMoviesFragment;

import dagger.Module;

@Module(
        injects = {
                SortedMoviesFragment.class,
                FavoredMoviesFragment.class,
                MovieFragment.class
        },
        addsTo = ApplicationModule.class
)
public final class MoviesModule {}
