package br.com.lucasfsilva.exemplomenudinamico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final int MENU_ITEM01 = Menu.FIRST;
    private static final int MENU_ITEM02 = Menu.FIRST + 1;
    private static final int MENU_ITEM03 = Menu.FIRST + 2;
    private static final int MENU_ITEM04 = Menu.FIRST + 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        menu.add(0, MENU_ITEM01, Menu.NONE, "Add").setIcon(R.drawable.ic_folder).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(0, MENU_ITEM02, Menu.NONE, "Endereco").setIcon(R.drawable.ic_add).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(0, MENU_ITEM03, Menu.NONE, "Fecha").setIcon(R.drawable.ic_edit).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(0, MENU_ITEM04, Menu.NONE, "Edita").setIcon(R.drawable.ic_delete);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case MENU_ITEM01:
                break;
            case MENU_ITEM02:
                break;
            case MENU_ITEM03:
                break;
            case MENU_ITEM04:
                break;
        }
        return false;
    }
}
