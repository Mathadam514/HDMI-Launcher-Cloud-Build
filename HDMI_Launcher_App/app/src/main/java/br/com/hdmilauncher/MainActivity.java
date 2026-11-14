package br.com.hdmilauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/** Opens the exact HDMI activity confirmed through ADB on the HY320. */
public class MainActivity extends Activity {
    private static final String TAG = "HDMI-Launcher";
    private static final String HDMI_PACKAGE = "com.droidlogic.android.tv";
    private static final String HDMI_ACTIVITY = "com.android.tv.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Mirrors: adb shell am start -n com.droidlogic.android.tv/com.android.tv.MainActivity
        // Do not add ACTION_MAIN or CATEGORY_LAUNCHER: the tested ADB command
        // starts this explicit component without either field.
        Intent hdmi = new Intent();
        hdmi.setComponent(new ComponentName(HDMI_PACKAGE, HDMI_ACTIVITY));

        try {
            startActivity(hdmi);
            finish();
        } catch (SecurityException e) {
            Log.e(TAG, "O Android bloqueou a abertura da atividade HDMI", e);
            Toast.makeText(this, "O sistema bloqueou a abertura do HDMI: " + e.getMessage(), Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Log.e(TAG, "Falha ao iniciar a atividade HDMI", e);
            Toast.makeText(this, "Falha ao abrir HDMI (" + e.getClass().getSimpleName() + "): " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
