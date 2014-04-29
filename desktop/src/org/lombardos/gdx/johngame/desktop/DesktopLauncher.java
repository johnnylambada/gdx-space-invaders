package org.lombardos.gdx.johngame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.lombardos.gdx.johngame.JohnGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = JohnGame.WIDTH;
		config.height= JohnGame.HEIGHT;
		new LwjglApplication(new JohnGame(), config);
	}
}
