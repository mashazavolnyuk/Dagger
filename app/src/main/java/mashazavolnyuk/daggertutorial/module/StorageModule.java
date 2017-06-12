package mashazavolnyuk.daggertutorial.module;

import dagger.Module;
import dagger.Provides;
import mashazavolnyuk.daggertutorial.DatabaseHelper;

/**
 * Created by mashka on 12.04.17.
 */
@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
