package com.uraall.flappybirdclone;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	private GameModeManager gameModeManager;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		gameModeManager = new GameModeManager();
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new FlappyBird(), config);
	}
	@Override
	protected void onResume() {
		// Register ADPF thermal status listener on resume.
		super.onResume();
		this.gameModeManager.debugGameMode(getApplicationContext());
	}
}
