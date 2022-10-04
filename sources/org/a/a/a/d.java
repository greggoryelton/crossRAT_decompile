package org.a.a.a;

import java.io.File;

/* loaded from: hmar6.jar:org/a/a/a/d.class */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char f46a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f46a == '\\';
    }

    static {
        Character.toString('.');
        f46a = File.separatorChar;
    }
}
