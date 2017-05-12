package pt.statemachine.crossboxfrielas;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WodDetailFragment extends Fragment {
    private long wodId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            wodId = savedInstanceState.getLong("wodId");
        }
        else
        {
            /*
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
            */
        }
        return inflater.inflate(R.layout.fragment_wod_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Wod wod = Wod.wods[(int) wodId];

            //Populate the wod image
            ImageView photo = (ImageView)view.findViewById(R.id.photo);
            photo.setImageResource(wod.getImageResourceId());
            photo.setContentDescription(wod.getName());

            TextView title = (TextView) view.findViewById(R.id.textTitle);
            title.setText(wod.getName());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(wod.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("wodId", wodId);
    }

    //Update the database when the checkbox is clicked
    public void onFavoriteClicked(View view){
        //int drinkNo = (Integer)getIntent().getExtras().get("drinkNo");
        //new UpdateDrinkTask().execute(drinkNo);
    }

    public void setWorkout(long id) {
        this.wodId = id;
    }

}
