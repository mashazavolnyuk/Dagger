package mashazavolnyuk.daggertutorial.module;

import android.app.Activity;
import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mashazavolnyuk.daggertutorial.presenter.MainPresenter;

/**
 * Created by mashka on 01.06.17.
 */
@Module
public class PresenterModule {

    private Activity context;

    public PresenterModule(Activity context){
        this.context = context;
    }

    @Provides
    MainPresenter providePresenter() {
        return new MainPresenter(context);
    }
}
