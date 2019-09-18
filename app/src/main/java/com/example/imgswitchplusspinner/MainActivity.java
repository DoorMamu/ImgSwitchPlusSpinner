package com.example.imgswitchplusspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    //*************Step1************************
    //Create array of items to select from spinner

    private static final String[] ANDROID_VERSIONS = {
            "Select Item",
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo",
            "Pie"
    };
    ArrayAdapter adapter;
    Spinner spinner;
    ImageSwitcher ma_iS;
    //Array of image ids to show in imageSwitcher
    int imgIds[]={R.drawable.welcome,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jely,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmello,R.drawable.nougat,R.drawable.oreao,R.drawable.pie};
    int count=imgIds.length;

    public void init()
    {
        spinner=findViewById(R.id.spinner);
        //Send the array in the adapter
        adapter= new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, ANDROID_VERSIONS);
        //Send the adapter to the spinner
        spinner.setAdapter(adapter);

        //What to do when Item is selected
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int selectedItemNo, long l) {
                //   Toast.makeText(MainActivity.this, "Selected item "+selectedItemNo+" l "+l, Toast.LENGTH_SHORT).show();
                switch (selectedItemNo)
                {
                    case 0:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 1:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 2:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 3:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 4:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 5:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 6:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 7:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 8:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 9:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 10:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 11:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 12:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 13:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 14:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                    case 15:
                        ma_iS.setImageResource(imgIds[selectedItemNo]);
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //*************Step2************************
    public void createImageView()
    {
        ma_iS=findViewById(R.id.img_sw);
        //***************Step 3*******************
        //set the ViewFactory of the  ImageSwitcher that will create ImageView object when asked
        ma_iS.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                //Create new imageview and set its properties
                ImageView imageView=new ImageView(MainActivity.this);
                //set scale type of imageview to fit center
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                //set the height and width of ImageView to fill parent
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        });
        ////***************Step 4*******************
        //Declare in and out animation and load them using anumationutils class
        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        //set the ani9mation type to imageswitcher
        ma_iS.setInAnimation(in);
        ma_iS.setOutAnimation(out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
               createImageView();
        init();

    }
}
