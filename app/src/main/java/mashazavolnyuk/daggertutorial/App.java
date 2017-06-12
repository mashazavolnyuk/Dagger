package mashazavolnyuk.daggertutorial;

import android.app.Application;

import mashazavolnyuk.daggertutorial.component.MainComponent;

/**
 * Created by mashka on 12.04.17.
 */

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();

    }

    public static AppComponent getComponent() {
        return component;
    }
    
}
