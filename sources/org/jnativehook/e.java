package org.jnativehook;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: hmar6.jar:org/jnativehook/e.class */
public final class e extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f52a;

    public e() {
        this.f52a = false;
        this.f52a = true;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f52a = false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        this.f52a = false;
        return new ArrayList(0);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return !this.f52a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return !this.f52a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        EventQueue.invokeLater(runnable);
    }
}
