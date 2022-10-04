package org.jnativehook;

import java.util.concurrent.ThreadFactory;

/* loaded from: hmar6.jar:org/jnativehook/b.class */
final class b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("JNativeHook Dispatch Thread");
        thread.setDaemon(true);
        return thread;
    }
}
