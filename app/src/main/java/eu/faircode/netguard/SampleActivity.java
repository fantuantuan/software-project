package eu.faircode.netguard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.VpnService;
import android.os.AsyncTask;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SampleActivity extends AppCompatActivity {

    private static final String TAG = "NetGuard.Main";
//    private Button tes=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
//        tes=(Button) findViewById(R.id.button);
//        tes.setOnClickListener((View.OnClickListener) this);
    }
//    public void onClick(View view)
//    {
//        switch (view.getId())
//        {
//            case R.id.button:
//                startActivity(new Intent(this, ActivityMain.class));
//                break;
//        }
//    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(TAG, "Menu=" + item.getTitle());

        // Handle item selection
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        switch (item.getItemId()) {
            case R.id.button2:
                more_con();
                return true;

            case R.id.button:
                startActivity(new Intent(this, ActivityMain.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void more_con() {
        startActivity(getIntentApps(this));
    }

    private static Intent getIntentApps(Context context) {
        return new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=8420080860664580239"));
    }



}
