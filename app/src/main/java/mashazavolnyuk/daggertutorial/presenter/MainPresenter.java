package mashazavolnyuk.daggertutorial.presenter;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by mashka on 01.06.17.
 */

public class MainPresenter {
    private  Activity context;

    public MainPresenter(Activity context){
        this.context = context;

    };
    public void showMess(){
        Toast.makeText(context,"ready",Toast.LENGTH_SHORT).show();

    }
}
