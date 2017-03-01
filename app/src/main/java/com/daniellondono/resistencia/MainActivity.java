package com.daniellondono.resistencia;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    TextView Resistencia;
    long R1 = 0;
    long R2 = 0;
    long R3 = 1;
    String T="";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resistencia = (TextView) findViewById(R.id.Resistencia);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onRadioButton(View view) {
        boolean marcado = ((RadioButton) view).isChecked(); //Revisar cual botón está marcado
        switch (view.getId()) {
            case R.id.Negro1:
                if (marcado) {
                    R1 = 0;

                }
                break;
            case R.id.Cafe1:
                if (marcado) {
                    R1 = 10;
                }
                break;
            case R.id.Rojo1:
                if (marcado) {
                    R1 = 20;
                }
                break;
            case R.id.Nar1:
                if (marcado) {
                    R1 = 30;
                }
                break;
            case R.id.Ama1:
                if (marcado) {
                    R1 = 40;
                }
                break;
            case R.id.Ver1:
                if (marcado) {
                    R1 = 50;
                }
                break;
            case R.id.Azul1:
                if (marcado) {
                    R1 = 60;
                }
                break;
            case R.id.Purp1:
                if (marcado) {
                    R1 = 70;
                }
                break;
            case R.id.Gris1:
                if (marcado) {
                    R1 = 80;
                }
                break;
            case R.id.Blan1:
                if (marcado) {
                    R1 = 90;
                }
                break;

            case R.id.Negro2:
                if (marcado) {
                    R2 = 0;
                }
                break;
            case R.id.Cafe2:
                if (marcado) {
                    R2 = 1;
                }
                break;
            case R.id.Rojo2:
                if (marcado) {
                    R2 = 2;
                }
                break;
            case R.id.Nar2:
                if (marcado) {
                    R2 = 3;
                }
                break;
            case R.id.Ama2:
                if (marcado) {
                    R2 = 4;
                }
                break;
            case R.id.Ver2:
                if (marcado) {
                    R2 = 5;
                }
                break;
            case R.id.Azul2:
                if (marcado) {
                    R2 = 6;
                }
                break;
            case R.id.Purp2:
                if (marcado) {
                    R2 = 7;
                }
                break;
            case R.id.Gris2:
                if (marcado) {
                    R2 = 8;
                }
                break;
            case R.id.Blan2:
                if (marcado) {
                    R2 = 9;
                }
                break;

            case R.id.Negro3:
                if (marcado) {
                    R3 = 1;
                }
                break;
            case R.id.Cafe3:
                if (marcado) {
                    R3 = 10;
                }
                break;
            case R.id.Rojo3:
                if (marcado) {
                    R3 = 100;
                }
                break;
            case R.id.Nar3:
                if (marcado) {
                    R3 = 1000;
                }
                break;
            case R.id.Ama3:
                if (marcado) {
                    R3 = 10000;
                }
                break;
            case R.id.Ver3:
                if (marcado) {
                    R3 = 100000;
                }
                break;
            case R.id.Azul3:
                if (marcado) {
                    R3 = 1000000;
                }
                break;
            case R.id.Purp3:
                if (marcado) {
                    R3 = 10000000;
                }
                break;
            case R.id.Gris3:
                if (marcado) {
                    R3 = 100000000;
                }
                break;
            case R.id.Blan3:
                if (marcado) {
                    R3 = 1000000000;
                }
                break;
            case R.id.Cafe:
                if (marcado) {
                    T="    1%";
                }
                break;
            case R.id.Rojo:
                if (marcado) {
                    T="    2%";
                }
                break;
            case R.id.Dorado:
                if (marcado) {
                    T="    5%";
                }
                break;
            case R.id.Plata:
                if (marcado) {
                    T="    10%";
                }
                break;
        }
        Resistencia.setText("R= " + ((R1 + R2) * R3)+" Ohm "+T);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
