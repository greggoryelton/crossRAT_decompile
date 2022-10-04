package a;

import java.io.Serializable;

/* loaded from: hmar6.jar:a/a.class */
public abstract class a implements Serializable {

    /* renamed from: a */
    private c f0a;

    public a(c cVar, b bVar) {
        this.f0a = cVar;
    }

    public final c a() {
        return this.f0a;
    }

    public abstract String b();

    public abstract String c();

    public final boolean d() {
        return this.f0a == c.BSD || this.f0a == c.MACOS || this.f0a == c.LINUX || this.f0a == c.SOLARIS;
    }
}
