package com.example.module_tuan3_1_bai1_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
/* bai 1
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        switch (id){
//            case R.id.item_danh_sach_sv : break;
//            case R.id.item_11ATT :  break;
//            case R.id.item_11bTT : break;
//            case  R.id.item_11CTT : break;
//            default: break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
*/
    // Bai 1 phan 2


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        int itemID = 113;
        menu.add(0,itemID,0,"Menu 1");

        itemID = 114;
        menu.add(0,itemID,1,"Menu 2");

        SubMenu sub3 = menu.addSubMenu(0,1,2,"Menu 3");
        itemID = 115;
        sub3.add(0,itemID,0,"File 1 menu 3");
        itemID = 116;
        sub3.add(0,itemID,1,"File 2 menu 3");
        itemID = 117;
        sub3.add(0,itemID,2,"File 3 menu 3");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id  = item.getItemId();
        switch (id){
            case 113 : break;
            case 114 : break;
            case 115 : break;
            case 116 : break;
            case 117 : break;
        }
        return super.onOptionsItemSelected(item);
    }
}
