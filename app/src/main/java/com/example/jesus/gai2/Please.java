package com.example.jesus.gai2;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.view.Window;
import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.Toast;

//import android.webkit.PermissionRequest;

public class Please extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView Twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_please);
        Twitter = (WebView) findViewById(R.id.webView);
        Twitter.getSettings().setJavaScriptEnabled(true);
        Twitter.getSettings().setSaveFormData(true);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.please, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_twitter) {
//            Uri uri = Uri.parse("http://www.example.com");
//            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(intent);
              WebView twiter = new WebView(this);
              setContentView(twiter);
//            // Simplest usage: note that an exception will NOT be thrown
//            // if there is an error loading this page (see below).
//            twiter.loadUrl("http://www.example.com");

            // OR, you can also load from an HTML string:
//            String summary = "<html><body>You scored <b>192</b> points.</body></html>";
//            twitter.loadData(summary, "text/html", null);
            // ... although note that there are restrictions on what this HTML can do.
            // See the JavaDocs for loadData() and loadDataWithBaseURL() for more info.

            // Let's display the progress in the activity title bar, like the
            // browser app does.
//            getWindow().requestFeature(Window.FEATURE_PROGRESS);
//
//            webview.getSettings().setJavaScriptEnabled(true);
//
//            final Activity activity = this;
//            webview.setWebChromeClient(new WebChromeClient() {
//                public void onProgressChanged(WebView view, int progress) {
//                    // Activities and WebViews measure progress with different scales.
//                    // The progress meter will automatically disappear when we reach 100%
//                    activity.setProgress(progress * 1000);
//                }
//            });
//            webview.setWebViewClient(new WebViewClient() {
//                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                    Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
//                }
//            });

            //webview.loadUrl("http://developer.android.com/");

            //Uri uri = Uri.parse("https://twitter.com/?lang=en");
            //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
           // startActivity(intent);
            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_manage) {
// \
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
            getWindow().requestFeature(Window.FEATURE_PROGRESS);

            twiter.getSettings().setJavaScriptEnabled(true);

            final Activity activity = this;
            twiter.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView view, int progress) {
                    // Activities and WebViews measure progress with different scales.
                    // The progress meter will automatically disappear when we reach 100%
                    activity.setProgress(progress * 1000);
                }
            });
            twiter.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
                }
            });

            //webview.loadUrl("http://developer.android.com/");


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
