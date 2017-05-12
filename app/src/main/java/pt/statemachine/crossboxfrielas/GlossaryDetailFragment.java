package pt.statemachine.crossboxfrielas;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.FragmentTransaction;

public class GlossaryDetailFragment extends Fragment {
    private long glossaryId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            glossaryId = savedInstanceState.getLong("glossaryId");
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
        return inflater.inflate(R.layout.fragment_glossary_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Glossary glossary = Glossary.glossaries[(int) glossaryId];
            title.setText(glossary.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(glossary.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("glossaryId", glossaryId);
    }

    public void setGlossary(long id) {
        this.glossaryId = id;
    }
}
