package a;

/* loaded from: hmar6.jar:a/d.class */
public abstract class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private String f22a;

    public d(c cVar, b bVar) {
        super(cVar, bVar);
    }

    @Override // a.a
    public String c() {
        return this.f22a == null ? b() : this.f22a;
    }

    public final void a(String str) {
        this.f22a = str;
    }
}
