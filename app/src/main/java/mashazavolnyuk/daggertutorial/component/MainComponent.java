package mashazavolnyuk.daggertutorial.component;

import dagger.Component;
import mashazavolnyuk.daggertutorial.App;
import mashazavolnyuk.daggertutorial.AppComponent;
import mashazavolnyuk.daggertutorial.BaseActivity;
import mashazavolnyuk.daggertutorial.MainActivity;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;

/**
 * Created by mashka on 01.06.17.
 */
@Component(modules = {ActivityModule.class, PresenterModule.class},dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(BaseActivity activity);
}
