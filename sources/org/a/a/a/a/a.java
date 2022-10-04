package org.a.a.a.a;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: hmar6.jar:org/a/a/a/a/a.class */
public final class a extends Writer implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f42a;

    public a() {
        this.f42a = new StringBuilder();
    }

    public a(int i) {
        this.f42a = new StringBuilder(4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* renamed from: append */
    public final Writer mo7append(char c) {
        this.f42a.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* renamed from: append */
    public final Writer mo9append(CharSequence charSequence) {
        this.f42a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* renamed from: append */
    public final Writer mo8append(CharSequence charSequence, int i, int i2) {
        this.f42a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f42a.append(str);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f42a.append(cArr, i, i2);
        }
    }

    public final String toString() {
        return this.f42a.toString();
    }
}
