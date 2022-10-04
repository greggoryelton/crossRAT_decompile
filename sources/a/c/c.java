package a.c;

// This class does some OS X enumeration
/* loaded from: hmar6.jar:a/c/c.class */
public enum c {
    CHEETAH("Cheetah", "10.0", true),
    PUMA("Puma", "10.1", true),
    JAGUAR("Jaguar", "10.2", true),
    PANTHER("Panther", "10.3", true),
    TIGER("Tiger", "10.4", true),
    LEOPARD("Leopard", "10.5", true),
    SNOW_LEOPARD("Snow Leopard", "10.6", true),
    LION("Lion", "10.7", true),
    MOUNTAIN_LION("Mountain Lion", "10.8", true),
    MAVERICKS("Mavericks", "10.9", true),
    YOSEMITE("Yosemite", "10.10", true),
    EL_CAPITAN("El Capitan", "10.11", true),
    SIERRA("Sierra", "10.12");
    
    private String n;
    private String o;
    private boolean p;

    c(String str, String str2) {
        this(str, str2, false);
    }

    c(String str, String str2, boolean z) {
        this.n = str;
        this.o = str2;
        this.p = z;
    }

    public final String a() {
        return this.n;
    }

    public final String b() {
        return this.o;
    }

    public final boolean c() {
        return this.p;
    }

    public static c d() {
        c[] valuesCustom;
        String property = System.getProperty("os.version");
        for (c cVar : valuesCustom()) {
            if (property.startsWith(cVar.o) || cVar.n.toLowerCase().contains(property.toLowerCase())) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] cVarArr = new c[13];
        System.arraycopy(values(), 0, cVarArr, 0, 13);
        return cVarArr;
    }
}
