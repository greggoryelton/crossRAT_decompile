package a;

/* loaded from: hmar6.jar:a/b.class */
public enum b {
    x86("x86", "i386", "i486", "i586", "i686"),
    x86_64("x86_64", "amd64", "k8"),
    ARM("ARM"),
    UNKNOWN("Unknown");
    
    private String[] e;

    b(String... strArr) {
        this.e = strArr;
    }

    // getmethod to return what type of OS architecture the target is running
    /* renamed from: a */
    public static b get_OS_architecture() {
        b[] valuesCustom;
        String property = System.getProperty("os.arch");
        for (b bVar : valuesCustom()) {
            for (String str : bVar.e) {
                if (property.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
        }
        return UNKNOWN;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArr = new b[4];
        System.arraycopy(values(), 0, bVarArr, 0, 4);
        return bVarArr;
    }
}
