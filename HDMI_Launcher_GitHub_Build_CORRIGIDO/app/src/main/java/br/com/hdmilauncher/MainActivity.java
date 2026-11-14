package br.com.hdmilauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Lightweight launcher entry point for the projector's built-in HDMI app.
 * Target component confirmed on the device:
 * com.droidlogic.android.tv/com.android.tv.MainActivity
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent hdmi = new Intent(Intent.ACTION_MAIN);
        hdmi.addCategory(Intent.CATEGORY_LAUNCHER);
        hdmi.setComponent(new ComponentName(
                "com.droidlogic.android.tv",
                "com.android.tv.MainActivity"
        ));
        hdmi.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        try {
            startActivity(hdmi);
        } catch (Exception e) {
            Toast.makeText(
                    this,
                    "Não foi possível abrir o HDMI. Verifique se o app de TV está instalado.",
                    Toast.LENGTH_LONG
            ).show();
        } finally {
            finish();
        }
    }
}
