package com.rnwallet;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.oblador.vectoricons.VectorIconsPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.reactnativecomponent.barcode.RCTCapturePackage;
import com.bitgo.randombytes.RandomBytesPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import com.rnfs.RNFSPackage;
import co.airbitz.fastcrypto.RNFastCryptoPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import org.reactnative.camera.RNCameraPackage;
import com.cmcewen.blurview.BlurViewPackage;
import com.microsoft.codepush.react.CodePush;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.cmcewen.blurview.BlurViewPackage;
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import co.airbitz.fastcrypto.RNFastCryptoPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import org.reactnative.camera.RNCameraPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.bitgo.randombytes.RandomBytesPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.rnfs.RNFSPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

        @Override
        protected String getJSBundleFile() {
        return CodePush.getJSBundleFile();
        }
    

    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new VectorIconsPackage(),
            new SplashScreenReactPackage(),
            new RCTCapturePackage(),
            new RandomBytesPackage(),
            new LinearGradientPackage(),
            new RNI18nPackage(),
            new RNFSPackage(),
            new RNFastCryptoPackage(),
            new RNDeviceInfo(),
            new RNCameraPackage(),
            new BlurViewPackage(),
            new CodePush(null, getApplicationContext(), BuildConfig.DEBUG),
            new RNDeviceInfo(),
            new BlurViewPackage(),
            new RNI18nPackage(),
            new RNFastCryptoPackage(),
            new SplashScreenReactPackage(),
            new RNCameraPackage(),
            new VectorIconsPackage(),
            new RandomBytesPackage(),
            new LinearGradientPackage(),
            new RNFSPackage()

      
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  
  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
