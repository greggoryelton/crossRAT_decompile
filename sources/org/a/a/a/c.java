package org.a.a.a;

import java.io.File;
import java.io.FileFilter;

/* loaded from: hmar6.jar:org/a/a/a/c.class */
final class c implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ File f45a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(File file) {
        this.f45a = file;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.equals(this.f45a);
    }
}
