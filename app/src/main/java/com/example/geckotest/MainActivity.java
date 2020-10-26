package com.example.geckotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.mozilla.geckoview.GeckoRuntime;
import org.mozilla.geckoview.GeckoSession;
import org.mozilla.geckoview.GeckoView;


public class MainActivity extends AppCompatActivity {

    private GeckoView geckoView;
    private GeckoSession geckoSession;
    private GeckoRuntime geckoRuntime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        geckoView =findViewById(R.id.geckoView);

        GeckoSession session = new GeckoSession();
        GeckoRuntime runtime = GeckoRuntime.create(this);

        session.open(runtime);
        geckoView.setSession(session);
        session.loadUri("https://test.qosmat.in/");



        // geckoView.setChromeDelegate(new MyGeckoViewChrome());
        //  geckoView.setContentDelegate(new MyGeckoViewContent());*\

   /* private class MyGeckoViewChrome extends GeckoViewChrome {
        @Override
        public void onReady(GeckoView view) {
            PrefsHelper.setPref("javascript.enabled", true);
            mGeckoView.addBrowser("http://www.dhs.state.il.us/accessibility/tests/flash/video.html");*/



       /* geckoSession = new GeckoSession();
        geckoSession.getSettings().setBoolean(GeckoSessionSettings.USE_MULTIPROCESS, true);
        geckoSession.getSettings().setBoolean(GeckoSessionSettings.USER_AGENT_MODE_DESKTOP, false);

        GeckoRuntimeSettings.Builder builder = new GeckoRuntimeSettings.Builder()
                .javaScriptEnabled(true)
                .nativeCrashReportingEnabled(true)
                .consoleOutput(true);


        geckoRuntime = GeckoRuntime.create(MainActivity.this, builder.build());
        geckoView.setSession(geckoSession, geckoRuntime);
        geckoSession.loadUri("https://test.qosmat.in/");*/


    }
}

