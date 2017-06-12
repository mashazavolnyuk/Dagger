package mashazavolnyuk.daggertutorial.component;

import android.app.Activity;

import dagger.Component;
import mashazavolnyuk.daggertutorial.AppComponent;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;

/**
 * Created by mashka on 07.06.17.
 */

@Component(modules = {ActivityModule.class, PresenterModule.class}, dependencies = {AppComponent.class})
public interface AbstractActivityComponent {
    Activity getActivityContext();
}
