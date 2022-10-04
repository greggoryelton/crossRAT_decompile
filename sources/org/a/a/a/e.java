package org.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* loaded from: hmar6.jar:org/a/a/a/e.class */
public final class e {
    public static void a(Closeable... closeableArr) {
        for (int i = 0; i < 4; i++) {
            Closeable closeable = closeableArr[i];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    static {
        char c = File.separatorChar;
        PrintWriter printWriter = new PrintWriter(new org.a.a.a.a.a(4));
        printWriter.println();
        printWriter.close();
    }
}
