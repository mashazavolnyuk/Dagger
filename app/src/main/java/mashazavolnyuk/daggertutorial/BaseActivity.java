package mashazavolnyuk.daggertutorial;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import mashazavolnyuk.daggertutorial.component.AbstractActivityComponent;
import mashazavolnyuk.daggertutorial.component.DaggerMainComponent;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;

/**
 * Created by mashka on 07.06.17.
 */

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainComponent.builder().
                appComponent(App.getComponent()).
                activityModule(new ActivityModule(this)).
                presenterModule(new PresenterModule(this)).
                build().inject(this);
    }

}
