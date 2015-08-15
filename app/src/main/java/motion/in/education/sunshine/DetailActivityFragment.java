package motion.in.education.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

   public DetailActivityFragment() {
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_detail, container, false);
   }

//   @Override
//   public boolean onOptionsItemSelected(MenuItem item){
//      switch(item.getItemId()){
//         case R.id.action_settings:
//            Intent settingsIntent = new Intent(getActivity(), SettingsActivity.class);
//            //.putExtra(Intent.EXTRA_TEXT, toastText);
//            startActivity(settingsIntent);
//         default:
//            return super.onOptionsItemSelected(item);
//      }
//   }
}
