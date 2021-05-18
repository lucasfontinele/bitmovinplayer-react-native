package com.bitmovinplayerreactnative;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bitmovin.player.PlayerView;
import com.bitmovin.player.api.Player;
import com.bitmovin.player.api.source.SourceConfig;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class BitmovinPlayerModule extends ReactContextBaseJavaModule {
    public BitmovinPlayerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "BitmovinPlayer";
    }

    @ReactMethod
    public void show() {

    }
}