package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.MainScreen;
import com.mygdx.game.screens.MenuScreen;
import com.mygdx.game.screens.OptionScreen;

public class KuzniaGame extends Game {
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainScreen(this));

	}


	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {

	}
}
