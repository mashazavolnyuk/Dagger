package mashazavolnyuk.daggertutorial.component;

import javax.inject.Singleton;

import dagger.Component;
import mashazavolnyuk.daggertutorial.App;
import mashazavolnyuk.daggertutorial.AppComponent;
import mashazavolnyuk.daggertutorial.BaseActivity;
import mashazavolnyuk.daggertutorial.MainActivity;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;
import mashazavolnyuk.daggertutorial.presenter.MainPresenter;

/**
 * Created by mashka on 01.06.17.
 */
@Component(modules = {ActivityModule.class, PresenterModule.class},dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);

    MainPresenter getPresenter();
}
