package com.example.barry.collapsingtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1. create new project
 * 2. Change colors @colors.xml as needed
 * 3. Change theme @styles.xml to NoActionBar
 * 4. add to gradle app
 *      support design dependency
 *      cardview dependency
 *      sync
 * 5. Change root to Coordinator layout in main.xml as collapsing toolbar only works in Coordinator layout
 *      and delete the auto generated views
 * 6. add appbar layout
 * 7. add collapsing toolbar inside the appbar layout
 * 8. Google material design background, download, select as needed, paste in drawable
 *      use the background in the collapsing toolbar
 *
 * 9. add the toolbar widget inside the collapsing toolbar
 *
 * https://www.youtube.com/watch?v=IKzbX8fke3Y
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
