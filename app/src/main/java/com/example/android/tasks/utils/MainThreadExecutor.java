package com.example.android.tasks.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/**
 * Class for executing {@link Runnable}s on the main thread.
 */
public class MainThreadExecutor implements Executor {

    private final Handler mainHandler;

    public MainThreadExecutor() {
        Looper mainLooper = Looper.getMainLooper();
        mainHandler = new Handler(mainLooper);
    }

    @Override
    public void execute(Runnable command) {
        mainHandler.post(command);
    }
}
