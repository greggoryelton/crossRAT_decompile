package a.b;

import java.io.Serializable;

/* loaded from: hmar6.jar:a/b/g.class */
public final class g extends a.d implements Serializable {

    /* renamed from: a */
    private d f16a;

    private g(d dVar, a.b bVar) {
        super(a.c.LINUX, bVar);
        this.f16a = dVar;
    }

    public g() {
        this(c.d(), a.b.get_OS_architecture());
    }

    public g(d dVar) {
        this(dVar, a.b.get_OS_architecture());
    }

    @Override // a.a
    public final String b() {
        String c = this.f16a.a().c();
        if (this.f16a.b() != null) {
            c = String.valueOf(c) + " " + this.f16a.b();
        }
        return c;
    }
}
