package mashazavolnyuk.daggertutorial;

import dagger.Component;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.NetworkModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;
import mashazavolnyuk.daggertutorial.module.StorageModule;

/**
 * Created by mashka on 12.04.17.
 */
@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

}
