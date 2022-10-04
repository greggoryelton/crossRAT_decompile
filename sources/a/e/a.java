package a.e;

import a.c;
import java.io.Serializable;

/* loaded from: hmar6.jar:a/e/a.class */
public final class a extends a.a implements Serializable {

    /* renamed from: a */
    private b f23a;

    public a() {
        this(b.b(), a.b.get_OS_architecture());
    }

    private a(b bVar, a.b bVar2) {
        super(c.WINDOWS, bVar2);
        this.f23a = bVar;
    }

    @Override // a.a
    public final String b() {
        return this.f23a.a();
    }

    @Override // a.a
    public final String c() {
        return this.f23a.a();
    }
}
