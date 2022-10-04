package org.a.a.a;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: hmar6.jar:org/a/a/a/f.class */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f47a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f48b;
    private static Method c;
    private static Object d;
    private static Object e;

    public static boolean a(File file) {
        try {
            return ((Boolean) f48b.invoke(null, c.invoke(file, new Object[0]))).booleanValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static boolean a() {
        return f47a;
    }

    static {
        boolean z = true;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> loadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> loadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> loadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> loadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            f48b = loadClass.getMethod("isSymbolicLink", loadClass2);
            loadClass.getMethod("delete", loadClass2);
            loadClass.getMethod("readSymbolicLink", loadClass2);
            e = Array.newInstance(loadClass3, 0);
            loadClass.getMethod("createSymbolicLink", loadClass2, loadClass2, e.getClass());
            d = Array.newInstance(loadClass4, 0);
            loadClass.getMethod("exists", loadClass2, d.getClass());
            c = File.class.getMethod("toPath", new Class[0]);
            loadClass2.getMethod("toFile", new Class[0]);
        } catch (ClassNotFoundException unused) {
            z = false;
        } catch (NoSuchMethodException unused2) {
            z = false;
        }
        f47a = z;
    }
}
