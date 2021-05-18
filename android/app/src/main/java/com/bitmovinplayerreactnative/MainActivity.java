package com.bitmovinplayerreactnative;

import com.facebook.react.ReactActivity;

import android.os.Bundle;

import com.bitmovin.player.PlayerView;
import com.bitmovin.player.api.Player;
import com.bitmovin.player.api.source.SourceConfig;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is
   * used to schedule rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "BitmovinPlayerReactNative";
  }

  private PlayerView playerView;
  private Player player;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    playerView = findViewById(R.id.bitmovinPlayerView);

    initializePlayer();
  }

  @Override
  protected void onStart() {
    playerView.onStart();
    super.onStart();
  }

  @Override
  protected void onResume() {
    super.onResume();
    playerView.onResume();
  }

  @Override
  protected void onPause() {
    playerView.onPause();
    super.onPause();
  }

  @Override
  protected void onStop() {
    playerView.onStop();
    super.onStop();
  }

  @Override
  protected void onDestroy() {
    playerView.onDestroy();
    super.onDestroy();
  }

  protected void initializePlayer() {
    player = Player.create(this);
    playerView.setPlayer(player);

    // load source using a source config
    player.load(SourceConfig.fromUrl("https://bitdash-a.akamaihd.net/content/sintel/sintel.mpd"));
  }
}
