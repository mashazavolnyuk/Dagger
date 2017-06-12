package mashazavolnyuk.daggertutorial.module;

import dagger.Module;
import dagger.Provides;
import mashazavolnyuk.daggertutorial.NetworkUtils;

/**
 * Created by mashka on 12.04.17.
 */
@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
