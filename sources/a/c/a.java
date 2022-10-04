package a.c;

import crossrat.e;
import java.io.File;
import java.util.Iterator;

/* loaded from: hmar6.jar:a/c/a.class */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public static boolean a(boolean z) {
        Iterator it;
        ?? file = new File("/usr/bin/sw_vers");
        try {
            it = e.a((File) file).iterator();
        } catch (Exception e) {
            file.printStackTrace();
        }
        do {
            file = it.hasNext();
            if (file == 0) {
                if (!z) {
                    return false;
                }
                String lowerCase = System.getProperty("os.name").toLowerCase();
                return lowerCase.contains("mac os x") || lowerCase.contains("macos");
            }
        } while (!((String) it.next()).contains(a.c.MACOS.a()));
        return true;
    }
}
