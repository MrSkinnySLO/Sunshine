
/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package motion.in.education.sunshine;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailActivity extends ActionBarActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      // Get the message from the intent
      Intent intent = getIntent();
      String message = intent.getStringExtra(Intent.EXTRA_TEXT);

      // Create the text view
      TextView textView = new TextView(this);
      textView.setTextSize(40);
      textView.setText(message);

      // Set the text view as the activity layout
      setContentView(textView);


   }


   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.detail, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item){
      switch(item.getItemId()){
         case R.id.action_settings:
            startActivity(new Intent(getBaseContext(), SettingsActivity.class));
            return true;
         default:
            return super.onOptionsItemSelected(item);
      }
   }

   /**
    * A placeholder fragment containing a simple view.
    */
   public static class PlaceholderFragment extends Fragment {

      public PlaceholderFragment() {
      }

      @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {

         View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
         return rootView;
      }
   }
}