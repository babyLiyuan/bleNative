package com.blenative;

import android.os.Bundle;
import android.view.WindowManager;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.five1mars.android.bleNative.BleNativeReactPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        // keep the screen on (temp code)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "BleNative";
    }

    /**
     * Returns whether dev mode should be enabled.
     * This enables e.g. the dev menu.
     */
    @Override
    protected boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
    }

   /**
   * A list of packages used by the app. If the app uses additional views
   * or modules besides the default ones, add more packages here.
   */
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
        new BleNativeReactPackage()
      );
    }
}
