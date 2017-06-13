package mashazavolnyuk.daggertutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;
import mashazavolnyuk.daggertutorial.component.DaggerMainComponent;
import mashazavolnyuk.daggertutorial.module.ActivityModule;
import mashazavolnyuk.daggertutorial.module.PresenterModule;
import mashazavolnyuk.daggertutorial.presenter.MainPresenter;

public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainComponent.builder().
                appComponent(App.getComponent()).
                presenterModule(new PresenterModule(this)).
                build().inject(this);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainPresenter==null)
                    Toast.makeText(MainActivity.this,"oops",Toast.LENGTH_SHORT).show();
                else
               mainPresenter.showMess();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
