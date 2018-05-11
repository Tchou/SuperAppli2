package vg.nguyen.kim.superappli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer buff = new StringBuffer();
                buff.append("toto");
                Log.v(this.getClass().getName(), "ICI\n");
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(buff.toString());
                if (true) return;
                try {
                URL url = new URL("https://www.google.com");
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setDoOutput(true);
                    urlConnection.setChunkedStreamingMode(0);
                    BufferedInputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    BufferedReader inr = new BufferedReader(new InputStreamReader(in));

                    while (true) {
                        String s = inr.readLine();
                        Log.d("error", s);
                        buff.append(s);
                    }
                } catch(Exception e) {
                    Log.d("error", e.toString());
                };


            }
        });



    }


}
