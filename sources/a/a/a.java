package a.a;

import a.c;
import a.d;
import java.io.Serializable;

/* loaded from: hmar6.jar:a/a/a.class */
public final class a extends d implements Serializable {

    /* renamed from: a */
    private b f1a;

    private a(b bVar, a.b bVar2) {
        super(c.BSD, bVar2);
        this.f1a = bVar;
    }

    public a() {
        this(b.b(), a.b.get_OS_architecture());
    }

    public a(b bVar) {
        this(bVar, a.b.get_OS_architecture());
    }

    @Override // a.a
    public final String b() {
        return this.f1a.a();
    }
}
