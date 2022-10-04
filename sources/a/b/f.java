package a.b;

import java.io.File;

/* loaded from: hmar6.jar:a/b/f.class */
public final class f extends h {

    /* renamed from: a  reason: collision with root package name */
    private File f15a;

    public f(String str) {
        this(new File(str));
    }

    private f(File file) {
        this.f15a = file;
    }

    @Override // a.b.h
    public final boolean a() {
        return this.f15a.exists();
    }
}
