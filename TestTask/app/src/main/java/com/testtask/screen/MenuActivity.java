package com.testtask.screen;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import com.testtask.R;
import com.testtask.screen.dialog.InfoDialog;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        onClickButtonMenu();
        onClickButtonShop();
        onClickButtonPause();
        onClickButtonNormal();
        onClickButtonAccelerated();
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onClickButtonMenu() {
        ImageButton buttonMenu = findViewById(R.id.image_button_menu_AM);

        final Drawable drawableMenu = buttonMenu.getDrawable().getCurrent();
        final Bitmap bitmapMenu = ((BitmapDrawable) drawableMenu).getBitmap();

        buttonMenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (isClickArea(event, bitmapMenu)) {
                        InfoDialog infoDialog = InfoDialog.newInstance("1");
                        infoDialog.show(getSupportFragmentManager(), "Dialog 1");
                        return false;
                    } else
                        return true;
                }

                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onClickButtonShop() {
        ImageButton buttonShop = findViewById(R.id.image_button_shop_AM);

        final Drawable drawableShop = buttonShop.getDrawable().getCurrent();
        final Bitmap bitmapShop = ((BitmapDrawable) drawableShop).getBitmap();

        buttonShop.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (isClickArea(event, bitmapShop)) {
                        InfoDialog infoDialog = InfoDialog.newInstance("2");
                        infoDialog.show(getSupportFragmentManager(), "Dialog 2");
                        return false;
                    } else
                        return true;
                }

                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onClickButtonPause() {
        ImageButton buttonPause = findViewById(R.id.image_button_pause_AM);

        final Drawable drawablePause = buttonPause.getDrawable().getCurrent();
        final Bitmap bitmapPause = ((BitmapDrawable) drawablePause).getBitmap();

        buttonPause.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (isClickArea(event, bitmapPause)) {
                        InfoDialog infoDialog = InfoDialog.newInstance("3");
                        infoDialog.show(getSupportFragmentManager(), "Dialog 3");
                        return false;
                    } else
                        return true;
                }

                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onClickButtonNormal() {
        ImageButton buttonNormal = findViewById(R.id.image_button_normal_AM);

        final Drawable drawableNormal = buttonNormal.getDrawable().getCurrent();
        final Bitmap bitmapNormal = ((BitmapDrawable) drawableNormal).getBitmap();

        buttonNormal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (isClickArea(event, bitmapNormal)) {
                        InfoDialog infoDialog = InfoDialog.newInstance("4");
                        infoDialog.show(getSupportFragmentManager(), "Dialog 4");
                        return false;
                    } else
                        return true;
                }

                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onClickButtonAccelerated() {
        ImageButton buttonAccelerated = findViewById(R.id.image_button_accelerated_AM);

        final Drawable drawableAccelerated = buttonAccelerated.getDrawable().getCurrent();
        final Bitmap bitmapAccelerated = ((BitmapDrawable) drawableAccelerated).getBitmap();

        buttonAccelerated.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if (isClickArea(event, bitmapAccelerated)) {
                        InfoDialog infoDialog = InfoDialog.newInstance("5");
                        infoDialog.show(getSupportFragmentManager(), "Dialog 5");
                        return false;
                    } else
                        return true;
                }

                return false;
            }
        });
    }

    private boolean isClickArea(MotionEvent event, Bitmap bitmap) {
        if (event.getX() < bitmap.getWidth() && event.getY() < bitmap.getHeight()) {
            int pixel = bitmap.getPixel((int)event.getX(), (int)event.getY());

            int colorRed = Color.red(pixel);
            int colorBlue = Color.blue(pixel);
            int colorGreen = Color.green(pixel);

            return colorRed != 0 && colorBlue != 0 && colorGreen != 0;
        }

        return false;
    }
}