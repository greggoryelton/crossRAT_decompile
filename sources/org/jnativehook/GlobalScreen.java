package org.jnativehook;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.swing.event.EventListenerList;

/* loaded from: hmar6.jar:org/jnativehook/GlobalScreen.class */
public final class GlobalScreen {

    /* renamed from: b  reason: collision with root package name */
    private static NativeHookThread f50b;

    /* renamed from: a  reason: collision with root package name */
    private static Logger f49a = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    private static ExecutorService c = new a();
    private static EventListenerList d = new EventListenerList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: hmar6.jar:org/jnativehook/GlobalScreen$NativeHookThread.class */
    public class NativeHookThread extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private c f51a;

        public NativeHookThread() {
            setName("JNativeHook Hook Thread");
            setDaemon(false);
            setPriority(10);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f51a = null;
            try {
                enable();
            } catch (c e) {
                this.f51a = e;
            }
            synchronized (this) {
                notifyAll();
            }
        }

        public final c a() {
            return this.f51a;
        }

        private native void enable();

        public native void disable();
    }

    private GlobalScreen() {
    }

    public static void a(org.jnativehook.a.a aVar) {
        if (aVar != null) {
            d.add(org.jnativehook.a.a.class, aVar);
        }
    }

    public static void b(org.jnativehook.a.a aVar) {
        if (aVar != null) {
            d.remove(org.jnativehook.a.a.class, aVar);
        }
    }

    public static void a(org.jnativehook.b.b bVar) {
        if (bVar != null) {
            d.add(org.jnativehook.b.b.class, bVar);
        }
    }

    public static void b(org.jnativehook.b.b bVar) {
        if (bVar != null) {
            d.remove(org.jnativehook.b.b.class, bVar);
        }
    }

    public static void a(org.jnativehook.b.c cVar) {
        if (cVar != null) {
            d.add(org.jnativehook.b.c.class, cVar);
        }
    }

    public static void b(org.jnativehook.b.c cVar) {
        if (cVar != null) {
            d.remove(org.jnativehook.b.c.class, cVar);
        }
    }

    public static void a(org.jnativehook.b.d dVar) {
        if (dVar != null) {
            d.add(org.jnativehook.b.d.class, dVar);
        }
    }

    public static void b(org.jnativehook.b.d dVar) {
        if (dVar != null) {
            d.remove(org.jnativehook.b.d.class, dVar);
        }
    }

    public static void a() {
        if (f50b == null || !f50b.isAlive()) {
            NativeHookThread nativeHookThread = new NativeHookThread();
            f50b = nativeHookThread;
            synchronized (nativeHookThread) {
                f50b.start();
                try {
                    f50b.wait();
                    c a2 = f50b.a();
                    if (a2 != null) {
                        throw a2;
                    }
                } catch (InterruptedException e) {
                    throw new c(e);
                }
            }
        }
    }

    public static void b() {
        if (c()) {
            synchronized (f50b) {
                f50b.disable();
                try {
                    f50b.join();
                } catch (InterruptedException e) {
                    throw new c(e.getCause());
                }
            }
        }
    }

    public static boolean c() {
        return f50b != null && f50b.isAlive();
    }

    public static void a(ExecutorService executorService) {
        if (c != null) {
            c.shutdown();
        }
        c = executorService;
    }

    static {
        try {
            System.loadLibrary(System.getProperty("jnativehook.lib.name", "JNativeHook"));
        } catch (UnsatisfiedLinkError unused) {
            try {
                Iterator a2 = ((d) Class.forName(System.getProperty("jnativehook.lib.locator", "org.jnativehook.DefaultLibraryLocator")).asSubclass(d.class).newInstance()).a();
                while (a2.hasNext()) {
                    File file = (File) a2.next();
                    if (file.exists() && file.isFile() && file.canRead()) {
                        System.load(file.getPath());
                    }
                }
            } catch (Exception e) {
                f49a.severe(e.getMessage());
                throw new UnsatisfiedLinkError(e.getMessage());
            }
        }
    }
}
