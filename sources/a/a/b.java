package a.a;

import crossrat.e;

/* loaded from: hmar6.jar:a/a/b.class */
public enum b {
    FREEBS("FreeBSD", new String[0]),
    OPENBSD("OpenBSD", new String[0]),
    NETBSD("NetBSD", new String[0]),
    DRAGONFLYBSD("DragonFlyBSD", "DragonFly"),
    UNKNOWN("Unknown BSD", "BSD");
    
    private String f;
    private String[] g;

    b(String str, String... strArr) {
        this.f = str;
        this.g = strArr;
    }

    public final String a() {
        return this.f;
    }

    public static b a(String str) {
        b[] valuesCustom;
        for (b bVar : valuesCustom()) {
            if (bVar.f.toLowerCase().contains(str.toLowerCase())) {
                return bVar;
            }
            for (String str2 : bVar.g) {
                if (str2.toLowerCase().contains(str.toLowerCase())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public static b b() {
        return e.a(true);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArr = new b[5];
        System.arraycopy(values(), 0, bVarArr, 0, 5);
        return bVarArr;
    }
}
