//responsible for loading music

package com.badlogic.androidgames.framework;

public interface Audio {
    //load audio assets from the app's APK file
    public Music newMusic (String filename);
    public Sound newSound (String filename);
	public Sound oldSound (String filename);
    public Sound oldMusic (String filename);
}
