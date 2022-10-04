package a.d;

import a.b;
import a.c;
import a.d;
import java.io.Serializable;

/* loaded from: hmar6.jar:a/d/a.class */
public final class a extends d implements Serializable {
    public a() {
        this(b.get_OS_architecture());
    }

    private a(b bVar) {
        super(c.SOLARIS, bVar);
    }

    @Override // a.a
    public final String b() {
        return "Solaris";
    }
}
