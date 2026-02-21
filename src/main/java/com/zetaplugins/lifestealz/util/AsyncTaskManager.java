package com.zetaplugins.lifestealz.util;

import com.tcoded.folialib.wrapper.task.WrappedTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages all running async tasks
 */
public final class AsyncTaskManager {
    private final List<WrappedTask> runningTasks = new ArrayList<>();

    /**
     * Add a task to the list of running tasks
     * 
     * @param task The task to add
     */
    public void addTask(WrappedTask task) {
        runningTasks.add(task);
    }

    /**
     * Cancel all running tasks
     */
    public void cancelAllTasks() {
        for (WrappedTask task : runningTasks) {
            if (task.isCancelled())
                continue;
            task.cancel();
        }
        runningTasks.clear();
    }
}
