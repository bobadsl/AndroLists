package andro.jf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AndroListsActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ListView list = (ListView)findViewById(R.id.maliste);
		ArrayAdapter<String> tableau = new ArrayAdapter<String>(
				list.getContext(), R.layout.ligne, R.id.monTexte);
		for (int i=0; i<40; i++) {
			tableau.add("coucou " + i);
		}
		list.setAdapter(tableau);
	}
}