package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.KuzniaGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Kuznia Project";
		config.width=720;
		config.height=420;
		config.backgroundFPS=60;
		config.foregroundFPS=60;
		config.resizable=false;
		new LwjglApplication(new KuzniaGame(), config);
	}
}
