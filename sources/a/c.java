package a;

import a.b.g;

/* loaded from: hmar6.jar:a/c.class */
public enum c {
    WINDOWS("Windows", "win"),
    MACOS("macOS", "mac"),
    LINUX("Linux", "linux", "BSD", "Solaris", "solaris", "sunos"),
    SOLARIS("Solaris", "solaris", "sunos"),
    BSD("BSD", new String[0]),
    UNKNOWN("unknown", "unknown");
    
    private static a g;
    private String h;
    private String[] i;

    c(String str, String... strArr) {
        this.h = str;
        this.i = strArr;
    }

    public final String a() {
        return this.h;
    }

    public static a b() {
        boolean z;
        a.a.a aVar = null;
        if (g == null) {
            a.a.b a2 = crossrat.e.a(true);
            if (a2 != null) {
                aVar = new a.a.a(a2);
            }
            if (1 != 0 ? System.getProperty("os.name").toLowerCase().contains(LINUX.i[0]) : false) {
                aVar = new g(crossrat.e.d());
            }
            if (a.c.a.a(true)) {
                aVar = new a.c.b();
            }
            if (1 != 0 ? System.getProperty("os.name").toLowerCase().contains(WINDOWS.i[0]) : false) {
                aVar = new a.e.a();
            }
            if (1 != 0) {
                for (String str : SOLARIS.i) {
                    if (System.getProperty("os.name").toLowerCase().contains(str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                aVar = new a.d.a();
            }
            if (aVar == null) {
                aVar = new e();
            }
            if (aVar instanceof d) {
                ((d) aVar).a(crossrat.e.c());
            }
            g = aVar;
        } else {
            aVar = g;
        }
        return aVar;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] cVarArr = new c[6];
        System.arraycopy(values(), 0, cVarArr, 0, 6);
        return cVarArr;
    }
}
