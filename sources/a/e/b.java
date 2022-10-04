package a.e;

// This class does Windows OS enumeration
/* loaded from: hmar6.jar:a/e/b.class */
public enum b {
    UNKNOWN("Unknown Windows"),
    WIN2000("Windows 2000"),
    WINXP("Windows XP"),
    WINSERVER2003("Windows 2003"),
    WINVISTA("Windows Vista"),
    WINSERVER2008("Windows Server 2008"),
    WIN7("Windows 7"),
    WIN81("Windows 8.1"),
    WIN8("Windows 8"),
    WINSERVER2012("Windows Server 2012"),
    WIN10("Windows 10");
    
    private String l;

    b(String str) {
        this.l = str;
    }

    public final String a() {
        return this.l;
    }

    public static b b() {
        b[] valuesCustom;
        String property = System.getProperty("os.name");
        for (b bVar : valuesCustom()) {
            if (bVar != UNKNOWN && bVar.l.equalsIgnoreCase(property)) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArr = new b[11];
        System.arraycopy(values(), 0, bVarArr, 0, 11);
        return bVarArr;
    }
}
