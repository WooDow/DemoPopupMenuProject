package tw.leonchen.demopopupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class DemoPopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_popup_menu);
    }

    public void processPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(DemoPopupMenuActivity.this, view);

        popupMenu.getMenuInflater().inflate(R.menu.mymenu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(DemoPopupMenuActivity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        popupMenu.show();
    }
}
