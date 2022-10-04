package org.jnativehook;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: hmar6.jar:org/jnativehook/a.class */
public final class a extends ThreadPoolExecutor {
    public a() {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b());
    }
}
