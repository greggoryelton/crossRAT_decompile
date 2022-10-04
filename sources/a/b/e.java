package a.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: hmar6.jar:a/b/e.class */
public final class e extends h {

    /* renamed from: a */
    private File f13a;

    /* renamed from: b */
    private String f14b;

    public e(String str, String str2) {
        this(new File(str), str2);
    }

    private e(File file, String str) {
        this.f13a = file;
        this.f14b = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.lang.Exception] */
    @Override // a.b.h
    public final boolean a() {
        String readLine;
        ?? exists = this.f13a.exists();
        if (exists != 0) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f13a)));
                do {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return false;
                    }
                } while (!readLine.toLowerCase().contains(this.f14b.toLowerCase()));
                bufferedReader.close();
                return true;
            } catch (Exception e) {
                exists.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
