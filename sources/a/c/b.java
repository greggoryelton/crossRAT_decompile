package a.c;

import a.d;
import java.io.Serializable;

/* loaded from: hmar6.jar:a/c/b.class */
public final class b extends d implements Serializable {

    /* renamed from: a */
    private c f19a;

    public b() {
        this(c.d());
    }

    private b(c cVar, a.b bVar) {
        super(a.c.MACOS, bVar);
        this.f19a = cVar;
    }

    private b(c cVar) {
        this(cVar, a.b.get_OS_architecture());
    }

    @Override // a.a
    public final String b() {
        String str = this.f19a.c() ? "Mac OS X" : "macOS";
        if (this.f19a != null) {
            if (this.f19a.a() != null) {
                str = String.valueOf(str) + " " + this.f19a.a();
            }
            if (this.f19a.b() != null) {
                str = String.valueOf(str) + " " + this.f19a.b();
            }
        }
        return str;
    }

    @Override // a.d, a.a
    public final String c() {
        return b();
    }
}
